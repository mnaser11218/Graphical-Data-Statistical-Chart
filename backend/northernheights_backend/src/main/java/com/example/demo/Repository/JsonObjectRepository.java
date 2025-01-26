package com.example.demo.Repository;

import com.example.demo.Entity.JsonObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JsonObjectRepository extends JpaRepository<JsonObject, Long> {
}
