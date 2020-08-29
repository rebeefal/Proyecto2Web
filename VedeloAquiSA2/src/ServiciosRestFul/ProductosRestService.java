package ServiciosRestFul;
import DAO.Datos;
import Objetos.Producto;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/Productos")
public class ProductosRestService extends Datos {




    String idCompuesto;
    int x=0;

    @POST
    @Path("/agregarProducto")
    public Response Agregar_ProductoViejo (@QueryParam("cedulaJurFisProveedor" )String cedulaJurFisProveedor,
                                      //Para el idProducto, se va a utilizar la cedula
                                      @QueryParam("descripcionProducto") String descripcionProducto,
                                      @QueryParam("descripcionEnganchaCliente" )String descripcionEnganchaCliente,
                                      @QueryParam("refrigeracionProducto") String refrigeracionProducto,
                                      @QueryParam("costoProducto") String costoProducto,
                                      @QueryParam("porcentajeGananciaProducto" )String porcentajeGananciaProducto,
                                      @QueryParam("cantidadStockProducto") String cantidadStockProducto,
                                      @QueryParam("logoProducto") String logoProducto)
             {
        x++;
        setIdCompuesto((cedulaJurFisProveedor + x).toString());
        agregarDatosLista(cedulaJurFisProveedor,
                                    getIdCompuesto(),
                                    descripcionProducto,
                                    descripcionEnganchaCliente,
                                    refrigeracionProducto,
                                    costoProducto,
                                    porcentajeGananciaProducto,
                                    cantidadStockProducto,
                                    logoProducto);

        return Response.status(Response.Status.ACCEPTED).entity(getMensaje()).build();
    }




    @GET
    @Path("/listarProducto")
    @Produces(MediaType.APPLICATION_JSON)
    public Response Listar_Productos_Proveedor (){
        return Response.status(Response.Status.ACCEPTED).entity(listaProductos()).build();
    }

    public String getIdCompuesto() {
        return idCompuesto;
    }

    public void setIdCompuesto(String idCompuesto) {
        this.idCompuesto = idCompuesto;
    }
}
