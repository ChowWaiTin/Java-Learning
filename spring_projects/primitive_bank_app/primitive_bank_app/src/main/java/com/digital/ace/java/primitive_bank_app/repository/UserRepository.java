package com.digital.ace.java.primitive_bank_app.repository;

import org.springframework.stereotype.Repository;

import com.digital.ace.java.primitive_bank_app.data.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository // Allows UserRepository class to handle CRUD database operations
public interface UserRepository extends JpaRepository<UserModel, String> {
    
}
