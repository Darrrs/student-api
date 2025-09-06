package com.example.First;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	// @GetMapping
	// public List<Student>  Hello(){
	// 	return List.of(
	// 		new Student(1L, "Vishnu", "darrs@gmail.com", LocalDate.of(2002, 8, 15), 21)
	// 	);
	// }
}
