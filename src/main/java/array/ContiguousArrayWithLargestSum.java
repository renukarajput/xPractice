package array;

import java.util.ArrayList;
import java.util.List;

public class ContiguousArrayWithLargestSum {
    // -2, 1, -3, 4, -1, 2, 1, -5, 4
//      8, -7, -3, 5, 6, -2, 3, -4, 2
    void print(int[] arr) {
        int sum = 0, end = 0, start = 0;
        int maxSumSoFar = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i] + sum;
            result.add(arr[i]);
            if (maxSumSoFar < sum) {
                maxSumSoFar = sum;
                end = i;
            }
            if (sum <= 0) {
                sum = 0;
                start = i + 1;
                result.clear();
            }
        }
//        result.remove(result.size()-1); Jugaad
        System.out.println("**** " + result + "-> " + maxSumSoFar);
        System.out.println("&&&& " + start + "-> " + end);
    }
}
