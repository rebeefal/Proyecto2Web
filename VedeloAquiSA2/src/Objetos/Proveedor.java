package Objetos;

public class Proveedor {




    String cedulaJurFisProveedor;
    String nombreProveedor;
    String fechaInProveedor;
    String contrasenaProveedor;
    String logoProveedor;
    public String entrada;

    public Proveedor(){};
    public Proveedor(String cedulaJurFisProveedor,
                     String nombreProveedor,
                     String fechaInProveedor,
                     String contrasenaProveedor,
                     String logoProveedor) {
        this.cedulaJurFisProveedor = cedulaJurFisProveedor;
        this.nombreProveedor = nombreProveedor;
        this.fechaInProveedor = fechaInProveedor;
        this.contrasenaProveedor = contrasenaProveedor;
        this.logoProveedor = logoProveedor;

    }







    public void mostrarEntradas(){
        entrada = ("las entradas son: " + cedulaJurFisProveedor);

    }


    public String getCedulaJurFisProveedor() {
        return cedulaJurFisProveedor;
    }

    public void setCedulaJurFisProveedor(String cedulaJurFisProveedor) {
        this.cedulaJurFisProveedor = cedulaJurFisProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getFechaInProveedor() {
        return fechaInProveedor;
    }

    public void setFechaInProveedor(String fechaInProveedor) {
        this.fechaInProveedor = fechaInProveedor;
    }

    public String getContrasenaProveedor() {
        return contrasenaProveedor;
    }

    public void setContrasenaProveedor(String contrasenaProveedor) {
        this.contrasenaProveedor = contrasenaProveedor;
    }

    public String getLogoProveedor() {
        return logoProveedor;
    }

    public void setLogoProveedor(String logoProveedor) {
        this.logoProveedor = logoProveedor;
    }




}
