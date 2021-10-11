/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import java.util.ArrayList;

/**
 *
 * @author amaaradji
 */
public class Liste {
    private ArrayList<Object> myList = new ArrayList<Object>();
    private int position = -1;
    
    public void Premier(){
        position = 0;
    }
    
    public void Dernier(){
        position = myList.size()-1;
    }
    
    public Object Suivant(){
        Object obj = null;
        position++;
        if (position >= myList.size())
            System.out.println("ERROR");
        else
            obj = myList.get(position);
        return obj;
    }
    
    public Object Supprimer(){
        Object obj = null;
        if (myList.isEmpty())
            System.out.println("ERROR");
        else
            obj = myList.remove(position);
        return obj;
    }
    
    public void Ajouter(Object obj){
        if (myList.isEmpty())
            myList.add(obj);
        else 
            myList.add(position, obj);
    }

    void afficher() {
        System.out.print(myList);
        System.out.println();
    }
    
}
