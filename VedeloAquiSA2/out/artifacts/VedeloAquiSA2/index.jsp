<%--
  Created by IntelliJ IDEA.
  User: Rebeca
  Date: 7/21/2020
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Vendelo Aqui Menu principal</title>
  <link rel="stylesheet" type="text/css" href="Estilo.css">
</head>
<body>
<h1>Bienvenido a Vendelo Aqui</h1>

<div id="contenerdor1">
  <div>
    <div class="square">

      <form action="Proveedor.jsp" method ="POST" >
        <input type="submit"  value="Ingresar Proveedor" />
      </form>

      <form action="Producto.jsp" method ="POST" >
        <input type="submit"  value="Ingresar Producto"/>
      </form>

      <form action="<%=request.getContextPath()%>/api/Proveedores/listarProveedores" method ="GET" >
        <input type="submit"  value="Hacer compras"/>
      </form>

    </div>
  </div>
</div>
</body>
</html>

