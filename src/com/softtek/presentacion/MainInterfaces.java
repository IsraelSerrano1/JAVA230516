package com.softtek.presentacion;

import com.softtek.modelo.Ave;
import com.softtek.modelo.Avion;
import com.softtek.modelo.ObjetoVolador;
import com.softtek.modelo.Superman;

public class Main {
    public static void main(String[] args) {
        ObjetoVolador canario = new Ave();
        ObjetoVolador boeing = new Avion();
        ObjetoVolador clark = new Superman();

        ObjetoVolador[] voladores = new ObjetoVolador[]{canario, boeing, clark};

        for (ObjetoVolador ob: voladores) {
            System.out.println(ob.despegar());
            System.out.println(ob.aterrizar());
            System.out.println(ob.volar());
            if (ob instanceof Ave) {
                System.out.println(((Ave) canario).hacerNido());
                System.out.println(((Ave) canario).ponerHuevos());
            }
            if (ob instanceof Superman) {
                System.out.println(((Superman) clark).saltarEdificio());
                System.out.println(((Superman) clark).detenerBala());

            }
        }
    }
}
