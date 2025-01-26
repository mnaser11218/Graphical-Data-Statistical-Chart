package com.example.demo.Controller;

import com.example.demo.Entity.Project;
import com.example.demo.Repository.ProjectRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@Controller
public class ProjectController {
    private ProjectRepository projectRepository;
    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping("/getProjects")
    public ResponseEntity<List<Project>>getProjects(){
       return  ResponseEntity.ok(projectRepository.findAll());
    }

    @GetMapping("/getProject/{id}")
    public ResponseEntity<Project> getProject(@PathVariable(value = "id") final Long id){
        Optional<Project> project = projectRepository.findById(id);
        return project.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }




    @PostMapping("/saveProjects")
    public ResponseEntity<Project> saveProjects(@RequestBody Project project) {
        Project savedProject = projectRepository.save(project);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedProject);
    }

}
