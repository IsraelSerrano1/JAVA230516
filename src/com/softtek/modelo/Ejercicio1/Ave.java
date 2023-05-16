package com.softtek.modelo.Ejercicio1;

public class Ave extends Animal implements ObjetoVolador{

    @Override
    public String despegar() {
        return "El ave despega " + getClass();
    }

    @Override
    public String aterrizar() {
        return "El ave aterriza " + getClass();
    }

    @Override
    public String volar() {
        return "El ave vuela" + getClass();
    }

    public String hacerNido(){
        return "El ave hace un nido";
    }

    public String ponerHuevos(){
        return "El ave pone huevos";
    }
}
