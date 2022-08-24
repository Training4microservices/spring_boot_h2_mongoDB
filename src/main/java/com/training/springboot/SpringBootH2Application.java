package com.training.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SpringBootH2Application {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootH2Application.class, args);
  }

}
