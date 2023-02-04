package binarySearch;

public class _2DArrays_II {
    /*
     * Input: matrix =
     * [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
     * , target = 5
     * Output: true
     */

    public boolean searchMatrix(int[][] matrix, int target) {
       
        
            int low = 0;
            int high = matrix[low].length - 1;

            while (low <= high) {
                int innerMid = low + (high - low) / 2;

                if (target == matrix[low][innerMid]) {
                    return true;
                }
                if (matrix[low][innerMid] > target) {
                    high=high-1;
                } else {
                    low++;
                }
            

        }
        return false;

        

    }

    private boolean helper(int[][] matrix, int target, int rowStart, int rowEnd) {

        


        if (rowStart > rowEnd) {
            return false;
        }
        int mid = rowStart + (rowEnd - rowStart) / 2;

        int low = 0;
        int high = matrix[mid].length - 1;

        while (low <= high) {
            int innerMid = low + (high - low) / 2;

            if (target == matrix[mid][innerMid]) {
                return true;
            }
            if (matrix[mid][innerMid] > target) {
                high = innerMid - 1;
            } else {
                low = innerMid + 1;
            }
        }
        // if (matrix[mid][0] >= target && target <= matrix[mid][matrix[mid].length -
        // 1]) {
        // return false;
        // }
        if (matrix[mid][0] > target&& matrix[mid][1] > target) {
            return helper(matrix, target, rowStart, mid - 1);
        } else {
            return helper(matrix, target, mid + 1, rowEnd);

        }

    }
}
