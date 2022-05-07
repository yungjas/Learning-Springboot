package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

// Service layer contains the business logic

@Service //Info on Service annotation: https://www.tutorialspoint.com/spring_boot/spring_boot_service_components.htm
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // grab all students from database
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}
