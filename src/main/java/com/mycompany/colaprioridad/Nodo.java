/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colaprioridad;

/**
 *
 * @author danchita45
 */
public class Nodo<T> {

    String etiqueta;
    Object TObj;
    Nodo sig;

    public Nodo(String etiqueta, Object TObj) {
        this.etiqueta = etiqueta;
        this.TObj = TObj;
        this.sig = null;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Object getTObj() {
        return TObj;
    }

    public void setTObj(Object TObj) {
        this.TObj = TObj;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "Nodo{" + "etiqueta=" + etiqueta + '}';
    }
    

}
