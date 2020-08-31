package Objetos;

public class Producto {


    String cedulaJurFisProveedor; // variable para conectar los productos con los proveedores.
    String idProducto;
    String descripcionProducto;
    String descripcionEnganchaCliente;
    String refrigeracionProducto;
    String costoProducto;
    String porcentajeGananciaProducto;
    String cantidadStockProducto;
    String logoProducto;
    String entrada;


    public Producto(){};

    public Producto(String cedulaJurFisProveedor,
                    String idProducto,
                    String descripcionProducto,
                    String descripcionEnganchaCliente,
                    String refrigeracionProducto,
                    String costoProducto,
                    String porcentajeGananciaProducto,
                    String cantidadStockProducto,
                    String logoProducto
    ) {
        this.cedulaJurFisProveedor = cedulaJurFisProveedor;
        this.idProducto = idProducto;
        this.descripcionProducto = descripcionProducto;
        this.descripcionEnganchaCliente = descripcionEnganchaCliente;
        this.refrigeracionProducto = refrigeracionProducto;
        this.costoProducto = costoProducto;
        this.porcentajeGananciaProducto = porcentajeGananciaProducto;
        this.cantidadStockProducto = cantidadStockProducto;
        this.logoProducto = logoProducto;
    }

    public void mostrarEntradas(){
        entrada = ("las entradas son: " + idProducto);

    }



    public String getCedulaJurFisProveedor() {
        return cedulaJurFisProveedor;
    }

    public void setCedulaJurFisProveedor(String cedulaJurFisProveedor) {
        this.cedulaJurFisProveedor = cedulaJurFisProveedor;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getDescripcionEnganchaCliente() {
        return descripcionEnganchaCliente;
    }

    public void setDescripcionEnganchaCliente(String descripcionEnganchaCliente) {
        this.descripcionEnganchaCliente = descripcionEnganchaCliente;
    }

    public String getRefrigeracionProducto() {
        return refrigeracionProducto;
    }

    public void setRefrigeracionProducto(String refrigeracionProducto) {
        this.refrigeracionProducto = refrigeracionProducto;
    }

    public String getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(String costoProducto) {
        this.costoProducto = costoProducto;
    }

    public String getPorcentajeGananciaProducto() {
        return porcentajeGananciaProducto;
    }

    public void setPorcentajeGananciaProducto(String porcentajeGananciaProducto) {
        this.porcentajeGananciaProducto = porcentajeGananciaProducto;
    }

    public String getCantidadStockProducto() {
        return cantidadStockProducto;
    }

    public void setCantidadStockProducto(String cantidadStockProducto) {
        this.cantidadStockProducto = cantidadStockProducto;
    }

    public String getLogoProducto() {
        return logoProducto;
    }

    public void setLogoProducto(String logoProducto) {
        this.logoProducto = logoProducto;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }



}
