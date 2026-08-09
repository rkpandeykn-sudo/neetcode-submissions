class Solution {
    public boolean hasDuplicate(int[] nums) {
        //java 8
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}