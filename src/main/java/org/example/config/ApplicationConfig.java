package org.example.config;

import org.example.Cheating;
import org.example.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public Student student(){
        System.out.println("Inside configuration class Student Bean");
        return new Student();
    }
    @Bean
    public Cheating Cheat(){
        System.out.println("Inside configuration class Cheat Bean");
        return new Cheating();
    }

}
