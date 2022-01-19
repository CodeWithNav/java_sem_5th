package com.codewithnav;


import com.codewithnav.my_types.LinkedListStack;



public class Main {


    public static void main(String[] args) {

    }
    private  static  void myLinkedListRunner(){
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(5);
        linkedListStack.push(6);
        linkedListStack.print();
        linkedListStack.pop();
        linkedListStack.print();
    }
    private  static  void myArrayRunner(){

    }
}
