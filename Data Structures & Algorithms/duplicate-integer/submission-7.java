class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 3. Hash Set Length
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        
        return n != set.size();
    }
}