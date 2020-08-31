package ServiciosRestFul;
import DAO.Datos;
import Objetos.Producto;
import Objetos.Proveedor;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

import javax.json.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/Productos")
public class ProductosRestService extends Datos {



    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JsonObject Agregar_Producto (Producto producto){
        agregarDatosLista(producto);
        return convertProductoToJson(producto);

    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonArray Listar_Productos (){
        JsonArrayBuilder jsonArray = Json.createArrayBuilder();
        for(Producto producto : listaProductos()){
            jsonArray.add(convertProductoToJson(producto));
        }
        return jsonArray.build();
    }


    // muestra los productos por proveedor
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonArray Listar_ProductosPorProveedor (@PathParam("id")String id ) {
        JsonArrayBuilder jsonArray = Json.createArrayBuilder();
        for(Producto producto : listaProductosPorProveedor(id)){
            jsonArray.add(convertProductoToJson(producto));
        }
        return jsonArray.build();
    }



    protected JsonObject convertProductoToJson(Producto producto){
        JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
        if (producto != null){
            jsonBuilder.add("cedulaJurFisProveedor" , producto.getCedulaJurFisProveedor());
            jsonBuilder.add("idProducto" , producto.getIdProducto());
            jsonBuilder.add("descripcionProducto" , producto.getDescripcionProducto());
            jsonBuilder.add("descripcionEnganchaCliente" , producto.getDescripcionEnganchaCliente());
            jsonBuilder.add("refrigeracionProducto" , producto.getRefrigeracionProducto());
            jsonBuilder.add("costoProducto" , producto.getCostoProducto());
            jsonBuilder.add("porcentajeGananciaProducto" , producto.getPorcentajeGananciaProducto());
            jsonBuilder.add("cantidadStockProducto" , producto.getCantidadStockProducto());
            jsonBuilder.add("logoProducto" , producto.getLogoProducto());
        }
        return jsonBuilder.build();
    }


}
