class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            int j = i + 1;

            while (j < n) {

                if (temperatures[j] > temperatures[i]) {
                    break;
                }

                j++;
            }

            if (j == n) {
                ans[i] = 0;
            } else {
                ans[i] = j - i;
            }
        }

        return ans;
    }
}