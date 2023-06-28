package com.digital.ace.java.primitive_bank_app.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;

@Getter
@PropertySource("classpath:primitiveBank.properties")
@Component
public class AppParameterReader {
    
    @Value("${app.primitiveBank.csv.main.import.flag}")
    private Boolean mainImportFlag;    

    @Value("${app.primitiveBank.csv.user.import.flag}")
    private Boolean userImportFlag;
    
    @Value("${app.primitiveBank.csv.user.input.file}")
    private String userImportFile;
}
