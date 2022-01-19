package com.codewithnav.my_types;

import java.util.LinkedList;

public class MyLinkedList implements  LinearDataHolder {
    private final LinkedList<Integer> data = new LinkedList<>();
    @Override
    public void insert(Integer value) {
        System.out.println("Inserting " +value);
        data.add(value);
        System.out.println(toString());
    }

    @Override
    public void remove(Integer v) {
        System.out.println("removing " +v);
        data.remove(v);
        System.out.println(toString());
    }

    @Override
    public void remove(int index) {
        System.out.println("Removing at index " +index);
        data.remove(index);
        System.out.println(toString());
    }

    @Override
    public void insert(int index, Integer value) {
        System.out.println("Inserting at index "+ index+" value " +value);
        data.add(index,value);
        System.out.println(toString());
    }

    @Override
    public int getFirst() {
        return  data.getFirst();
    }

    @Override
    public int getLast() {
       return  data.getLast();
    }

    @Override
    public int get(int index) {
        return data.get(index);
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "data=" + data +
                '}';
    }
}
