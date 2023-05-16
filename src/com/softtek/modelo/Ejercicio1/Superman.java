package com.softtek.modelo.Ejercicio1;

public class Superman extends Kriptoniano implements ObjetoVolador{
    @Override
    public String despegar() {
        return "Superman despega " + getClass();
    }

    @Override
    public String aterrizar() {
        return "Superman aterriza " + getClass();
    }

    @Override
    public String volar() {
        return "Superman vuela" + getClass();
    }

    public String saltarEdificio() {
        return "Superman salta un edificio" + getClass();
    }

    public String detenerBala() {
        return "Superman detiene una bala" + getClass();
    }
}
