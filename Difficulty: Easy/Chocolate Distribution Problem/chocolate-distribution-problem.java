import java.util.Arrays;

class Solution {
    public int findMinDiff(int[] arr, int m) {

        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - m; i++) {
            ans = Math.min(ans, arr[i + m - 1] - arr[i]);
        }

        return ans;
    }
}