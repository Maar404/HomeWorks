package com.company;
import java.util.*;
public class hm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a number");
        int a=sc.nextInt();
        if(a>0) System.out.println("a is positive");
        else if(a==0) System.out.println("a is zero");
        else System.out.println("a is negative");
    }
}