package com.softtek.presentacion;

import com.softtek.modelo.Ejercicio3.*;

public class MainTaller {
    public static void main(String[] args) {
        ITaller mecanica = new TallerMecanica();
        ITaller pintura = new TallerPintura();
        Coche coche = new Coche("1234HDP", "Renault");
        SeguroCoche seguro = new SeguroCoche(pintura, "Mutua Madrileña");

        System.out.println("El coche " + coche.getModelo() + " con matrícula: " +
                coche.getMatricula() + "del seguro " + seguro.getAseguradora() + " " + seguro.reparar(coche));

        seguro.setTaller(mecanica);
        System.out.println("El coche " + coche.getModelo() + " con matrícula: " +
                coche.getMatricula() + "del seguro " + seguro.getAseguradora() + " " + seguro.reparar(coche));
    }
}
