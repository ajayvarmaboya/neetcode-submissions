class Solution {

    int[][] dp;

    int solve(int n, int[] nums, int target) {

        if(n == 0) {
            return target == 0 ? 1 : 0;
        }

        if(dp[n][target] != -1)
            return dp[n][target];

        int skip = solve(n - 1, nums, target);

        int take = 0;

        if(nums[n - 1] <= target) {
            take = solve(n - 1, nums, target - nums[n - 1]);
        }

        return dp[n][target] = take + skip;
    }

    public int findTargetSumWays(int[] nums, int target) {

        int n = nums.length;

        int sum = 0;

        for(int num : nums) {
            sum += num;
        }

        if(sum < Math.abs(target)) return 0;

        if((sum + target) % 2 != 0) return 0;

        int tar = (sum + target) / 2;

        dp = new int[n + 1][tar + 1];

        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(n, nums, tar);
        
    }
}

