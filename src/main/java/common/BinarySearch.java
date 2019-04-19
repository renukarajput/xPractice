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

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start+(end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return target > nums[start] ? end + 1: start;
    }
}
