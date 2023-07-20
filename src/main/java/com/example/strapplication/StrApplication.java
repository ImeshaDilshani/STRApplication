package com.example.strapplication;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// The StrApplication class is the entry point of the Spring Boot application.
public class StrApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrApplication.class, args);
    }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
