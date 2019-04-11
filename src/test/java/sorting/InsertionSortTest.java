package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class InsertionSortTest {
    InsertionSort insertionSort = new InsertionSort();

    @Test
    public void input_1() {
        int[] input = {5, 3, 1, 4, 2};
        int[] output = {1, 2, 3, 4, 5};
        insertionSort.fasterVersion(input);
        System.out.println(Arrays.toString(input));
        assertEquals(Arrays.toString(input), Arrays.toString(output));
    }

    @Test
    public void input_2() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] output = {11, 12, 22, 25, 34, 64, 90};
        insertionSort.sort(input);
        System.out.println(Arrays.toString(input));
        assertEquals(Arrays.toString(input), Arrays.toString(output));
    }
    @Test
    public void input_3() {
        int[] input = {4,1,3,5};
        int[] output = {1,3,4,5};
        insertionSort.sort(input);
        System.out.println(Arrays.toString(input));
        assertEquals(Arrays.toString(input), Arrays.toString(output));
    }
}