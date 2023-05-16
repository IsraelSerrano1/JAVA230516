package com.softtek.modelo.Ejercicio1;

public class Avion extends Vehiculo implements ObjetoVolador{
    @Override
    public String despegar() {
        return "El avión despega " + getClass();
    }

    @Override
    public String aterrizar() {
        return "El avión aterriza "+ getClass();
    }

    @Override
    public String volar() {
        return "El avión vuela"+ getClass();

    }
}
