package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
//@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping
//	public String hello(){
//		return "hello springboot";
//	}


//	public List <String> hello(){
//		return List.of("Jimmy","Dev");
//	}

//	public List <Student> getStudents(){
//		return List.of(
//				new Student(
//						1L,
//						"Maisy",
//						"maisy@gmail.com",
//						LocalDate.of(2002, Month.MARCH, 5),
//						21
//				)
//		);
//	}

}
