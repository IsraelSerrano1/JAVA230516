package com.softtek.presentacion;

import com.softtek.modelo.Ejercicio1.*;

public class MainInterfaces {
    public static void main(String[] args) {
        ObjetoVolador canario = new Ave();
        ObjetoVolador boeing = new Avion();
        ObjetoVolador clark = new Superman();
        ObjetoVolador hidroavion = new Hidroavion();
        Barcaza barca = new Barcaza();

        ObjetoVolador[] voladores = new ObjetoVolador[]{canario, boeing, clark, hidroavion};
        Nautico[] nauticos = new Nautico[]{(Nautico) hidroavion,barca};

        System.out.println("************Objetos Voladores**********");

        for (ObjetoVolador ob: voladores) {
            System.out.println(ob.despegar());
            System.out.println(ob.aterrizar());
            System.out.println(ob.volar());
            if (ob instanceof ObjetoVolador){
                System.out.println(ob.getClass());
            }
            if (ob instanceof Ave) {
                System.out.println(((Ave) canario).hacerNido());
                System.out.println(((Ave) canario).ponerHuevos());
            }
            if (ob instanceof Superman) {
                System.out.println(((Superman) clark).saltarEdificio());
                System.out.println(((Superman) clark).detenerBala());
            }
            if (ob instanceof Hidroavion) {
                System.out.println(((Hidroavion) hidroavion).atracar());
                System.out.println(((Hidroavion) hidroavion).navegar());
            }
        }

        System.out.println("************Nauticos**********");

        for (Nautico n: nauticos) {
            System.out.println(n.atracar());
            System.out.println(n.navegar());
            if(n instanceof Hidroavion) {
                System.out.println(hidroavion.despegar());
                System.out.println(hidroavion.aterrizar());
                System.out.println(hidroavion.volar());
            }
        }

    }
}
