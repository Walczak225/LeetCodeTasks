package Easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        int right = nums.length - 1;
        int left = 0;
        int middle = 0;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if(nums[middle] == target) {return middle;}
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            }

        }
        return left;


    }
}
