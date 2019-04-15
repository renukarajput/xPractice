package common;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void search_1() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        assertEquals(4, binarySearch.search(arr, 4));
    }

    @Test
    public void search_2() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        assertEquals(-1, binarySearch.search(arr, 7));
    }

    @Test
    public void search_3() {
        int arr[] = {11, 21, 30, 43, 59, 62};
        assertEquals(62, binarySearch.search(arr, 62));
    }
}