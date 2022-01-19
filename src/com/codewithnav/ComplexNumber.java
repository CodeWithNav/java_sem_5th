package com.codewithnav;

public class ComplexNumber {
    double realNumber;
    double imaginaryNumber;
    static int objectCreated = 0;
    ComplexNumber(double realNumber,double imaginaryNumber){
        this.imaginaryNumber = imaginaryNumber;
        this.realNumber = realNumber;
        ComplexNumber.objectCreated++;
    }

    public int getActiveObjectCount() {
        return ComplexNumber.objectCreated;
    }

    public void add(ComplexNumber complexNumber){
        imaginaryNumber +=complexNumber.imaginaryNumber;
        realNumber +=complexNumber.realNumber;
        System.out.println("Add ");
    }

    public void multiply(ComplexNumber complexNumber){
        double ti =realNumber * complexNumber.imaginaryNumber +imaginaryNumber * complexNumber.realNumber;
        realNumber =(complexNumber.realNumber * realNumber) - (complexNumber.imaginaryNumber * imaginaryNumber);
        imaginaryNumber = ti;
        System.out.println("Multiply ");
    }



    public void sub(ComplexNumber complexNumber){
        imaginaryNumber -=complexNumber.imaginaryNumber;
        realNumber -=complexNumber.realNumber;
        System.out.println("Sub ");
    }

    public void div(ComplexNumber complexNumber){
        double d = Math.pow(complexNumber.realNumber,2)+Math.pow(complexNumber.imaginaryNumber,2);
        double rt =(realNumber * complexNumber.realNumber + imaginaryNumber*complexNumber.imaginaryNumber )/d;
        imaginaryNumber = (imaginaryNumber*complexNumber.realNumber - realNumber*complexNumber.imaginaryNumber)/d;
        realNumber = rt;
        System.out.println("Div ");
    }

    public void  print(){
        System.out.println(realNumber+"+"+imaginaryNumber+"i");
    }

}
