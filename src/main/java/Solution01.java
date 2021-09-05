/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Manuel Camacho
 */


import java.util.Scanner; //Imports Scanner Class

public class Solution01 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("What is your name? "); //Asks for name
        String userName = in.nextLine();
        System.out.println("Hello, " + userName + ", nice to meet you!");


    }
}

/*
    PseudoCode
    Display "What is your name?" to ask user for name
    get userName from user
    Display "Hello, (insert userName), nice to meet you!"
    END

 */