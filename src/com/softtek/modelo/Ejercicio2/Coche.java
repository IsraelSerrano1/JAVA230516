package com.softtek.modelo.Ejercicio2;

public class Coche implements IVehiculo {
    private int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    public Coche() {
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        if (this.deposito > 0) {
            return "Moviendose";
        }else
            return "No se puede moverse";
    }

}
