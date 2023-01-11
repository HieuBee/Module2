package com.company.Exercise;

import java.util.Scanner;

public class Output_greeting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = s.next();
        System.out.println("Hello: " + name);
    }

}
