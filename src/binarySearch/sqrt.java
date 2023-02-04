package binarySearch;

/**
 * sqrt
 */
public class sqrt {

    public static int mySqrt(int x) {

        int s = 1, e = x;
        while (s <= e) {
            int m = (s + e) / 2;
            if (x / m == m) {
                return m;
            }
            if (m < x / m) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return e;

    }

    public boolean isPerfectSquare(int num) {
        int s = 0;
        if (num % 2 == 0) {
            s = 2;

        } else {
            s = 3;
        }
        for (int i = s; i <= num; i += s) {
            if (s * s == num) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int num = 16;
        int s = 1, e = num;
        int mid = (s + e) / 2;
        System.out.println(mid);
        System.out.println();
        System.out.println(mid == num / mid);
        ;
    }

}