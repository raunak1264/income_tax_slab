package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Income tax Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income in lakhs");
        float income = sc.nextFloat();
        float tax = 0;
        if (income <= 2.5) {
            System.out.println("No tax for you");
        } else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
            System.out.println("tax= " + tax);
        } else if (income > 5f && income <= 10f) {
            tax = tax + 0.05f * (5f - 2.5f);
            tax = 0.20f * (income - 5f);
            System.out.println("tax= " + tax);
        } else if (income >= 10f) {
            tax = tax + 0.05f * (5f - 2.5f);
            tax = 0.20f * (10f - 5f);
            tax = 0.30f * (income - 10f);
            System.out.println("tax" + tax);

//        if(income>=5F && income<=10);
//        System.out.println("tax= " + 20/100 * income);
//        if (income>10);
//        System.out.println("tax= "+ 30/100 * income);
        }
        }
    }
