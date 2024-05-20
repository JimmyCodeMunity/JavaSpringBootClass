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

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



//	public String hello(){
//		return "<h1>Java Springboot</h1>";
//	}

//	public List<String> hello(){
//		return List.of("Spring","Boot");
//
//	}


//	public List<Student> getStudents(){
//		return List.of(
//				new Student(
//						23L,
//						"Jimmy",
//						"jameswafula2002@gmail.com",
//						LocalDate.of(2002, Month.MARCH, 8),
//						22
//				)
//		);
//	}
}
