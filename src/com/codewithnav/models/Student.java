package com.codewithnav.models;

public class Student extends Person{
    String name;
    public Student(String name) {
        super(name);
        this.name=name;
    }
    @Override
    public void play() {
        System.out.println("Student Was Playing.....");
    }
    @Override
    public void walk() {
        System.out.println("Student Was Walking......");
    }
    public void study(){
        System.out.println("Student Was Studying.....");
    }
}
