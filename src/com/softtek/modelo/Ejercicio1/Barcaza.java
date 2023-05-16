package com.softtek.modelo;

public class Barcaza extends Vehiculo implements Nautico{
    @Override
    public String atracar() {
        return "Barcaza atracando" + getClass();
    }

    @Override
    public String navegar() {
        return "Barcaza navegando" + getClass();
    }
}
