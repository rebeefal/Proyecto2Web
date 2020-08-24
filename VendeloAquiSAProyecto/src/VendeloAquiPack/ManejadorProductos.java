package VendeloAquiPack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "ManejadorProductos")


public class ManejadorProductos extends HttpServlet {

    ProductoArreglo productoArreglo = new ProductoArreglo();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        productoArreglo.agregaElementoArreglo(
                request.getParameter("cedulaJurFisProveedorInput"),
                request.getParameter("idProductoInput" ),
                request.getParameter("descrProductoInput"),
                request.getParameter("descrEnganClienteProductoInput"),
                request.getParameter("refrigeracionProductoInput"),
                request.getParameter("costoProductoInput"),
                request.getParameter("porcentajeGananciaProductoInput"),
                request.getParameter("cantidadStockProductoInput"),
                request.getParameter("logoProductoInput"));

        request.getRequestDispatcher("/ingresaProducto.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        productoArreglo.limpiaTabla();
        productoArreglo.agregaElementoProductoListaPorProveedor(request.getParameter("nombreCedula"));

        request.setAttribute("productoListaPorProveedor", productoArreglo.getProductoListaPorProveedor());
        //request.setAttribute("productoLista", productoArreglo.getProductoLista());
        //request.setAttribute("nombreProveedorInput", proveedorLista.get(0).entrada);
        request.getRequestDispatcher("/listaProductosProveedorCliente.jsp").forward(request, response);

    }
}


