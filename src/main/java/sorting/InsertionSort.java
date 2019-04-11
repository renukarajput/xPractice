package sorting;

class InsertionSort {
    // 4 5 1 3 2 ::: 4 1 3 5
    void sort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int j = i;
            while (j > 0 && input[j - 1] > input[j]) {
                swap(j, j - 1, input);
                j--;
            }
        }
    }

    void fasterVersion(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int j = i - 1;
            int x = input[i];
            while (j >= 0 && input[j] > x) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = x;
        }
    }

    void swap(int first, int second, int[] input) {
        int temp = input[first];
        input[first] = input[second];
        input[second] = temp;
    }
}
