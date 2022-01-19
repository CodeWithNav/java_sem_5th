package com.codewithnav.model;

public class LinkedList<T> {
    ListNode<T> head =null;
    ListNode<T> tail = null;
    int size =0;

    public void insert(T value){
        ListNode<T> newNode = new ListNode<T>(value);
        if(tail ==null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public boolean isEmpty(){
        return head ==null;
    }
    public T at(int index){
        ListNode<T> temp = head;
        int i =0;
        while(i <index && temp !=null){
            temp = temp.next;
            i++;
        }
        return  temp ==null ? null: temp.value;
    }
    public void printList(){
        ListNode<T> temp = head;
        System.out.print("Head ->");
        while (temp !=null){
            System.out.print(temp.value );
            if(temp.next !=null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println("<- Tail");
    }
    public void removeAt(int index){
        ListNode<T> temp = head;

        if(index==0){
            head = head.next;
            return;
        }
        ListNode<T> prev = head;
        temp = prev.next;
        int i =1;
        while(i <index && temp !=null){
            prev = temp;
            i++;
            temp = temp.next;
        }
        if(temp !=null && prev !=null){
            prev.next = temp.next;
            size--;
        }

    }
}
