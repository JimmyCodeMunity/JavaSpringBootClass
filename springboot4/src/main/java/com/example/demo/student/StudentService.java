package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
public class StudentService {
    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        23L,
                        "Jimmy",
                        "jameswafula2002@gmail.com",
                        LocalDate.of(2002, Month.MARCH, 8),
                        22
                )
        );
    }

}
