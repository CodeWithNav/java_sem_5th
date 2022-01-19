package com.codewithnav.my_types;

interface LinearDataHolder {
    void insert(Integer value);
    void remove(Integer value);
    void remove(int index);
    void insert(int index,Integer value);
    int getFirst();
    int getLast();
    int get(int index);
    String toString();
}
