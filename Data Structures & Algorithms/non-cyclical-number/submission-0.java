class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        while (!visited.contains(n)) {
            visited.add(n);
            n = sumOfSquares(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    int sumOfSquares(int n) {
        int output = 0;
        while (n > 0) {
            int digit = n % 10;
            digit *= digit;
            output += digit;
            n = n / 10;
        }
        return output;
    }
}
