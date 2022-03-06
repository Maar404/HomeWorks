package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Librarian librarian=new Librarian();
        System.out.println("enter an action:\n1-receive a book\n2-give a book");
        int a= sc.nextInt();
        sc.nextLine();
        switch (a){
            case 1:
                System.out.println("write a book's name");
                String book1=sc.nextLine();
                librarian.receive(book1);
                break;

            case 2:
                System.out.println("write a book's name");
                String book2=sc.nextLine();
                librarian.giveBook(book2);
                break;

            default:
                System.out.println("invalid input");
                main(args);
                break;
        }

    }
}
