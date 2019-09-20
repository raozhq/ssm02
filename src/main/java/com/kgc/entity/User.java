package com.kgc.entity;

public class User {
    private int id;
    private String name;
    private String pwd;
    private int age;
    private String addr;

    public User() {
    }

    public User(String name, String pwd, int age, String addr) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.addr = addr;
    }

    public User(int id, String name, String pwd, int age, String addr) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.addr = addr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
