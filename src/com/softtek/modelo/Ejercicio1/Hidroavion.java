package com.softtek.modelo;

public class Hidroavion extends Avion implements Nautico{
    @Override
    public String atracar() {
        return "El hidroavión atracando" + getClass();
    }

    @Override
    public String navegar() {
        return "El hidroavión navegando" + getClass();
    }
}
