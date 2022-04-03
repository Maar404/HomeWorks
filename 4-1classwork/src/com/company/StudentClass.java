package com.company;


public class StudentClass {
    private String name,family,password,userName,job;
    void setName(String _name) {
        this.name = _name;
    }
    void setFamily(String _family) {
        this.family = _family;
    }
    void setUserName(String _userName) {
        this.userName = _userName;
    }
    void setPassword(String _password) {
        this.password = _password;
    }
    void setJob(String _job) {
        this.job = _job;
    }
    //getters
    String getName() {
        return this.name;
    }
    String getFamily() {
        return this.family;
    }
    String getUserName() {
        return this.userName;
    }
    String getPassword() {
        return this.password;
    }
    String getJob() {
        return this.job;
    }
    private int age;
    void setAge(int _age) {
        this.age =_age;
    }
    int getAge() {
        return age;
    }
}