package com.codewithnav.model;

public class ListNode<T> {
    T value;
    ListNode(T v){
        this.value = v;
    }
    ListNode<T> next;
}
