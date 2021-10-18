/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.to3;

import java.util.ArrayList;
import java.util.Collections;
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
        Carre c1 = new Carre();
        Scanner s = new Scanner(System.in);
        System.out.println("donner la longueur ");
        
        try {
            double longeur = s.nextDouble();
            if (longeur < 0)
                throw new LongNegativeException();
            
            Carre c2 = new Carre(longeur);

            Carre c3 = new Carre(c2);
            
            System.out.println("c1  " + c1.getSurface());
            System.out.println("c2  " + c2.getSurface());
            System.out.println("c3  " + c3.getSurface());
            
            ArrayList<Forme> list = new ArrayList<>();
            list.add(new Carre(7));
            list.add(new Carre(3));
            list.add(new Carre(5));
            
   
            System.out.println(list);
            
            Collections.sort(list);
            
            System.out.println(list);
            
            myComparator comparator = new myComparator();
            
            Collections.sort(list, comparator);
            
            
            
        } catch (LongNegativeException e) {
            System.out.println(e);
        } 
        catch (Exception e) {
            System.out.println("attention exception");
        }
        
        
    }
    
}
