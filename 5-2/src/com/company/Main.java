package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Registry registrator = Registry.getInstange();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your username:");
        registrator.setUserName(scanner.nextLine());
        System.out.println("enter your password:");
        String passTemp = scanner.nextLine();
        System.out.println("repeat your password:");
        if (passTemp.equals(scanner.nextLine()))
            registrator.setPassWord(passTemp);
        else {System.out.println("passwords don't match!!!");return;}
        System.out.println("username: " + registrator.getUserName());
        System.out.println("password: " + registrator.getPassWord());
    }

}