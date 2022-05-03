package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student") //defines the route for the student api
public class StudentController {

    //GetMapping means this method is using GET request
    @GetMapping
    public List<Student> getStudents(){
        return Arrays.asList(new Student(1L, "Jasmine", "test@test.com", LocalDate.of(1999, Month.MARCH, 22), 23));
    }

}
