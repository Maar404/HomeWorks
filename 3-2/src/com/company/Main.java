package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RunBack rb=new RunBack();
        System.out.println("ax^2+bx+c=0:\na:");
        double a= sc.nextDouble();
        System.out.println("b:");
        double b= sc.nextDouble();
        System.out.println("c:");
        double c= sc.nextDouble();
        double delta =(b*b)-(4*a*c);
        Double x1=null;
        Double x2=null;
        if (delta<0){
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("doesn't have any answers");
            }
        }
        else if (delta == 0){ x1 = (-b) / (2 * a);
            System.out.println(x1);}
        else {
            x2 = ((-b) - (Math.sqrt(delta))) / (2 * a);
            x1 = ((-b) + (Math.sqrt(delta))) / (2 * a);
            System.out.println(x1+x2);
        }
        for(;;) {
            String answer = rb.runback();
            switch (answer) {
                case "y":
                    main(args);
                    break;
                case "n":
                    return;
                default:
                    System.out.println("invalid");
                    break;
            }
        }
    }
}
