package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List l=new List();
        l.showcase();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your username:");
        String username=sc.nextLine();
        System.out.println("enter your password");
        String password= sc.nextLine();
        if (username.equals(l.un1)&&password.equals(l.pw1)) System.out.println("access granted");
        else if (username.equals(l.un2)&&password.equals(l.pw2)) System.out.println("access granted");
        else if (username.equals(l.un3)&&password.equals(l.pw3)) System.out.println("access granted");
        else{
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("invalid user or password");
                main(args);
            }
        }
    }
}
