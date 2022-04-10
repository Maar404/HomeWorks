package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        CarFactory carFactory = new CarFactory();
        CarClass car=null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("are you low on money? (y/n)");
        String answer = scanner.next();

        switch (answer) {
            case "y":
                System.out.println("enter your maximum budget!");
                car= carFactory.getCarForBudget(scanner.nextInt());
                break;
            case "n":
                scanner.nextLine();
                System.out.println("which brand do you choose?(pride/bmw)");
                car= carFactory.getCarByName(scanner.nextLine());
                break;
            default:
                System.out.println("something went wrong");
                break;
        }
        car.honk();
        car.flex();
        car.propietaryFunction();

    }

}
