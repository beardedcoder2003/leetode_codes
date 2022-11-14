/*
the program is such that the user gives any integral number and the code reverses it and prints the result.
eg: enter the number
146211220

output:
22112641
 */
package com.shubh;
import java.util.*;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        long number=sc.nextLong();
        if(number<0){
            number=number*(-1);
            
            System.out.println((-1)*reverse(number));
        }else
        System.out.println(reverse(number));
    }

    public static long reverse(long number){
        long new_number=0;
        while(true){
            long temp=number%10;
            number=number/10;
            new_number=temp+new_number;
            if(number==0)
                break;
            new_number=new_number*10;


        }
        return new_number;
    }
}
