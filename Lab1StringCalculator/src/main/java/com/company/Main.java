package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        StringCalculator str = new StringCalculator();


        System.out.println("sum " + str.add("//[*][%]\n1*2%3"));
        /*
        Scanner sc=new Scanner(System.in);


        while(true){

            String s = sc.nextLine();
            System.out.println("sum " + str.add(s));
        }
        */
        /*
        System.out.println("sum " + str.add(""));
        System.out.println("sum " + str.add("1"));
        System.out.println("sum " + str.add("1,2"));
        System.out.println("sum " + str.add("1,2,95,8,5,8,10"));
        System.out.println("sum " + str.add("1\n2,95,8,5,\n"));
        System.out.println("sum " + str.add("//;\n1;2"));
        System.out.println("sum " + str.add("//[*][%]\n1%%%%%%2,8\n7*****7"));
        System.out.println("sum " + str.add("1,2,5000\n7"));
        System.out.println("sum " + str.add("//;\n-1;2;8,7,-7"));

         */



}
}
