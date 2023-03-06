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

    private Nodo<T> Tope = null;
    private int tam=0;

    public Nodo<T> getTope() {
        return Tope;
    }

    public void setTope(Nodo<T> Tope) {
        this.Tope = Tope;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    

    @Override
    public boolean vacio() {
        return Tope == null;
    }

    @Override
    public boolean llena() {

        return false;

    }

    @Override
    public boolean inserta(Object obj) {
        Nodo Dato = (Nodo) obj;
        if (Dato == null) {
            System.out.println("Pila llena o no se puede insertar el dato");
            return false;
        } else {
            Dato.setSig(Tope);
            Tope = Dato;
            return true;
        }
    }

    @Override
    public Object elimina() {
        if (!vacio()) {
            System.out.println("no hay objetos a eliminar");
            return null;
        } else {
            Nodo d = Tope;
            Tope = Tope.sig;
            d.sig = null;
            return d;
        }

    }

}
//en una insercion primero se conecta el que llega y luego se mueven los que estaban(apuntadores)
//para eliminar, primero ubicamos dato a eliminar con apuntador, se mueven los que se quedan 
//al final se desconecta el que se va
