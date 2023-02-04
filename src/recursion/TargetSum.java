package recursion;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        if (nums.length == 1) {
            return 1;

        }
        return helper(nums, target, 0);

    }

    private int helper(int[] nums, int target, int i) {
        if (nums.length == i) {
            return 0;

        }
        int count = 0;

        nums[i] = nums[i] * -1;
        
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {

            sum += nums[j];
        }
        if (sum == target) {
            count++;
        }
        nums[i] = nums[i] * -1;
        count += helper(nums, target, i + 1);

        return count;
    }

    public static void main(String[] args) {
        TargetSum objSum = new TargetSum();
        int count = objSum.findTargetSumWays(new int[] { 1, 1, 1, 1, 1 }, 3);
        System.out.println(count);
    }
}
