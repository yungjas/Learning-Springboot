package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student") //defines the route for the student api
public class StudentController {

    private final StudentService studentService;

    @Autowired //auto inits StudentService for us, without this we need to init StudentService ourselves when we init the StudentController
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //GetMapping means this method is using GET request
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

}
