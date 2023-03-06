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
    public static PilasD Pila = new PilasD();

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1: ColasDinamicas");
        System.out.println("2: PilasDinamicas");
        System.out.println("3:Salir");
        String var = teclado.nextLine();
        switch (var) {
            case "1":
                menuCD();
                break;
            case "2":
                menuPD();
            case "3":
                System.exit(0);
            default:
                throw new AssertionError();
        }
    }

    public static void menuCD() {
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
                menuCD();
                break;
            case "2":
                Elefante elefant = (Elefante) Cola.elimina();
                System.out.println(elefant.etiqueta);
                menuCD();
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
                menuCD();
            case "4":
                menuPrincipal();
            default:
                System.out.println("Opcion NO valida");
                menuCD();
        }
    }

    private static void menuPD() {
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
                Pila.inserta(elefante);
                menuPD();
                break;
            case "2":
                Elefante elefant = (Elefante) Pila.elimina();
                System.out.println(elefant.etiqueta);
                menuPD();
                break;
            case "3":
                System.out.println(Pila.cd[Pila.Tope].etiqueta);
                menuPD();
                break;  
            case "4":
                menuPrincipal();
                break;  
            default:
                System.out.println("Opcion no valida");
                menuPD();
                break;
        }
        
    }
}
