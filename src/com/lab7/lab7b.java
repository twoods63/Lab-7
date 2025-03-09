package com.lab7;
import java.util.*;
public class lab7b {
    public static String repeatNTimes (String s, int n) {
        if (n <= 0) {
            return "";
        } else {
            return s + repeatNTimes(s, n - 1);
        }
    }
    public static boolean isReverse (String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else if (s1.isEmpty()) {
            return true;
        } else if (s1.charAt(0) != s2.charAt(s2.length() - 1)) {
            return false;
        } else {
            return isReverse(s1.substring(1), s2.substring(0, s2.length() - 1));
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(repeatNTimes("I must study recursion until it makes sense\n", 100));
        System.out.println("Enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string");
        String s2 = sc.nextLine();
        if (isReverse(s1, s2)) {
            System.out.println(s1 + " is the reverse of " + s2);
        } else {
            System.out.println(s1 + " is not the reverse of " + s2);
        }
    }
}
