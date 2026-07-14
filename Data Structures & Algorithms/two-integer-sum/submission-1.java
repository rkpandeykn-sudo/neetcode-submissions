/*
    Leetcode link:  https://leetcode.com/problems/two-sum/
*/
class Solution {
    // Approach 2. HashMap
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int remaining = 0;

        for (int i = 0; i < nums.length; i++) {
            remaining = target - nums[i];
            if (mp.containsKey(remaining)) {
                return new int[] {mp.get(remaining), i};
            }
            mp.put(nums[i], i);
        }

        return new int[] {};
    }
}
