package com.newcoder;

public class Animal implements Talking {
    private String name;
    private int age;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void say() {
        System.out.print(name + " Animal Say");
    }
}
