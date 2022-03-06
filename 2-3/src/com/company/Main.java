package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Container co=new Container();
        System.out.println("write a number:");
        int a= sc.nextInt();
        if (a%2!=0) co.isOdd(a);
        else co.isEven(a);
        if (a>0) co.isPositive(a);
        else if (a==0) co.isZero(a);
        else co.isNegative(a);
    }
}
