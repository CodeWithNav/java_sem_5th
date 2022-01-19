package com.codewithnav.my_types;

import java.util.ArrayList;

class ArrayStack<T> implements  MyStack<T>{

    ArrayList<T> stack = new ArrayList<>();
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
        return "ArrayStack{" +
                "stack=" + stack +
                ", pointer=" + pointer +
                '}';
    }
    public void print(){
        System.out.println(toString());
    }
}
