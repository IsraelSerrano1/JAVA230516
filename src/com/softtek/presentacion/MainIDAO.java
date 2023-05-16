package com.softtek.presentacion;

import com.softtek.modelo.Ejercicio4.*;

public class MainIDAO {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan","123456789Z");
        IDAO produccion = new AccesoProduccion();
        IDAO desarrollo = new AccesoDesarrollo();
        ClienteDAO  cliDao = new ClienteDAO(produccion);

        System.out.println("El cliente: " + cliente.getNombre() + " con NIF: " +
                cliente.getNIF() + " tiene " + cliDao.insertar(cliente));

        cliDao.setConexion(desarrollo);
        System.out.println("El cliente: " + cliente.getNombre() + " con NIF: " +
                cliente.getNIF() + " tiene " + cliDao.insertar(cliente));

    }
}
