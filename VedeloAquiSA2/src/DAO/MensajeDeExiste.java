package DAO;

public class MensajeDeExiste {


    String existe;
    String mensaje;

    public String muestraMensaje(int codigo) {

        switch (codigo) {
            case 0:
                setMensaje("Ya existe");
                System.out.println("");
                break;
            case 1:
                setMensaje("Se ha ingresado correctamente");
                System.out.println("Se ha ingresado correctamente");
                break;
            case 2:
                setMensaje("Se actualizó el proveedor ");
                break;
            case 3:
                setMensaje("El proveedor de ese producto no ha sido ingresado: ");
                break;
        }
        return mensaje;


    }

        public String getExiste() {
            return existe;
        }

        public void setExiste(String existe) {
            this.existe = existe;
        }

        public String getMensaje() {
            return mensaje;
        }

        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }



}
