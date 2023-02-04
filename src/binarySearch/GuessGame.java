package binarySearch;

public class GuessGame {
    /*
     * We are playing the Guess Game. The game is as follows:
     * 
     * I pick a number from 1 to n. You have to guess which number I picked.
     * 
     * Every time you guess wrong, I will tell you whether the number I picked is
     * higher or lower than your guess.
     * 
     * You call a pre-defined API int guess(int num), which returns three possible
     * results:
     * 
     * -1: Your guess is higher than the number I picked (i.e. num > pick).
     * 1: Your guess is lower than the number I picked (i.e. num < pick).
     * 0: your guess is equal to the number I picked (i.e. num == pick).
     * Return the number that I picked.
     */
    public int guessNumber(int n) {
        int s = 1, e = n;

        while (s <= e) {
            int num = (s + e) / 2;
            //  guess function already provided.

            int pick = guess(num);

            if (pick == 0)
                return num;
            if (pick<0) {
                e = num - 1;
            } else {
                s = num + 1;
            }
            
        }
        return s;

    }

    private int guess(int num) {
        return 0;
    }
}
