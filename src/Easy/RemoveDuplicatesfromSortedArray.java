package Easy;

public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int pointer = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[pointer]) {
                pointer++;
                nums[pointer] = nums[i];

            }
        }
        return pointer + 1;
    }
}
