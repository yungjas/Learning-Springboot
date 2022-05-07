// StudentRepository is responsible for accessing the database

package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository takes in the entity you want to work with, in this case Student
// JpaRepository also takes in the type of the id, in this case the Student Id is a long type
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
