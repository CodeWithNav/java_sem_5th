package com.codewithnav;

import com.codewithnav.model.LinkedList;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mainFlow();



    }

    public static  void mainFlow(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Select Your Option ");
        System.out.println("1) Int , 2) String , 3) Char :");
        int option = scn.nextInt();

        switch (option){
            case  1 :
                LinkedList<Integer> list = new LinkedList<>();
                listHandler(list);
                break;
            case  2 :
                LinkedList<String> s = new LinkedList<>();
                listHandler(s);
                break;
            case  3 :
                LinkedList<Character> c = new LinkedList<>();
                listHandler(c);
                break;
            default:
                System.out.println("Wrong Option Selected!");
        }
    }
    public static <T>  void listHandler(LinkedList<T> list){
        Scanner scn = new Scanner(System.in);
        whileLopp:while (true){
            System.out.print("1) Print , 2) Insert , 3) Delete 4) Exit : ");
            int option = scn.nextInt();

            switch (option){
                case  1:
                    list.printList();
                    break;
                case 2:
                    System.out.print("Enter value : ");
                    try{
                        T value = (T) scn.next();
                        list.insert(value);
                    }catch (Exception e){
                        System.out.print(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter index : ");
                    int index = scn.nextInt();
                    list.removeAt(index);
                    break;
                case 4:
                    break whileLopp;
                default:
                    System.out.println("Please Try Again");
            }


        }
    }


}
