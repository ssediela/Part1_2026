/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringmanupulationwitsclasses;

/**
 *
 * @author sedie
 */
public class ArcAccount {
    //Data Members
    private String email;
    private String pin;
    
    //Default Constructor
    public ArcAccount() {
    }
    
    //Constructor Overloading
    public ArcAccount(String email, String pin) {
        this.email = email;
        this.pin = pin;
    }
    
    //Setters

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
    //Getters

    public String getEmail() {
        return email;
    }

    public String getPin() {
        return pin;
    }
    
    //Method to verify email
    public boolean verfyEmail(){
        if(email.contains("@") && email.length() > 8){
            System.out.println("The email is correctly formatted!");
            return true;
        }
        else{
            System.out.println("The email is incorrectly formatted!");
            return false;
        }
    }
    
    //Method to verify pin
    public boolean verifyPin(){
        String pattern1 = ".*[A-Z].*";
        String pattern2 = ".*[a-z].*";
        String pattern3 = ".*[0-9].*";
        String pattern4 = ".*[!@#$%^&*()_+-=].*";
        
        if(pin.matches(pattern1) && pin.matches(pattern2)){
            System.out.println("Pin Correct!");
            return true;
        }
        else{
            System.out.println("Pin incorrect!");
            return false;
        }
    }
    
    
    
}
