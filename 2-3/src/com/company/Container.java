package com.company;

public class Container implements MyInteger {
    @Override
    public void isEven(int a) {
        System.out.println(a+" is Even");
    }

    @Override
    public void isOdd(int a) {
        System.out.println(a+" is Odd");
    }
    @Override
    public void isNegative(int a) {
        System.out.println(a+" is Negative");
    }
    @Override
    public void isPositive(int a) {
        System.out.println(a+" is Positive");
    }
    @Override
    public void isZero(int a) {
        System.out.println(a+" is Zero");
    }
}
