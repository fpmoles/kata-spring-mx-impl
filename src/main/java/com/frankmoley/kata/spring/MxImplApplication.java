package com.frankmoley.kata.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MxImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(MxImplApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(SGWorkMaster workMaster) {
        return args -> {workMaster.doWork();};
    }

}
