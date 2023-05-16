package com.softtek.modelo.Ejercicio1;

public class Barcaza extends Vehiculo implements Nautico{
    @Override
    public String atracar() {
        return "Barcaza atracando " + getClass();
    }

    @Override
    public String navegar() {
        return "Barcaza navegando " + getClass();
    }
}
