/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringmanupulationwitsclasses;

import java.util.Scanner;

/**
 *
 * @author sedie
 */
public class StringManupulationWitsClasses {

    public static void main(String[] args) {
        //Declaration
        String email;
        String pin;
        
        Scanner input = new Scanner(System.in);
        
        //Inputs
        System.out.println("Register");
        System.out.print("Enter your email: ");
        email = input.nextLine();
        System.out.print("Enter pin: ");
        pin = input.nextLine();
        
        ArcAccount myAccount = new ArcAccount(email, pin);
        
        myAccount.verfyEmail();
        myAccount.verifyPin();
    }
}
