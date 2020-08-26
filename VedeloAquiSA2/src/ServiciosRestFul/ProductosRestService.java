package ServiciosRestFul;
import DAO.Datos;
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


    @Context
    HttpServletRequest request;
    @Context
    HttpServletResponse response;

    String idCompuesto;
    int x=0;

    @POST
    @Path("/agregarProducto")
    public void Agregar_Producto (@FormParam("cedulaJurFisProveedor" )String cedulaJurFisProveedor,
                                      //Para el idProducto, se va a utilizar la cedula
                                      @FormParam("descripcionProducto") String descripcionProducto,
                                      @FormParam("descripcionEnganchaCliente" )String descripcionEnganchaCliente,
                                      @FormParam("refrigeracionProducto") String refrigeracionProducto,
                                      @FormParam("costoProducto") String costoProducto,
                                      @FormParam("porcentajeGananciaProducto" )String porcentajeGananciaProducto,
                                      @FormParam("cantidadStockProducto") String cantidadStockProducto,
                                      @FormParam("logoProducto") String logoProducto)
            throws IOException, ServletException {
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

        request.setAttribute("mensaje", "el producto" + descripcionProducto + "se ingreso");
        request.getRequestDispatcher("/Producto.jsp").forward(request, response);

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
