package com.company;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double temp = collectInput();

        while (temp >= -460) {
            double conversion = conversion(temp);
            display(conversion);
            temp = collectInput();
        }

    }

    static double collectInput(){
        System.out.println("Please enter the temp in fahrenheit: ");
        double temp = input.nextDouble();
        return temp;
    }

    static double conversion(double temp){
        double celsius = (((temp - 32) * 5)/9);
        return celsius;
    }

    static void display(double w){
        System.out.println("the degrees in celsius is " + w);
    }
}
