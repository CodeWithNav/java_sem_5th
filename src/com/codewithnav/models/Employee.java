package com.codewithnav.models;

public class Employee extends  Person{
    String name;
    Employee(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Employee was walking....");
    }

    @Override
    public void play() {
        System.out.println("Employee was playing....");
    }

    public void woking(){
        System.out.println("Employee was Working....");
    }
}
