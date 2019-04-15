package common;

public class BinarySearch {

    public int search(int[] arr, int no){
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + end-start / 2;
            if (arr[mid] == no)
                return no;
            if (arr[mid] > no)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
