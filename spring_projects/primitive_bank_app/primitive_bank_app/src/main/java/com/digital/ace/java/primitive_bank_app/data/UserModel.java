package com.digital.ace.java.primitive_bank_app.data;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

@Entity
@Table(name="users")

public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name="UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(updatable = false, nullable = false)

    // Class Attributes for User Model Class
    private String id;
    private String username;
    private String password;
    private String email;
    private Boolean enabled = true;
    private Boolean locked = false;
    private Boolean expired = false;

    

}
