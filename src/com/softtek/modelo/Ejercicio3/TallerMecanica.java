package com.softtek.modelo.Ejercicio3;

public class TallerMecanica implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "Está reparandose en el taller mecánica";
    }
}
