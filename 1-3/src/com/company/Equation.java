package com.company;

public class Equation {
    public double a;
    public double b;
    public double e;
    public double c;
    public double d;
    public double f;
    public void results(){
        double j=(a*d)-(b*c);
        double k=(e*d)-(b*f);
        double l=(a*f-e*c);
        if (j==0) {
            System.out.println("the equation does not have an answer");
            System.exit(0);
        }
        double x=k/j;
        double y=l/j;
        System.out.println("x:"+x+"\ny:"+y);
    }

}
