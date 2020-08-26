package ServiciosRestFul;

import DAO.Datos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/Proveedores")
public class ProveedoresRestService extends Datos {


    @Context
    HttpServletRequest request;
    @Context
    HttpServletResponse response;


    @POST
    @Path("/agregarProveedor")
    public void Agregar_Proveedor(@FormParam("cedulaJurFisProveedor") String cedulaJurFisProveedor,
                                  @FormParam("nombreProveedor") String nombreProveedor,
                                  @FormParam("fechaInProveedor") String fechaInProveedor,
                                  @FormParam("contrasenaProveedor") String contrasenaProveedor,
                                  @FormParam("logoProveedor") String logoProveedor)


        throws IOException, ServletException {

        agregarDatosLista(cedulaJurFisProveedor,
                nombreProveedor,
                fechaInProveedor,
                contrasenaProveedor,
                logoProveedor);


        request.setAttribute("mensaje", "el usuario" + nombreProveedor + "se ingreso");
        request.getRequestDispatcher("/").forward(request, response);
        }



    @GET
    @Path("/listarProveedores")
    @Produces(MediaType.APPLICATION_JSON)
    public Response Listar_Proveedores(){
        return Response.status(Response.Status.ACCEPTED).entity(listaProveedores()).build();
    }

    @PUT
    @Path("/actualizarProveedor")
    public Response Actualizar_Proveedor(@QueryParam("cedulaJurFisProveedor" )String cedulaJurFisProveedor,
                                         @QueryParam("nombreProveedor") String nombreProveedor,
                                         @QueryParam("fechaInProveedor") String fechaInProveedor,
                                         @QueryParam("contrasenaProveedor" )String contrasenaProveedor,
                                         @QueryParam("logoProveedor") String logoProveedor){

        actualizarDatosLista(cedulaJurFisProveedor,
                nombreProveedor,
                fechaInProveedor,
                contrasenaProveedor,
                logoProveedor);

        return Response.status(Response.Status.ACCEPTED).entity( getMensaje() ).build();
    }





}
