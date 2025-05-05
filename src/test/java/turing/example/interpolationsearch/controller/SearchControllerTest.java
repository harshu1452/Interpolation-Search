package turing.example.interpolationsearch.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import turing.example.interpolationsearch.service.SearchService;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test class for SearchController.
 * Uses Mockito for mocking dependencies.
 */
class SearchControllerTest {

    @Mock
    private SearchService searchService; // Mocking the SearchService dependency

    @InjectMocks
    private SearchController searchController; // Injecting mocks into SearchController

    /**
     * Constructor initializes Mockito annotations.
     * This sets up the mock objects before running tests.
     */
    public SearchControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Test case to verify the behavior when the searched element is found.
     * Mocks the SearchService to return a valid index.
     */
    @Test
    void testSearchElementFound() {
        when(searchService.interpolationSearch(any(), eq(40))).thenReturn(3); // Mocking search behavior
        String response = searchController.search(40);
        assertEquals("Element found at index: 3", response); // Validating expected output
    }

    /**
     * Test case to verify the behavior when the searched element is not found.
     * Mocks the SearchService to return -1, indicating element is not found.
     */
    @Test
    void testSearchElementNotFound() {
        when(searchService.interpolationSearch(any(), eq(25))).thenReturn(-1); // Mocking search failure
        String response = searchController.search(25);
        assertEquals("Element not found", response); // Validating expected output
    }
}
