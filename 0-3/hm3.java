package com.company;
import java.util.*;
public class hm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write your 2 desire numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;
        System.out.println("choose 1 action:\n 1-addiction\n 2-subtraction\n 3-multiplication\n 4-division");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                sum=a+b;
                break;
            case 2:
                sum=(a>b)?a-b:b-a;
                break;
            case 3:
                sum=a*b;
                break;
            case 4:
                sum=a/b;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        if (sum!=0)
        System.out.println(sum);
    }
}