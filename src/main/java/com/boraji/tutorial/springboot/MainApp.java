package com.boraji.tutorial.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan({"com.piyush","com.boraji"})
@EntityScan("com.piyush.springboot.entity")
@EnableScheduling
@SpringBootApplication
public class MainApp {
   public static void main(String[] args) {
      SpringApplication.run(MainApp.class, args);
   }
}
