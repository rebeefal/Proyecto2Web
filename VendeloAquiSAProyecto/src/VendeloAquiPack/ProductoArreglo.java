
package VendeloAquiPack;

import java.util.ArrayList;
import java.util.List;

public class ProductoArreglo {


    ManejadorProveedores manejadorProveedores = new ManejadorProveedores();
    String idCompuesto;
    int x=0;
    List<Producto> productoLista = new ArrayList<Producto>();
    List<Producto> productoListaPorProveedor = new ArrayList<Producto>();



    List<Producto> productoListaVacio = new ArrayList<Producto>();

    public void agregaElementoArreglo(String cedulaJurFisProveedor,
                                      String idProducto,
                                      String descripcionProducto,
                                      String descripcionEnganchaCliente,
                                      String refrigeracionProducto,
                                      String costoProducto,
                                      String porcentajeGananciaProducto,
                                      String cantidadStockProducto,
                                      String logoProductoInput){
        x++;
        idCompuesto = (idProducto + x).toString();
        Producto producto = new Producto();
        producto.setCedulaJurFisProveedor(cedulaJurFisProveedor);
        producto.setIdProducto(idCompuesto);
        producto.setDescripcionProducto(descripcionProducto);
        producto.setDescripcionEnganchaCliente(descripcionEnganchaCliente);
        producto.setRefrigeracionProducto(refrigeracionProducto);
        producto.setCostoProducto(costoProducto);
        producto.setPorcentajeGananciaProducto(porcentajeGananciaProducto);
        producto.setCantidadStockProducto(cantidadStockProducto);
        producto.setLogoProducto(logoProductoInput);

        productoLista.add(producto);
    }


    // esta funcion se utiliza para crear un arreglo con unicamente los productos de ese proveedor

    public void agregaElementoProductoListaPorProveedor(String cedulaJurFisProveedorP){

        for (int i=0;i<productoLista.size();i++){
            if( cedulaJurFisProveedorP.equals(productoLista.get(i).cedulaJurFisProveedor)){
                productoListaPorProveedor.add(productoLista.get(i));
            }
        }
    }

    public void limpiaTabla() {
        productoListaPorProveedor.clear();
    }



    public List<Producto> getProductoLista() {
        return productoLista;
    }

    public void setProductoLista(List<Producto> productoLista) {
        this.productoLista = productoLista;
    }


    public List<Producto> getProductoListaPorProveedor() {
        return productoListaPorProveedor;
    }

    public void setProductoListaPorProveedor(List<Producto> productoListaPorProveedor) {
        this.productoListaPorProveedor = productoListaPorProveedor;
    }

    public List<Producto> getProductoListaVacio() {
        return productoListaVacio;
    }

    public void setProductoListaVacio(List<Producto> productoListaVacio) {
        this.productoListaVacio = productoListaVacio;
    }


}
