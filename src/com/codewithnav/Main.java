package com.codewithnav;

public class Main {

    public static void main(String[] args) {
	    ComplexNumber c1 = new ComplexNumber(1.0d,1.0d);
	    ComplexNumber c2 = new ComplexNumber(1.0d,1.0d);
	    c1.print();
	    c1.add(c2);
	    c1.print();
        c1.sub(c2);
        c1.print();
        c1.multiply(c2);
        c1.print();
        c1.div(c2);
        c1.print();

        System.out.println("Active Object of ComplexNumber Class "+c1.getActiveObjectCount());


    }
}
