package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App {
    public static void main(String[] args) {
        System.out.println("What is the password? ");
        String password = "abc$123";
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (password.equals(input)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}