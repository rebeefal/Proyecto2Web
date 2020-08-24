<%--
  Created by IntelliJ IDEA.
  User: Rebeca
  Date: 7/22/2020
  Time: 6:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Selección de proveedor</title>
    <link rel="stylesheet" type="text/css" href="Estilo.css">
</head>
<body>

<h1>  Elige el proveedor:  </h1>

<div id="contenerdor1">
    <div>
        <div class="square">


            <form action="ingresaProducto.jsp" method ="POST" >

                <lable name="cedulaJurFisProveedorInput"> <h2> Ingrese el numero de cédula del proveedor </h2> </lable>
                <input name="cedulaJurFisProveedorInput" type="text" pattern="[0]\d{1}-\d{4}-\d{4}$|[3]-\d{3}-\d{6}$" required/>
                <input type="submit" value="Ingresar productos"/>


            </form>

        </div>
    </div>
</div>
</body>
</html>
