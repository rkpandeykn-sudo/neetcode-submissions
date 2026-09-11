class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0, j = n - 1;
        int maxWater = 0;
        while (i < j) {
            int w = j - i;
            int h = Math.min(heights[i], heights[j]);
            int area = w * h;

            maxWater = Math.max(maxWater, area);

            if (heights[i] > heights[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxWater;
    }
}
