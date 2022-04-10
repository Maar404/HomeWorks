package com.company;

public class Registry {
    private static Registry registrator;
    private String userName;
    private String passWord;
    public synchronized static Registry getInstange() {
        if (registrator == null)
        {
            registrator = new Registry();
        }
        return registrator;
    }
    private Registry() {}
    public void setUserName(String _userName) {
        this.userName = _userName;
    }
    public void setPassWord(String _passWord) {
        this.passWord = _passWord;
    }
    public String getUserName() {
        return this.userName;
    }
    public String getPassWord() {
        return this.passWord;
    }

}