
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="EstiloPaginas.css">
</head>

<body>

<div id="container">
    <h1>&bull; Producto &bull;</h1>
    <div class="underline">
    </div>

    <form id="contact_formProd">
        <div class="name">

            <label for="cedulaJurFisProveedor"> Cedula Fisica o Juridica  </label>
            <input id="cedulaJurFisProveedor" name="cedulaJurFisProveedor" type="text" pattern="[0]\d{1}-\d{4}-\d{4}$|[3]-\d{3}-\d{6}$" required />

        </div>

        <div class="name">

            <label for="descripcionProducto"> Descripción del producto  </label>
            <input id="descripcionProducto" name="descripcionProducto" type="text" required />

        </div>

        <div class="name">

            <label for="descripcionEnganchaCliente"> Descripción para enganchar cliente  </label>
            <input id="descripcionEnganchaCliente" name="descripcionEnganchaCliente" type="text"  />

        </div>

        <div class="name">

            <label for="refrigeracionProducto"> Requiere refrigeracion </label>
            <input id="refrigeracionProducto" name="refrigeracionProducto" type="text"  />

        </div>

        <div class="name">

            <label for="costoProducto"> Costo </label>
            <input id="costoProducto" name="costoProducto" type="price"  required pattern="([1-9]|[1-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9][0-9][0-9]|[1-9][0-9][0-9][0-9][0-9]|[1-9][1-9][0-9][0-9][0-9][0-9]|1000000)"  />

        </div>

        <div class="name">

            <label for="porcentajeGananciaProducto"> Procentaje de ganacia </label>
            <input id="porcentajeGananciaProducto" name="porcentajeGananciaProducto" type="text" required pattern= "([1-9]|[0-4][0-9]|50)" />

        </div>


        <div class="name">

            <label for="cantidadStockProducto"> Cantidad disponible </label>
            <input id="cantidadStockProducto" name="cantidadStockProducto" type="text" required />

        </div>

        <div class="name">

            <label for="logoProducto"> Por favor ingrese el URL del logo </label>
            <input id="logoProducto" name="logoProducto" type="text" requiered pattern="https?:\/\/(www\.)?[-a-zA-Z0-9@:%._\+~#=]{1,256}\.[a-zA-Z0-9()]{1,6}\b([-a-zA-Z0-9()@:%_\+.~#?&//=]*)" />

        </div>

        <div class="submit">
            <input type="submit" value="Agregar" id="form_button" onclick="paramCallAjaxProductos()" />
        </div>

    </form><!-- // End form -->


    <form action="<%=request.getContextPath()%>/index.jsp"  class="boton-terminar" >
        <input type="submit"  value="Terminar"   />
    </form>
</div><!-- // End #container -->



<script type="text/javascript" src="funcion.js"></script>
</body>
</html>
