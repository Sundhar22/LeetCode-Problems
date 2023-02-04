package binarySearch;

public class CoinSteps {
    public int arrangeCoins(int n) {

        long s = 0, e = n;
        while (s <= e) {
            long m = s + (e - s) / 2;
            long x = m + (m + 1) / 2;
            if (x == n)
                return (int) (m);

            if (x > n) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }
        return (int) (e);
    }

    public static void main(String[] args) {
        CoinSteps obj = new CoinSteps();
        System.out.println(obj.arrangeCoins(2147483647));
    }
}
