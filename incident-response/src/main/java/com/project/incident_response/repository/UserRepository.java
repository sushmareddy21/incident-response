package com.project.incident_response.repository;


import com.project.incident_response.model.User ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
