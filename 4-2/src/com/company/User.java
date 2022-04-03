package com.company;

public class User<T1,T2> implements Cloneable {
    public T1 username;
    public T2 password;
    User(T1 ob1,T2 ob2){
        this.username = ob1;
        this.password = ob2;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
