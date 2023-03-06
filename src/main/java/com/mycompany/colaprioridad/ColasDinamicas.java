/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colaprioridad;

import EDD.Machote;

/**
 *
 * @author Danchita45
 */
public class ColasDinamicas<T> implements Machote {

    int f = -1;
    int a = -1;
    int n;
    Elefante[] cd = null;

    @Override
    public boolean vacio() {
        return (f == -1);
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
            f++;
            a++;
            return true;
        } else {
            f++;
            Elefante[] cde = new Elefante[f + 1];
            cde[f] = (Elefante) obj;
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
            Elefante elefante = cd[0];
            Elefante[] olifante = new Elefante[cd.length - 1];
            System.arraycopy(cd, a+1, olifante, 0, cd.length - 1);
            cd = new Elefante[olifante.length];
            System.arraycopy(olifante, 0, cd, 0, olifante.length);
            f--;
            return elefante;
        } else {
            Elefante fante= new Elefante();
            System.out.println("Cola vacia!!!...");
            return fante;
        }
    }
}
