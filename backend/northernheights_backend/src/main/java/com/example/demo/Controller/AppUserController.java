package com.example.demo.Controller;

import com.example.demo.Entity.AppUser;
import com.example.demo.Entity.Project;
import com.example.demo.Repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@Controller
public class AppUserController {
    @Autowired
    private AppUserRepository appUserRepository;
    @PostMapping("/saveUsers")
    public ResponseEntity<String> saveUsers(@RequestBody List<AppUser> userData){
        appUserRepository.saveAll(userData);
        return ResponseEntity.ok("Data saved");
    }

    @PostMapping("/saveUser")
    public ResponseEntity<AppUser> saveUser(@RequestBody AppUser userData){
        AppUser savedUser = appUserRepository.save(userData);
        return ResponseEntity.status(HttpStatus.CREATED).body(userData);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<AppUser>> getUsers(){
        return ResponseEntity.ok(appUserRepository.findAll());
    }

    @GetMapping("/getUser/{username}")
    public ResponseEntity<AppUser> getUser(@PathVariable(value="username") final String username){
        AppUser user = appUserRepository.getAppUserByUsername(username);

        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
}

