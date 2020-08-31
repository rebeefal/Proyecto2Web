<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="EstiloPaginas.css">
</head>

<body>


<% String cedulaJurFisProveedor = request.getParameter("cedulaJurFisProveedor");%>
<% String nombreProveedor = request.getParameter("nombreProveedor");%>
<% String fechaInProveedor = request.getParameter("fechaInProveedor");%>
<% String contrasenaProveedor = request.getParameter("contrasenaProveedor");%>
<% String acogeOfertasS = request.getParameter("acogeOfertasS");%>
<% String logoProveedor = request.getParameter("logoProveedor");%>


<div id="container">
    <h1>&bull; Proveedor &bull;</h1>
    <div class="underline">
    </div>
    <div class="icon_wrapper">

    </div>
    <form  name="contact_form" id="contact_form" >
<div id="actualizarContenedor">
        <div class="name">

            <label for="cedulaJurFisProveedor"> Nombre del proveedor:  </label>
            <input id="cedulaJurFisProveedor" name="cedulaJurFisProveedor" type="text"    required />

        </div>
        <div class="submit">
            <input type="submit" value="Cargar datos"  onclick="cargarDatos()"/>
        </div>

</div>

    </form><!-- // End form -->



    <form action="<%=request.getContextPath()%>/index.jsp"  >
        <input type="submit"  value="Terminar"   />
    </form>


</div><!-- // End #container -->

<script type="text/javascript" src="funcion.js"></script>
</body>
</html>
