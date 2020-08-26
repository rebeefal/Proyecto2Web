

<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Rebeca
  Date: 7/20/2020
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ingreso de proveedor</title>
    <link rel="stylesheet" type="text/css" href="Estilo.css">
</head>
<body>

<h1>Proveedor</h1>

<% String variable = request.getParameter("cedulaJurFisProveedorInput");%>


<div id="contenerdor1">
    <div>
        <div class="square">


            <form action="<%=request.getContextPath()%>/api/Proveedores/agregarProveedor" method ="POST" >

                <lable id="cedulaJurFisProveedorLable"> <h2> Cedula Fisica o Juridica </h2> </lable>
                <input name="cedulaJurFisProveedor" type="text" pattern="[0]\d{1}-\d{4}-\d{4}$|[3]-\d{3}-\d{6}$" required />

                <lable id="nombreProveedorInputLable"> <h2>Nombre del proveedor</h2></lable>
                <input name="nombreProveedor" type="text"  pattern="^{1,120}$"  required />


                <lable id="contrasenaProveedorInputLable"> <h2>Contrasena</h2> </lable>
                <input name="contrasenaProveedor" type="password" pattern="(?=(.*[0-9]){2})(?=.*[a-z])(?=.*[A-Z]).{8,}" required/>

                <lable id="imagenProveedorLable" > <h2>Por favor ingrese el URL del logo </h2> </lable>
                <input name="logoProveedor" type="text" />

                <input type="submit" value="Agregar" />

            </form>

            <form action="<%=request.getContextPath()%>/index.jsp" method ="POST" >

                <input type="submit"  value="Terminar"/>

            </form>

        </div>
    </div>
</div>

</body>
</html>