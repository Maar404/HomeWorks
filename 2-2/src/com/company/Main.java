package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Subjects sbj=new Subjects();
        Scanner sc=new Scanner(System.in);
        System.out.println("dars e mored nazar khod ra benevisid:\nHint(riazi1,riazi2,fizik1,fizik2,mabani,advcode)");
        String C= sc.nextLine();
        switch (C){
            case "riazi1":sbj.introR1();break;
            case "riazi2":sbj.introR2();break;
            case "fizik1":sbj.introF1();break;
            case "fizik2":sbj.introF2();break;
            case "mabani":sbj.introM();break;
            case "advcode":sbj.introAdv();break;
            default:
                System.out.println("invalid");
                main(args);
        }
    }
}
