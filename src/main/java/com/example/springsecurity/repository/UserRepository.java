package com.example.springsecurity.repository;

import com.example.springsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
