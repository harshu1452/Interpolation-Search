package turing.example.interpolationsearch.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test class for SearchService.
 * Ensures correctness of the interpolation search algorithm implementation.
 */
class SearchServiceTest {

    // Creating an instance of SearchService to test its methods.
    private final SearchService searchService = new SearchService();

    /**
     * Tests interpolation search when the element is found in various positions:
     * - Middle of the array
     * - First element
     * - Last element
     */
    @Test
    void testInterpolationSearchElementFound() {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        assertEquals(3, searchService.interpolationSearch(sortedArray, 40));  // Middle element
        assertEquals(0, searchService.interpolationSearch(sortedArray, 10));  // First element
        assertEquals(9, searchService.interpolationSearch(sortedArray, 100)); // Last element
    }

    /**
     * Tests interpolation search when the element is NOT present:
     * - A number between existing elements
     * - A number beyond the highest value in the array
     */
    @Test
    void testInterpolationSearchElementNotFound() {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        assertEquals(-1, searchService.interpolationSearch(sortedArray, 25));  // Between elements
        assertEquals(-1, searchService.interpolationSearch(sortedArray, 110)); // Beyond range
    }

    /**
     * Tests search operation on an empty array.
     * The expected result is -1 since no elements exist.
     */
    @Test
    void testInterpolationSearchWithEmptyArray() {
        int[] emptyArray = {};
        assertEquals(-1, searchService.interpolationSearch(emptyArray, 50));  // Empty case
    }

    /**
     * Tests search operation on an array containing a single element.
     * - Ensures that if the element exists, it's found at index 0.
     * - Ensures that searching for a missing element returns -1.
     */
    @Test
    void testInterpolationSearchWithSingleElementArray() {
        int[] singleElementArray = {42};

        assertEquals(0, searchService.interpolationSearch(singleElementArray, 42)); // Found
        assertEquals(-1, searchService.interpolationSearch(singleElementArray, 10)); // Not found
    }

    /**
     * Tests interpolation search with an array containing negative numbers.
     * - Checks if negative numbers are correctly found.
     * - Ensures a missing negative number returns -1.
     */
    @Test
    void testInterpolationSearchWithNegativeNumbers() {
        int[] negativeArray = {-50, -40, -30, -20, -10, 0, 10, 20};

        assertEquals(4, searchService.interpolationSearch(negativeArray, -10)); // Found
        assertEquals(-1, searchService.interpolationSearch(negativeArray, -60)); // Not found
    }

    /**
     * Tests interpolation search with duplicate elements.
     * - Ensures that any valid index of the duplicate value is acceptable.
     */
    @Test
    void testInterpolationSearchWithDuplicateElements() {
        int[] duplicateArray = {10, 20, 20, 20, 30, 40, 50};

        int result = searchService.interpolationSearch(duplicateArray, 20);
        assertTrue(result == 1 || result == 2 || result == 3); // Any valid index is acceptable
    }

    /**
     * Tests interpolation search with a value that is out of the array's bounds.
     * - Ensures that searching for a number lower than the smallest value returns -1.
     */
    @Test
    void testInterpolationSearchWithOutOfBoundsPosition() {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        assertEquals(-1, searchService.interpolationSearch(sortedArray, 5)); // Below lower bound
    }

    /**
     * Tests interpolation search when low and high indices are equal.
     * - Ensures that the single element is found correctly.
     * - Ensures that searching for a missing element returns -1.
     */
    @Test
    void testInterpolationSearchWithLowEqualsHigh() {
        int[] singleElementArray = {50};
        assertEquals(0, searchService.interpolationSearch(singleElementArray, 50)); // Single element found
        assertEquals(-1, searchService.interpolationSearch(singleElementArray, 100)); // Single element not found
    }
}
