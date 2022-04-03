package com.company;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) throws CloneNotSupportedException{
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter your username and then your password.");
            User<String,String> realUser = new User<String,String>(scanner.nextLine(),scanner.nextLine());
            User<String,String> cloneUser1 = (User<String, String>) realUser.clone();
            User<String,String> cloneUser2 = (User<String, String>) realUser.clone();
            printInfo(realUser);
            printInfo(cloneUser1);
            printInfo(cloneUser2);
        }
        private static void printInfo(User<String, String> user) {
            System.out.println("username = "+ user.username + " password: "+ user.password);
        }
    }
