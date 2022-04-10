package com.company;

public class Main {


    public static void main(String args[]) {
        Builder builder = new Builder().setBuilderFloat(8.5f).setBuilderInt(6).setBuilderString("codename sun");
        System.out.println(builder.getBuilderFloat()+"-"+builder.getBuilderInt()+"-"+builder.getBuilderString() );
    }
}