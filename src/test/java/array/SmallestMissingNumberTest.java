package array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

//Given sorted array
public class SmallestMissingNumberTest {
    SmallestMissingNumber smallestMissingNumber = new SmallestMissingNumber();

    @Test
    public void find_1() {
        int[] arr = {0, 1, 2, 6, 9};
        assertEquals(3, smallestMissingNumber.find(arr, 10));
    }

    @Test
    public void find_2() {
        int[] arr = {4, 5, 10, 11};
        assertEquals(0, smallestMissingNumber.find(arr, 12));
    }

    @Test
    public void find_3() {
        int[] arr = {0, 1, 2, 3};
        assertEquals(4, smallestMissingNumber.find(arr, 5));
    }

    @Test
    public void find_4() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        assertEquals(8, smallestMissingNumber.find(arr, 11));
    }

    @Test
    public void find_5() {
        int[] arr = {0, 1, 2, 3, 9, 13, 15, 18, 19};
        assertEquals(4, smallestMissingNumber.find(arr, 20));
    }
}