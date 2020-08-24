

<%@ page import="VendeloAquiPack.Producto" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Rebeca
  Date: 7/20/2020
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%List<Producto> productoLista  = (List)request.getAttribute("productoLista");%>
<%List<Producto> productoListaPorProveedor  = (List)request.getAttribute("productoListaPorProveedor");%>

<html>
<head>
    <title>Productos </title>
    <link rel="stylesheet" type="text/css" href="Estilo.css">

</head>
<body>
<h1> Proveedores</h1>


<div id="contenerdor1">



    <% for (int i=0;i<productoListaPorProveedor.size();i++){ %>

    <div class="square">
        <h2> Descripcion:  <%=productoListaPorProveedor.get(i).getDescripcionProducto() %>  </h2>
        <h2> Precio:  <%=productoListaPorProveedor.get(i).getCostoProducto() %>  </h2>
        <h2> Unidades disponibles: <%=productoListaPorProveedor.get(i).getCantidadStockProducto() %>   </h2>
        <img src="<%=productoListaPorProveedor.get(i).getLogoProducto()%>" >

        <form method ="POST">
            <input type="Submit" value="Agregar al carrito" /> </form>

        <%  }%>

        <form action="<%=request.getContextPath()%>/indexsrvlt" method ="POST" >
            <input type="submit"  value="Terminar"   />
        </form>
    </div>

</div>

</body>
</html>
