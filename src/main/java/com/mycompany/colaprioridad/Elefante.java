/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colaprioridad;

/**
 *
 * @author Danchita45
 */
public class Elefante {
    String etiqueta;

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Elefante{" + "etiqueta=" + etiqueta + '}';
    }

    public Elefante() {
    }

    public Elefante(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    
}
