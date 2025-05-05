package turing.example.interpolationsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to start the Interpolation Search API.
 * This class serves as the entry point for the Spring Boot application.
 */
@SpringBootApplication // Marks this class as a Spring Boot application
public class InterpolationSearchApplication {

    /**
     * The main method to start the Spring Boot application.
     * @param args Command-line arguments passed during application startup.
     */
    public static void main(String[] args) {
        SpringApplication.run(InterpolationSearchApplication.class, args); // Bootstraps the application
    }
}
