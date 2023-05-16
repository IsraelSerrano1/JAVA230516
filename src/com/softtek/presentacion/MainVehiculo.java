package com.softtek.presentacion;

import com.softtek.modelo.Ejercicio2.Coche;
import com.softtek.modelo.Ejercicio2.Conductor;

public class MainVehiculo {
    public static void main(String[] args) {
        Conductor conductor = new Conductor(new Coche(0));

        System.out.println(conductor.conducir());
    }
}
