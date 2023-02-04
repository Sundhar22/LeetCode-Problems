package recursion;

/**
 * WordSearch
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        char[] charArray = word.toCharArray();
        boolean[][] bool = new boolean[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (isPresent(board, bool, 0, row, col, charArray)) {
                    return true;
                }
            }

        }
        return false;

    }

    private boolean isPresent(char[][] board, boolean[][] bool, int i, int row, int col, char[] charArray) {
        if (i == charArray.length) {
            return true;
        }
        if (bool[row][col] == true || board[row][col] != charArray[i] || row < 0 || col < 0 || row >= board.length
                || col >= board[0].length || i > charArray.length){
            return false;
        }
            if (row >= board.length || row < 0 || col >= board[row].length || col < 0 || i > charArray.length
                || board[row][col] != charArray[i] || bool[row][col] == true) {
            return false;
        }

        bool[row][col] = true;
        if (isPresent(board, bool, i + 1, row + 1, col, charArray)) {
            return true;
        } else if (isPresent(board, bool, i + 1, row, col + 1, charArray)) {
            return true;
        } else if (isPresent(board, bool, i + 1, row - 1, col, charArray)) {
            return true;
        } else if (isPresent(board, bool, i + 1, row, col - 1, charArray)) {
            return true;
        }
        bool[row][col] = false;
        return false;
    }

    public static void main(String[] args) {

        char[][] board = { { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }, };
        WordSearch obj = new WordSearch();
        System.out.println(obj.exist(board, "SEE"));
        System.out.println();

    }

}