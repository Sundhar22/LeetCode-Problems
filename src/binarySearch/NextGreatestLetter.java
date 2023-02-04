package binarySearch;

/**
 * NextGreatestLetter
 */
public class NextGreatestLetter {
    /*
     * Input: letters = ["c","f","j"], target = "a"
     * Output: "c"
     * Explanation: The smallest character that is lexicographically greater than
     * 'a' in letters is 'c'.
     */

    public char nextGreatestLetter(char[] letters, char target) {

        int s = 0;
        int e = letters.length - 1;
        while (s < e) {

            int m = s + (e - s) / 2;

            if (letters[m]>target) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }
        return letters[s%letters.length];

    }

}