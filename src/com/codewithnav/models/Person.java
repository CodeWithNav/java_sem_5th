package com.codewithnav.models;

public class Person {
    String name;
    Person(String name){
        this.name= name;
    }
    public void walk(){
        System.out.println("Person Was Walking.....");
    }
    public void  play(){
        System.out.println("Person Was Playing.....");
    }

}
