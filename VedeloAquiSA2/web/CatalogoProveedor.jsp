<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="EstiloPaginas.css">
</head>

<body>

<br/>

<button onclick="searchProveedor()">Search</button>
<br/>
<div id="contenedorProveedores" class="contenedor-catalogo">


</div>

<div id="contenedorProductos" class="contenedor-catalogo">


</div>


<form action="<%=request.getContextPath()%>/index.jsp"  class="boton-terminar" >
    <input type="submit"  value="Terminar"   />
</form>


<br/>



<script type="text/javascript" src="funcion.js"></script>
</body>
</html>
