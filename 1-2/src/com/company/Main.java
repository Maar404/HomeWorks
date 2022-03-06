package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scores score1=new Scores();
        System.out.println("put your first lesson score");
        score1.score= sc.nextDouble();
        System.out.println("put your lesson multiplication");
        score1.multi= sc.nextInt();
        Scores score2=new Scores();
        System.out.println("put your second lesson score");
        score2.score=sc.nextDouble();
        System.out.println("put your lesson multiplication");
        score2.multi= sc.nextInt();
        int M=score2.multi+ score1.multi;
        double sum= (score1.score* score1.multi+ score2.score* score2.multi)/M;
        System.out.println("your avg score is:"+sum);
        score1.results(sum);

    }
}
