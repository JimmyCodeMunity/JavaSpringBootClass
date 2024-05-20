package com.example.demo.student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Maisy",
                        "maisy@gmail.com",
                        LocalDate.of(2002, Month.MARCH, 5),
                        21
                )
        );
    }

}
