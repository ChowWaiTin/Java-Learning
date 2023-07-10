package com.ioc.example.learningIOC.data;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Car {
    
    private String name;
    private String model;
    private String color;
}
