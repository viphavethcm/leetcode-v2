package Recursion.easy;

import java.util.Scanner;

public class FindKCharacterInStringGame1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String tmp = "a";
        System.out.println(findNext(tmp, k));
    }

    public static char findNext(String rs, int k) {
        if(rs.length() >= k) {
            return rs.charAt(k-1);
        }
        for(char ch: rs.toCharArray()){
            rs += Character.toString(ch + 1);
        }
        return findNext(rs, k);
    }
}
