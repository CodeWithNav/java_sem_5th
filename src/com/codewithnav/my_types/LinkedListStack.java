package com.codewithnav.my_types;


import java.util.LinkedList;

public class LinkedListStack<T> implements MyStack<T>{
    LinkedList<T> stack = new LinkedList<>();
    int pointer = -1;
    @Override
    public void push(T value) {
        stack.add(value);
        pointer++;
    }

    @Override
    public T pop() {
        if(pointer==-1 || stack.isEmpty()) return null;
        T value = stack.get(pointer);
        stack.remove(pointer);
        pointer--;
        return  value;
    }

    @Override
    public T pick() {
        if(pointer==-1 || stack.isEmpty()) return null;
        return stack.get(pointer);
    }

    @Override
    public String toString() {
        return "LinkedListStack{" +
                "stack=" + stack +
                ", pointer=" + pointer +
                '}';
    }
    public void print(){
        System.out.println(toString());
    }
}
