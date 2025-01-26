package com.example.demo.Repository;

import com.example.demo.Entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    @Query(value="select * from app_user where username= ?1", nativeQuery = true)
    AppUser getAppUserByUsername(String username);
}
