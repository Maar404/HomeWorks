package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle circle=new Circle();
        Triangle triangle= new Triangle();
        System.out.println("give an amount for the base of triangle:");
        triangle.A= sc.nextDouble();
        System.out.println("give an amount for the height of the triangle:");
        triangle.h= sc.nextDouble();
        triangle.giveS();
        System.out.println("give an amount for the radius of the circle:");
        circle.r= sc.nextDouble();
        circle.giveS();
    }
}
