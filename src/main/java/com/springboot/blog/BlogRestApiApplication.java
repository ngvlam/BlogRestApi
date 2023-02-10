package com.springboot.blog;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "Spring Boot Blog REST API",
//        version = "2.0",
//        description = "Spring Boot Blog REST APIs documentation", contact = @Contact(name = "Nguyen Van Lam", email = "nvlam@gmail.com"),
//        termsOfService = "Terms of service",
//        license = @License(name = "API license URL")
//        ))
public class BlogRestApiApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(BlogRestApiApplication.class, args);
    }

}
