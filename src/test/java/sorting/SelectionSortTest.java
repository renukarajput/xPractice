package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectionSortTest {
    SelectionSort selectionSort = new SelectionSort();

    @Test
    public void sort() {
        int[] input = {5, 3, 1, 4, 2};
        int[] output = {1, 2, 3, 4, 5};
        selectionSort.sort(input);
        System.out.println(Arrays.toString(input));
        assertEquals(Arrays.toString(input), Arrays.toString(output));
    }
}