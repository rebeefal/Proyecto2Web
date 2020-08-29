package DAO;

import Objetos.Proveedor;

import java.util.Comparator;
import java.util.List;

public class OrdenarPorCantProduc implements Comparator {


    public static int compare(Proveedor o1, Proveedor o2) {
        return o1.getCantidadProductos() - o2.getCantidadProductos();
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public Comparator reversed() {
        return null;
    }
}