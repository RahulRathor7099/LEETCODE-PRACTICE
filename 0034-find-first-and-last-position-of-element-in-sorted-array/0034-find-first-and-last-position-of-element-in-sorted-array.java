class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;

        int lef = 0;
        int rig = nums.length - 1;

        
        while (lef <= rig) {

            int mid = lef + (rig - lef) / 2;

            if (nums[mid] == target) {
                first = mid;
                rig = mid - 1;   
            }
            else if (nums[mid] < target) {
                lef = mid + 1;
            }
            else {
                rig = mid - 1;
            }
        }

        lef = 0;
        rig = nums.length - 1;

        while (lef <= rig) {

            int mid = lef + (rig - lef) / 2;

            if (nums[mid] == target) {
                last = mid;
                lef = mid + 1;   
            }
            else if (nums[mid] < target) {
                lef = mid + 1;
            }
            else {
                rig = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}