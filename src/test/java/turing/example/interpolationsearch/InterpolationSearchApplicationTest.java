package turing.example.interpolationsearch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Test class for InterpolationSearchApplication.
 * Ensures that the Spring Boot application starts correctly.
 */
@SpringBootTest
class InterpolationSearchApplicationTest {

    /**
     * Verifies that the Spring Boot application context loads without issues.
     * If this test fails, there may be configuration problems in the application.
     */
    @Test
    void contextLoads() {
        // Ensures Spring Boot context loads successfully
    }

    /**
     * Tests the main method to ensure it executes without exceptions.
     * Helps achieve 100% test coverage by explicitly invoking the main method.
     */
    @Test
    void testMainMethod() {
        // Calls the main method explicitly to achieve 100% coverage
        InterpolationSearchApplication.main(new String[]{});
    }
}
