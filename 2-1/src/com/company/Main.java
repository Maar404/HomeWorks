package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator cal=new Calculator();
        System.out.println("enter your first number:");
        cal.a= sc.nextInt();
        System.out.println("enter your second number:");
        cal.b=sc.nextInt();
        System.out.println("choose an action:\n1-'*'\n2-'/'\n3-'+'\n4-'-'");
        int c= sc.nextInt();
        switch (c){
            case 1:cal.multi(cal.a, cal.b);break;
            case 2:cal.divi(cal.a, cal.b);break;
            case 3:cal.adding(cal.a, cal.b);break;
            case 4:cal.sub(cal.a, cal.b);break;
            default:
                System.out.println("invalid input");
                main(args);
        }

    }
}
