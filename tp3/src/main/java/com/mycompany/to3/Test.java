/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.to3;

import java.util.Scanner;

/**
 *
 * @author amaaradji
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test fonctionne");
        Carre c = new Carre();
        Scanner s = new Scanner(System.in);
        System.out.println("donner la longueur ");
        
        try {
            double longeur = s.nextDouble();
            if (longeur < 0){
                LongNegativeException myEx = new LongNegativeException();
                throw myEx;
            }
        } catch (LongNegativeException e) {
            System.out.println(e);
        } 
        catch (Exception e) {
            System.out.println("attention exception");
        }
        
        
    }
    
}
