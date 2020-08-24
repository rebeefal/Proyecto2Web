


<%@ page import="VendeloAquiPack.Proveedor" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Rebeca
  Date: 7/20/2020
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%List<Proveedor> proveedorLista  = (List)request.getAttribute("proveedorLista");%>
<html>
<head>
    <title>Proveedores</title>
    <link rel="stylesheet" type="text/css" href="Estilo.css">
</head>
<body>
<h1> Proveedores</h1>


<div id="contenerdor1">
    <div>

        <% for (int i=0;i<proveedorLista.size();i++){ %>
        <div class="square">
            <lable> <h2> "Nombre: " <%=proveedorLista.get(i).getNombreProveedor() %> </h2> </lable>
            <lable> <h2> "Fecha: " <%=proveedorLista.get(i).getFechaInProveedor() %> </h2> </lable>
            <img src="<%=proveedorLista.get(i).getLogoProveedor()%>" >
            <form  action="<%=request.getContextPath()%>/ManejadorProductos" method="GET"  >
                <input  type="submit" name="nombreCedula" value="<%=proveedorLista.get(i).getCedulaJurFisProveedor() %>"/>
            </form>


            <%  }%>
            <form action="<%=request.getContextPath()%>/indexsrvlt" method ="POST" >
                <input type="submit"  value="Terminar"/>
            </form>
        </div>

    </div >
</div >

</body>
</html>

