<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="EstiloPaginas.css">
</head>

<body>



<div id="container">
    <h1>&bull; Proveedor &bull;</h1>
    <div class="underline">
    </div>
    <div class="icon_wrapper">

    </div>


        <div id="">
                <div class="name">

                    <label for="cedulaJurFisProveedor"> Nombre del proveedor:  </label>
                    <input id="cedulaJurFisProveedor" name="cedulaJurFisProveedor" type="text"    required />

                </div>

            <div class="submit">
                <button onclick="cargarDatos()">Cargar datos  </button>
                <br/> <br/><br/>
            </div>
        </div>



        <div id="actualizarContenedor">

        </div>







    <form action="<%=request.getContextPath()%>/index.jsp"  >
        <input type="submit"  value="Terminar"   />
    </form>


</div><!-- // End #container -->

<script type="text/javascript" src="funcion.js"></script>
</body>
</html>
