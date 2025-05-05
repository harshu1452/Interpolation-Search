package turing.example.interpolationsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import turing.example.interpolationsearch.service.SearchService;

/**
 * REST Controller for Interpolation Search API.
 */
@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    /**
     * Searches for a key in a predefined sorted array.
     *
     * @param key The number to search.
     * @return A success message with index or an error message.
     */
    @GetMapping("/interpolation")
    public String search(@RequestParam int key) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int result = searchService.interpolationSearch(sortedArray, key);

        return (result != -1) ? "Element found at index: " + result : "Element not found";
    }
}
