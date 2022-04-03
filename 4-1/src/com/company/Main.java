package com.company;
import java.util.HashMap;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            HashMap<String, String> info = new HashMap<String,String>();
            info.put("name",null);
            info.put("studentID",null);
            info.put("GPA",null);
            getInfo(scanner,info);
            printInfo(info);
        }
        private static void printInfo(HashMap<String, String> map) {
            for (String key : map.keySet()) {
                System.out.println("student's "+key+" is : "+map.get(key));
            }
        }
        private static void getInfo(Scanner s,HashMap<String, String> map) {
            System.out.println("please enter your name: ");
            map.put("name", s.nextLine());
            System.out.println("please enter your student ID: ");
            map.replace("studentID", s.nextLine());
            System.out.println("please enter your GPA: ");
            map.put("GPA",s.nextLine());
        }
    }