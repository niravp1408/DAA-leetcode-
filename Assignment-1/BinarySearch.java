class Solution {

    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }
    public int binarySearch(int[] arr, int l, int h, int target) {
        
        if (l > h) {
            return -1;
        }

        int mid = (l + h) / 2;

        if (arr[mid] == target) {
            return mid;
        } 
        else if (arr[mid] > target) {
            return binarySearch(arr, l, mid - 1, target);
        } 
        else {
            return binarySearch(arr, mid + 1, h, target);
        }
    }
}
