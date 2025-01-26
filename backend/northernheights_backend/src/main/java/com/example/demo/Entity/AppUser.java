package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class AppUser {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="user_id")
   private Long id;
   private String firstname;
   private String lastname;
   private String username;
   private String password;

//   @OneToMany(cascade = CascadeType.ALL)
//   @JoinColumn(name="fk_user_id", referencedColumnName = "user_id")
//   private List<Project> projects;


   // by default itll create a foreign key : object_obj_id
//   @JoinColumn(name="fk_obj_id")
//   @OneToOne(cascade = CascadeType.ALL)

//   public List<Project> getProjects() {
//      return projects;
//   }
//
//   public void setProjects(List<Project> projects) {
//      this.projects = projects;
//   }
//   private JsonObject obj;

//   public JsonObject getObj() {
//      return obj;
//   }
//
//   public void setObj(JsonObject obj) {
//      this.obj = obj;
//   }


   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstname() {
      return firstname;
   }

   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }

   public String getLastname() {
      return lastname;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }
}
