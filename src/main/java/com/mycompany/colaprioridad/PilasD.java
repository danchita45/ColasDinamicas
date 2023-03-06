/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colaprioridad;

import EDD.Machote;

/**
 *
 * @author danchita45
 * @param <T>
 */
public class PilasD<T> implements Machote {

    int Tope =-1;
    Elefante[] cd =null;
    public static Elefante elef = new Elefante();
    
    @Override
    public boolean vacio() {
        return (Tope==-1);
    }

    @Override
    public boolean llena() {
       return false;     
    }

    @Override
    public boolean inserta(Object obj) {
        if (vacio()) {
            cd = new Elefante[1];
            cd[0] = (Elefante) obj;
            Tope++;
            return true;
        } else {
            Tope++;
            Elefante[] cde = new Elefante[Tope + 1];
            cde[Tope] = (Elefante) obj;
            int i = 0;
            for (Elefante f : cd) {
                cde[i] = f;
                i++;
            }
            cd = new Elefante[cde.length];
            System.arraycopy(cde, 0, cd, 0, cde.length);
            return true;
        }
    }

    @Override
    public Object elimina() {
         if (!vacio()) {
            Elefante elefante = cd[Tope];
            Elefante[] olifante = new Elefante[cd.length - 1];
            System.arraycopy(cd, 0, olifante, 0, cd.length - 1);
            cd = new Elefante[olifante.length];
            System.arraycopy(olifante, 0, cd, 0, olifante.length);
            Tope--;
            return elefante;
        } else {
            Elefante fante= new Elefante();
            System.out.println("Cola vacia!!!...");
            return fante;
        }
    }

    

}