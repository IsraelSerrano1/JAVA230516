package com.softtek.modelo.Ejercicio3;

public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "Esta reparandose en el taller de pintura";
    }
}
