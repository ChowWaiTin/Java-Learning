package com.digital.ace.java.primitive_bank_app.data;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.digital.ace.java.primitive_bank_app.config.AppParameterReader;
import com.digital.ace.java.primitive_bank_app.repository.UserRepository;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
// This class is used to populate the database by reading from CSV file
public class PopulateData {

    @Bean
    public CommandLineRunner populate(AppParameterReader appParameterReader, UserRepository userRepository ){

        return args -> {

            // Create an object of file reader
            // class with CSV file as a parameter.
            FileReader csvFile = new FileReader(appParameterReader.getUserImportFile());

            // create csvReader object and skip first singleRecord
            CSVReader csvReader = new CSVReaderBuilder(csvFile).withSkipLines(1).build();

            
            // Use CSVReader method, readALL() to read all data at once
            List<String[]> allRecords = csvReader.readAll();
            
            Iterator<String[]> iterator = allRecords.iterator();
            
            while (iterator.hasNext()) {
                String[] singleRecord = iterator.next();

                UserModel user = new UserModel();

                user.setId(singleRecord[0]);
                user.setUsername(singleRecord[1]);
                user.setPassword(singleRecord[2]);
                user.setEmail(singleRecord[3]);

                userRepository.save(user);
                log.info(user.toString());
            }

            // Print CSVData on Terminal
            // for (String[] row : allData) {
            //     for (String cell : row) {
            //         System.out.print(cell + "\t");
            //     }
            //     System.out.println();
            // }
            
            // IMPORTANT: Use close() method to avoid memory leak
            csvReader.close();

        };

        

        
    }

    @Bean
    public AppParameterReader createAppParameterReader() {
        return new AppParameterReader();
    }
}
