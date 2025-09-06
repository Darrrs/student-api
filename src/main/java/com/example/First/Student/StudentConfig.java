package com.example.First.Student;

import java.time.LocalDate;
import java.util.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository StudentRepository){
        return args->{
            Student vishnu= new Student(
                "Vishnu",
                "darrs@gmail.com", 
                LocalDate.of(2002, 5, 7)
                );
            Student Darahas= new Student(
            "Darahas",
            "Darahas@gmail.com", 
            LocalDate.of(2003, 5, 7)
            );
            Student Reddy= new Student(
            "Reddy",
            "Reddy@gmail.com", 
            LocalDate.of(2004, 5, 7)
            );

            StudentRepository.saveAll(
                List.of(vishnu, Darahas, Reddy)
            );
        };
    }
}
