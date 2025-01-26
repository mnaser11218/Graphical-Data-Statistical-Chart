package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Project {
    @Id
    @Column(name="project_id")
    private Long id;
    private String projectDescription;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_project_id", referencedColumnName = "project_id")
    private List<JsonObject>project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_user_id", referencedColumnName = "user_id")
    private AppUser appUser;

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public List<JsonObject> getProject() {
        return project;
    }

    public void setProject(List<JsonObject> project) {
        this.project = project;
    }


}


