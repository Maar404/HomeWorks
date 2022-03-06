package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Equation eq=new Equation();
        Scanner sc=new Scanner(System.in);
        System.out.println("ax+by=e\ncx+dy=f\nset an amount for a:");
        eq.a=sc.nextDouble();
        System.out.println("set an amount for b:");
        eq.b=sc.nextDouble();
        System.out.println("set an amount for e:");
        eq.e=sc.nextDouble();
        System.out.println("set an amount for c:");
        eq.c=sc.nextDouble();
        System.out.println("set an amount for d:");
        eq.d=sc.nextDouble();
        System.out.println("set an amount for f:");
        eq.f=sc.nextDouble();
        eq.results();
    }
}
