package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void sort_1() {
        int[] input = {5, 3, 1, 4, 2};
        int[] output = {1, 2, 3, 4, 5};
        bubbleSort.sort(input);
        assertEquals(Arrays.toString(input), Arrays.toString(output));
    }

    @Test
    public void sort_2() {
        int[] input = {5, 4, 3, 2, 1};
        int[] output = {1, 2, 3, 4, 5};
        bubbleSort.sort(input);
        assertEquals(Arrays.toString(input), Arrays.toString(output));
    }

    @Test
    public void sort_3() {
        int[] input = {5, 1, 2, 3, 4};
        int[] output = {1, 2, 3, 4, 5};
        bubbleSort.sort(input);
        assertEquals(Arrays.toString(input), Arrays.toString(output));
    }

    @Test
    public void sort_4() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] output = {11, 12, 22, 25, 34, 64, 90};
        bubbleSort.sort(input);
        assertEquals(Arrays.toString(input), Arrays.toString(output));}
}