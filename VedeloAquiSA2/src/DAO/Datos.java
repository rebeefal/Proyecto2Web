package DAO;

import Objetos.Producto;
import Objetos.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class Datos {

    String mensaje;


    private static List<Proveedor> proveedores = new ArrayList<Proveedor>();
    private Proveedor proveedor;

    private static List<Producto> productos = new ArrayList<Producto>();
    private Producto producto;

    private static List<Producto> productosPorProveedor = new ArrayList<Producto>();




    public void agregarDatosLista(String cedulaJurFisProveedor,
                                  String nombreProveedor,
                                  String fechaInProveedor,
                                  String contrasenaProveedor,
                                  String logoProveedor ){

        if(proveedorExiste(cedulaJurFisProveedor)){

            muestraMensaje(0);


        }else{
            Proveedor proveedor = new Proveedor();
            proveedor.setCedulaJurFisProveedor(cedulaJurFisProveedor);
            proveedor.setNombreProveedor(nombreProveedor);
            proveedor.setFechaInProveedor(fechaInProveedor);
            proveedor.setContrasenaProveedor(contrasenaProveedor);
            proveedor.setLogoProveedor(logoProveedor);

            proveedores.add(proveedor);

            muestraMensaje(1);

        }
    }


    public void agregarDatosLista(String cedulaJurFisProveedor,
                                  String idProducto,
                                  String descripcionProducto,
                                  String descripcionEnganchaCliente,
                                  String refrigeracionProducto,
                                  String costoProducto,
                                  String porcentajeGananciaProducto,
                                  String cantidadStockProducto,
                                  String logoProducto){



        if(!proveedorExiste(cedulaJurFisProveedor)){
            muestraMensaje(3);

        }else if(productoExiste(idProducto)){

            muestraMensaje(0);

        }else{
            Producto producto = new Producto();
            producto.setCedulaJurFisProveedor(cedulaJurFisProveedor);
            producto.setIdProducto(idProducto);
            producto.setDescripcionProducto(descripcionProducto);
            producto.setDescripcionEnganchaCliente(descripcionEnganchaCliente);
            producto.setRefrigeracionProducto(refrigeracionProducto);
            producto.setCostoProducto(costoProducto);
            producto.setPorcentajeGananciaProducto(porcentajeGananciaProducto);
            producto.setCantidadStockProducto(cantidadStockProducto);
            producto.setLogoProducto(logoProducto);

            productos.add(producto);

            muestraMensaje(1);

        }
    }






    public boolean proveedorExiste(String id){

        boolean existe = false;
        for(Proveedor a : proveedores ){
            if (Integer.parseInt((id)) == Integer.parseInt(a.getCedulaJurFisProveedor()) ){
                existe = true;
            }
        }
        return existe;
    }

    public boolean productoExiste(String id){

        boolean existe = false;
        for(Producto p : productos ){
            if (Integer.parseInt(p.getIdProducto()) == Integer.parseInt((id))){
                existe = true;
            }
        }
        return existe;
    }


    public List<Proveedor> listaProveedores(){
        return proveedores;
    }
    public List<Producto> listaProductos(){
        return productos;
    }




    public void actualizarDatosLista(String cedulaJurFisProveedor,
                                     String nombreProveedor,
                                     String fechaInProveedor,
                                     String contrasenaProveedor,
                                     String logoProveedor ){


        int x=0;
        Proveedor proveedorActualizado = new Proveedor();
        proveedorActualizado.setCedulaJurFisProveedor(cedulaJurFisProveedor);
        proveedorActualizado.setNombreProveedor(nombreProveedor);
        proveedorActualizado.setFechaInProveedor(fechaInProveedor);
        proveedorActualizado.setContrasenaProveedor(contrasenaProveedor);
        proveedorActualizado.setLogoProveedor(logoProveedor);



        for ( Proveedor p : proveedores){

            if ( Integer.parseInt(cedulaJurFisProveedor) == Integer.parseInt(p.getCedulaJurFisProveedor())){
                proveedores.set(x, proveedorActualizado);
                muestraMensaje(2);
            }
            x++;
        }
    }






    private String muestraMensaje(int codigo){

        switch (codigo){
            case 0:
                setMensaje( "Ya existe");
                break;
            case 1:
                setMensaje( "Se ha ingresado correctamente");
                break;
            case 2:
                setMensaje( "Se actualizó el proveedor ");
                break;
            case 3:
                setMensaje( "El proveedor de ese producto no ha sido ingresado: ");
                break;
        }
        return mensaje;

    }



    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }






}
