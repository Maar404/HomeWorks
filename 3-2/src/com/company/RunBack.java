package com.company;

import java.util.Scanner;

public class RunBack {
    Scanner sc=new Scanner(System.in);
    public String runback(){
        System.out.println("would you like to try again?y/n");
        String answer= sc.nextLine();
        return answer;
    }
}
