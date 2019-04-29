package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContiguousArrayWithLargestSumTest {
    ContiguousArrayWithLargestSum contiguousArrayWithLargestSum = new ContiguousArrayWithLargestSum();

    // 4 -1 2 1
    @Test
    public void print_1() {
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        contiguousArrayWithLargestSum.print(input);
    }

    // 5, 6,-2, 3
    @Test
    public void print_2() {
        int[] input = {8, -7, -3, 5, 6, -2, 3, -4, 2};
        contiguousArrayWithLargestSum.print(input);
    }

    @Test
    public void print_3() {
        int[] input = {8, -7, 10, 5, -6, -2, 3, -4, -2};
        contiguousArrayWithLargestSum.print(input);
    }
}