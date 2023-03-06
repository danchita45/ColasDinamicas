/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.colaprioridad;

import java.util.Scanner;

/**
 *
 * @author danchita45
 */
public class ColaPrioridad {

    public static ColasDinamicas Cola = new ColasDinamicas();

    public static void main(String[] args) {

        menu();
    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1: Inserta");
        System.out.println("2: Elimina");
        System.out.println("3:muestra");
        System.out.println("4:salir");
        String var = teclado.nextLine();

        switch (var) {
            case "1":
                Elefante elefante = new Elefante();
                System.out.println("ingrese etiqueta elefante");
                elefante.etiqueta = teclado.nextLine();
                Cola.inserta(elefante);
                menu();
                break;
            case "2":
                Elefante elefant = (Elefante) Cola.elimina();
                System.out.println(elefant.etiqueta);
                menu();
                break;
            case "3":
                if (Cola.vacio()) {
                    System.out.println("Cola vacia, agrega elementos");
                } else {
                    for (int i = 0; i < Cola.cd.length; i++) {
                        if (Cola.cd[i] != null) {
                            System.out.println(Cola.cd[i].etiqueta);
                        }
                    }
                }
                menu();
            case "4":
                System.exit(0);
            default:
                System.out.println("Opcion NO valida");
                menu();
        }
    }
}
