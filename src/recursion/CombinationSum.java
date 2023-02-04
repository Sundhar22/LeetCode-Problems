package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * CombinationSum
 */
public class CombinationSum {
    /*
     * Input: candidates = [2,3,6,7], target = 7
     * Output: [[2,2,3],[7]]
     * Explanation:
     * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple
     * times.
     * 7 is a candidate, and 7 = 7.
     * These are the only two combinations.
     * Example 2:
     * 
     * Input: candidates = [2,3,5], target = 8
     * Output: [[2,2,2,2],[2,3,3],[3,5]]
     * Example 3:
     * 
     * Input: candidates = [2], target = 1
     * Output: []
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        return helper(candidates, target, 0, new ArrayList<Integer>(), 0);

    }

    private List<List<Integer>> helper(int[] candidates, int target, int total, List<Integer> p, int c) {

        List<List<Integer>> list = new ArrayList<>();
        if (total > target) {

            return list;
        }
        if (total == target) {

            list.add(new ArrayList<>(p));

            return list;

        }

        for (int i = c; i < candidates.length; i++) {
            p.add(candidates[i]);
            total += candidates[i];
            list.addAll(helper(candidates, target, total, p, i));
            p.remove(p.size() - 1);
            total -= candidates[i];

        }

        return list;
    }

    public static void main(String[] args) {
        CombinationSum obj = new CombinationSum();
        System.out.println(obj.combinationSum(new int[] { 1, 2, 3, 4 ,}, 5));

    }
}