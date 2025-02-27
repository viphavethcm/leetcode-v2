package Recursion.easy;

public class PowerOfThree {

    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n == 1)
            return true;
        else if(n < 3)
            return false;
        return resolve(n, 3) == n;
    }

    public static long resolve(int n, long tmp) {
        if (tmp >= n)
            return tmp;
        tmp  = resolve(n, tmp * 3);
        return tmp;
    }
}
