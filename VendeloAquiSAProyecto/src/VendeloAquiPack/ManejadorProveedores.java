package VendeloAquiPack;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

@WebServlet(name="ManejadorProveedores" )
public class ManejadorProveedores extends HttpServlet {

    ProveedorArreglo proveedorArreglo = new ProveedorArreglo();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime ahora = LocalDateTime.now();
    String fechaProveedorInput = ahora.toString();
    // cuando se agregan datos al arreglo se utiliza el Post
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime ahora = LocalDateTime.now();
        proveedorArreglo.agregaElementoArreglo(request.getParameter("cedulaJurFisProveedorInput"),
                request.getParameter("nombreProveedorInput"),
                ( fechaProveedorInput ),
                request.getParameter("contrasenaProveedorInput"),
                request.getParameter("logoProveedorInput"));
        request.getRequestDispatcher("/ingresaProveedor.jsp").forward(request, response);

    }
    // cuando el usuario desea hacer compras, se utiliza el Get
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("proveedorLista", proveedorArreglo.getProveedorLista());
        //request.setAttribute("nombreProveedorInput", proveedorLista.get(0).entrada);
        request.getRequestDispatcher("/listaProveedoresCliente.jsp").forward(request, response);

    }

}
