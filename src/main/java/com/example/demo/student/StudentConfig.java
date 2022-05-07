package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jasmine = new Student(
                    "Jasmine",
                    "test@test.com",
                    LocalDate.of(1999, Month.MARCH, 22),
                    23
            );

            Student alex = new Student(
                    "Alex",
                    "alex@test.com",
                    LocalDate.of(1998, Month.MARCH, 22),
                    24
            );

            // save all students to students table
            repository.saveAll(
                    Arrays.asList(jasmine, alex)
            );
        };
    }
}
