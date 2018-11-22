/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplecalculatortwo;
import java.util.Scanner;

/**
 *
 * @author bacag
 */
public class App {
    public static void main(String[] args) {
      //App class should be the UI to the user
      // should handle the user input
      //must use SimpleCalc() to perform all math operations
      //Should give the user a choice of what operation to perform
      //After selecting the operation, the program should ask the user 
      //to enter the two operands and display results of the calculation
      //Then the UI should display the menu again. The user must choose
      // the exit option to exit and program must print a thank you message
      
      Scanner sc = new Scanner(System.in);
      int total = 0;
    
        System.out.println("What operation would you like to perform? \n");
      
        System.out.println("\t Please enter + for addition");
        System.out.println("\t Please enter - for subtraction");
        System.out.println("\t Please enter * for multiplication");
        System.out.println("\t Please enter / for division");
        System.out.println("\t Or to quit, please enter 5");
        
        System.out.println("\n Please enter your selection: ");
            String selection = sc.nextLine();
        
        if (selection != "5" ) {
            
        System.out.println("Please enter first number: ");
            int a = sc.nextInt();
        
        System.out.println("Please enter second number: ");
            int b = sc.nextInt();
        
        boolean keepGoing = true;        
        switch (selection) {
            case "+":
                total = SimpleCalc.add(a, b);
                break;
            case "-":
                total = SimpleCalc.subtract(a, b);
                break;
            case "*":
                total = SimpleCalc.multiply(a, b);
                break;
            case "/":
                total = SimpleCalc.divide(a, b);
                break;
            default:
                total = 0;
                keepGoing = false;
                break;   
        } 
           System.out.println("Your total is: "+ total);
            System.out.println("Thaks and come again!");
    } 
        else {
            System.out.println("Thanks for stopping by");
    } 
    }
}
