/*
the program is quite simple. the user gives any string and a set of number which contain the order of the indexes of the original
string character they want to see.

e.g: String given: codeleet
     given number set: 45670123

     output: [l, e, e, t, c, o, d, e]
 */
package com.shubh;
import java.util.*;
public class stringChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("enter the array");
        int nums=sc.nextInt();
        int[] arr=new int[str.length()];
        for (int i = arr.length-1; i>=0 ; i--) {
            int mod=nums%10;
            arr[i]=mod;
            nums=nums/10;
        }
        System.out.println(Arrays.toString(change(arr,str)));
    }

    public static char[] change(int[] arr, String str){
        char[] str1=new char[arr.length];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            index=arr[i];
            str1[i]=str.charAt(index);
            index=0;
        }
        return str1;
    }
}
