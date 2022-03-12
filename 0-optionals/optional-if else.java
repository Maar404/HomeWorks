package com.company;
import java.util.*;
public class hm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write 2 numbers for subtraction");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = 0;
        if(a>b) sum=a-b;
        else sum=b-a;
        System.out.println("answer:");
        System.out.println(sum);
    }
}