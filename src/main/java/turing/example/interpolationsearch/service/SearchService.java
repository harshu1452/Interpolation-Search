package turing.example.interpolationsearch.service;

import org.springframework.stereotype.Service;

/**
 * Service to perform Interpolation Search on a sorted array.
 */
@Service
public class SearchService {

    /**
     * Performs Interpolation Search on a sorted array.
     *
     * @param arr The sorted input array.
     * @param key The target element to search for.
     * @return The index of the element if found, otherwise -1.
     */
    public int interpolationSearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
            if (low == high) {
                return (arr[low] == key) ? low : -1;
            }

            // Estimate position
            int pos = low + ((key - arr[low]) * (high - low) / (arr[high] - arr[low]));

            if (arr[pos] == key) return pos;
            if (arr[pos] < key) low = pos + 1;
            else high = pos - 1;
        }
        return -1;
    }
}
