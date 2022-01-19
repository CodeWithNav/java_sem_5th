package com.codewithnav;

import com.codewithnav.models.Person;
import com.codewithnav.models.Student;

public class Main {
    public static void main(String[] args) {
        Person person = new Student("Navpreet Singh");
        ((Student) person).study();
    }
}
