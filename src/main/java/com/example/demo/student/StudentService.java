package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

// Service layer contains the business logic
public class StudentService {
    public List<Student> getStudents(){
        return Arrays.asList(new Student(1L, "Jasmine", "test@test.com", LocalDate.of(1999, Month.MARCH, 22), 23));
    }
}
