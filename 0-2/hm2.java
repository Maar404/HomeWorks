package com.company;
import java.util.*;
public class hm1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write the amount of numbers");
        int n= sc.nextInt();
        int a[]=new int[n];
        int maxnum=0;
        System.out.println("write your desire numbers");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
            maxnum=(a[i]>maxnum)?a[i]:maxnum;
        }
        System.out.println("max number is :");
        System.out.println(maxnum);
    }
}