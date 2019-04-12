package array;

public class SmallestMissingNumber {
    // 1 2 3 5
    public int find(int[] input, int maxRange) {
        int start = 0;
        int end = input.length - 1;
        for (int i = 0; i < maxRange - 1; i++) {
            int mid = start + (end - start) / 2;
            if (input[i] < mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (input[i] != i) {
                return i;
            }
        }
        if (input[input.length - 1] < maxRange) {
            return input[input.length - 1] + 1;
        }
        return 0;
    }

    public int findMissingNumber(int[] input, int maxRange) {

        if (input[0] != 0)
            return 0;

        for (int i = 0; i < input.length-1; i++) {
            int difference = input[i+1]-input[i];
            if (difference > 1){
                return input[i]+1;
            }
        }
        if (input[input.length - 1] < maxRange) {
            return input[input.length - 1] + 1;
        }
        return 0;
    }
}
