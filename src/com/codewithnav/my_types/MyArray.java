package com.codewithnav.my_types;

import java.util.ArrayList;

public class MyArray implements  LinearDataHolder{
    ArrayList<Integer>  data=new ArrayList<>();
    @Override
    public void insert(Integer value) {
        System.out.println("Inserting " +value);

        data.add(value);
        System.out.println(toString());
    }

    @Override
    public void remove(Integer value) {
        System.out.println("removing " +value);

        data.remove(value);
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
        data.add(index,value);
        System.out.println(toString());

    }

    @Override
    public int getFirst() {
      if(data.size() >0) return data.get(0);
      return  -1;
    }

    @Override
    public int getLast() {
        if(data.size() >0) return data.get(data.size()-1);
        return  -1;
    }

    @Override
    public int get(int index) {
        if(data.size() >= index) return  data.get(index);
        return  -1;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "data=" + data +
                '}';
    }
}
