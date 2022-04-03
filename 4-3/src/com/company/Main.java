package com.company;
import java.util.ArrayList;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Info<String,Integer,String,ArrayList<Double>> stu1 = new Info<String,Integer,String,ArrayList<Double>>();
            stu1.setStudentName("Arash");
            stu1.setStudentFatherName("Bahram");
            stu1.setStudentID(215459);
            ArrayList<Double> gradesList = new ArrayList<Double>();
            Scanner scanner = new Scanner(System.in);
            gradesList.add(19.0);
            gradesList.add(15.75);
            gradesList.add(12.0);
            gradesList.add(17.25);
            gradesList.add(20.0);
            stu1.setStudentGrades(gradesList);
            System.out.println("name is: "+ stu1.getStudentName());
            System.out.println("ID is: "+ stu1.getStudentID());
            System.out.println("the name of the student's father is: " + stu1.getStudentFatherName());
            System.out.println("their grades are: ");
            for (Double d: stu1.getStudentGrades()) {
                System.out.println(d);
            }
        }

    }