package com.bl;

import java.util.Scanner;

public class ReverseNumber {

    int res=0;
    void reverse(int num)
    {
        int rem;
        if(num!=0)
        {
            rem=num%10;
            res=(res*10)+rem;
            num=num/10;
            reverse(num);
        }
        else
            System.out.println("Reverse of the number is "+res);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        ReverseNumber r=new ReverseNumber();
        r.reverse(x);
    }
}