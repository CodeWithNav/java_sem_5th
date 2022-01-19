/*
* Name : Navpreet Singh
* Aim : Java Method Overloading
* Date : 15/12/2021
* */
package com.codewithnav;
public class Main {
    public static void main(String[] args) {
        Main m1 = new Main();

        System.out.println("Int Sum : "+m1.sum(4,3));
        System.out.println("Double Sum : "+m1.sum(4.2,3.5));
    }
   public int sum(int a ,int b){
        return a+b;
   }
    public double sum(double a ,double b){
        return a+b;
    }
}
