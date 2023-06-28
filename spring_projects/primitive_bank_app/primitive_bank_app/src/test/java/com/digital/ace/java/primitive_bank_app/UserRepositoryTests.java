package com.digital.ace.java.primitive_bank_app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import com.digital.ace.java.primitive_bank_app.data.UserModel;
import com.digital.ace.java.primitive_bank_app.repository.UserRepository;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j

@SpringBootTest

public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testCreateUser() {
        UserModel user = new UserModel();
        user.setUsername("John Lim");
        user.setPassword("password123");
        user.setEmail("abc@java.com");

        UserModel savedUser = userRepository.save(user);
        log.info("User Test Creation >>>" + savedUser);
    }
}
