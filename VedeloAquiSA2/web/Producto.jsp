<%--
  Created by IntelliJ IDEA.
  User: Rebeca
  Date: 7/20/2020
  Time: 8:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ingreso de producto</title>
    <link rel="stylesheet" type="text/css" href="Estilo.css">
</head>
<body>
<h1>Producto</h1>


<% String variable = request.getParameter("cedulaJurFisProveedorInput");%>


<div id="contenerdor1">
    <div>
        <div class="square">


            <form action="<%=request.getContextPath()%>/api/Productos/agregarProducto" method ="POST" >



                <lable id="cedulaJurFisProveedorLable"> <h2> Cedula Fisica o Juridica </h2> </lable>
                <input name="cedulaJurFisProveedor" type="text" pattern="[0]\d{1}-\d{4}-\d{4}$|[3]-\d{3}-\d{6}$" required />


                <lable id="descrProductoLable" > <h2> Descripción del producto:</h2> </lable>
                <input name="descrProductoInput" type="text" required pattern="^{1,120}$"/>


                <lable id="descrEnganClienteProductoLable"  > <h2>Descripción para enganchar cliente:</h2> </lable>
                <input name="descrEnganClienteProductoInput" type="text" pattern="^{1,200}$" />


                <h2>Requiere refrigeracion:</h2>
                <input name="refrigeracionProductoInput"  required type="checkbox"/>


                <lable id="costoProductoLable"> <h2>Costo: </h2> </lable>
                <input name="costoProductoInput" type="price"  required pattern="([1-9]|[1-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9][0-9][0-9]|[1-9][0-9][0-9][0-9][0-9]|[1-9][1-9][0-9][0-9][0-9][0-9]|1000000)"  />


                <lable id="porcentajeGananciaProductoLabel"> <h2>Procentaje de ganacia:</h2> </lable>
                <input name="porcentajeGananciaProductoInput" type="text" required pattern= "([1-9]|[0-4][0-9]|50)" />


                <lable id="cantidadStockProductoLable" > <h2>Cantidad disponible: </h2> </lable>
                <input name="cantidadStockProductoInput" type="text" required />



                <lable id="logoProductoLable" > <h2>Por favor ingrese el URL del logo </h2> </lable>
                <input name="logoProductoInput" type="text" requiered pattern="https?:\/\/(www\.)?[-a-zA-Z0-9@:%._\+~#=]{1,256}\.[a-zA-Z0-9()]{1,6}\b([-a-zA-Z0-9()@:%_\+.~#?&//=]*)" />



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