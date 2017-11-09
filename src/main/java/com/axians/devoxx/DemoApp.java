package com.axians.devoxx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.net.UnknownHostException;

@SpringBootApplication
public class DemoApp {

    @Bean
    WebMvcConfigurerAdapter getWebMvcConfigurerAdapter() {
        return new WebMvcConfigurerAdapter() {

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("").setViewName("redirect:/presentation.html");
                registry.addViewController("/index.html").setViewName("redirect:/presentation.html");
            }
        };
    }

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(DemoApp.class);
        app.run(args);
    }

}
