package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of users:(users can't be repeated)");
        int user= sc.nextInt();
        String[] name=new String[user];
        if (user<=0) {System.out.println("error");main(args);}
        System.out.println("enter the name of your users:");
        sc.nextLine();
        for(int i=0;i<user;i++){
            name[i]=sc.nextLine();
        }
        for(int i=0;i<user;i++){
            for(int k=i+1;k<user;k++){
                if(name[i]!=null&&name[k]!=null&&name[i].equals(name[k])){
                    try {
                        throw new ReapetedNameEx("users are repeated");
                    } catch (ReapetedNameEx e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println("your users are:");
        for (int i=0;i<user;i++){
            System.out.println(name[i]);
        }
    }
}
