package VendeloAquiPack;

import java.util.ArrayList;
import java.util.List;

public class ProveedorArreglo {

    public List<Proveedor> getProveedorLista() {
        return proveedorLista;
    }

    public void setProveedorLista(List<Proveedor> proveedorLista) {
        this.proveedorLista = proveedorLista;
    }

    List<Proveedor> proveedorLista = new ArrayList<Proveedor>();

    public void agregaElementoArreglo(String cedulaJurFisProveedor,
                                      String nombreProveedor,
                                      String fechaInProveedor,
                                      String contrasenaProveedor,
                                      String logoProveedorInput){

        Proveedor proveedor = new Proveedor();
        proveedor.setCedulaJurFisProveedor(cedulaJurFisProveedor);
        proveedor.setNombreProveedor(nombreProveedor);
        proveedor.setFechaInProveedor(fechaInProveedor);
        proveedor.setContrasenaProveedor(contrasenaProveedor);
        proveedor.setLogoProveedor(logoProveedorInput);

        proveedorLista.add(proveedor);
    }

}
