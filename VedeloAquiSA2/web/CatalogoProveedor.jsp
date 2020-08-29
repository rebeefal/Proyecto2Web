<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="Estilo.css">
</head>


<body>


<div id="container">
    <h1>&bull; Proveedores &bull;</h1>
    <div class="underline">
    </div>
    <div class="icon_wrapper">

    </div>
    <form  method="post" id="contact_form">

        listarProveedor();

        <% for (int i=0;i<productoListaPorProveedor.size();i++){ %>

        <div class="square">
            <h2> Descripcion:  <%=productoListaPorProveedor.get(i).getDescripcionProducto() %>  </h2>
            <h2> Precio:  <%=productoListaPorProveedor.get(i).getCostoProducto() %>  </h2>
            <h2> Unidades disponibles: <%=productoListaPorProveedor.get(i).getCantidadStockProducto() %>   </h2>
            <img src="<%=productoListaPorProveedor.get(i).getLogoProducto()%>" >

            <form method ="POST">
                <input type="Submit" value="Agregar al carrito" />
            </form>

            <%  }%>

            <form action="<%=request.getContextPath()%>/indexsrvlt" method ="POST" >
                <input type="submit"  value="Terminar"   />
            </form>
        </div>



    </form><!-- // End form -->
</div><!-- // End #container -->

<script type="text/javascript" src="funcion.js"></script>
</body>
</html>
