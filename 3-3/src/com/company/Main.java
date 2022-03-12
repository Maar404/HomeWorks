package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String without numbers:");
        String x=sc.nextLine();
        for(int i=0;i<10;i++){
            if (x.contains(String.valueOf(i))){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("invalid");
                    main(args);
                    return;
                }
            }
        }
        System.out.println("length of your string is:"+x.length());
    }
}
