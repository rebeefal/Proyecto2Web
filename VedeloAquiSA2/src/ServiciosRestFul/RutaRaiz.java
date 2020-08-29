package ServiciosRestFul;

import DAO.Datos;
import Objetos.Proveedor;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


@ApplicationPath("/api")
public class RutaRaiz extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = super.getClasses();
        HashSet h = new HashSet<Class<?>>();
        h.add(ProductosRestService.class);
        h.add(ProveedoresRestService.class);
        return super.getClasses();
    }
}


