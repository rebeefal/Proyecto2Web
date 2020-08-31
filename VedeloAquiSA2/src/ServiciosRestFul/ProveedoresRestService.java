package ServiciosRestFul;

import DAO.Datos;
import Objetos.Producto;
import Objetos.Proveedor;

import javax.json.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/Proveedores")
public class ProveedoresRestService extends Datos {




    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JsonObject Agregar_Proveedor (Proveedor proveedor){
       agregarDatosLista(proveedor);
       return convertProveedorToJson(proveedor);

    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonArray Listar_Proveedores (){
        JsonArrayBuilder jsonArray = Json.createArrayBuilder();
        for(Proveedor proveedor : listaProveedores()){
            jsonArray.add(convertProveedorToJson(proveedor));
        }
        return jsonArray.build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JsonObject Listar_ProveedorPorId (@PathParam("id")String id ) {
        return convertProveedorToJson(listaProveedorPorId(id));
    }



    @PUT
    @Path("/update")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JsonObject Actualizar_Proveedor (Proveedor proveedor){
        actualizarDatosLista(proveedor);
        return convertProveedorToJson(proveedor);

    }


    protected JsonObject convertProveedorToJson(Proveedor proveedor){
        JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
        if (proveedor != null){
            jsonBuilder.add("cedulaJurFisProveedor" , proveedor.getCedulaJurFisProveedor());
            jsonBuilder.add("nombreProveedor" , proveedor.getNombreProveedor());
            jsonBuilder.add("fechaInProveedor" , proveedor.getFechaInProveedor());
            jsonBuilder.add("contrasenaProveedor" , proveedor.getContrasenaProveedor());
            jsonBuilder.add("acogeOfertasS" , proveedor.getAcogeOfertasS());
            jsonBuilder.add("logoProveedor" , proveedor.getLogoProveedor());
        }
        return jsonBuilder.build();
    }


}
