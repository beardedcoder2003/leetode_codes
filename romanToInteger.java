package com.shubh;
import java.util.*;
public class romanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the roman integrals");
        String s=sc.nextLine();
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {

        int sum = 0, sum1 = 0, sum2, itval = 0;
        char c1 = ' ', c2 = ' ';
        int k = 0, k1 = 0;
        char c[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int val[] = {1, 5, 10, 50, 100, 500, 1000};             
        loop:
        for (int i = 0; i < s.length(); i++) {

            c2 = s.charAt(i);
            if (i + 1 < s.length())
                c1 = s.charAt(i + 1);
            for (int j = 0; j < 7; j++) {
                if (c1 == c[j])
                    k1 = val[j];
            }
            for (int a = 0; a < 7; a++) {
                if (c2 == c[a])
                    k = val[a];
            }
            if (k < k1) {
                itval = k1;
                sum1 = sum1 + k1 - k;
                continue loop;
            }
            if (itval != k)
                sum = sum + k;
        }
        sum2 = sum + sum1;
        return sum2;
    }
}
