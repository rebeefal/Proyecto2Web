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
    <form  name="contact_form" id="contact_form" >




        <div class="name">

            <label for="cedulaJurFisProveedor"> Nombre del proveedor:  </label>
            <input id="cedulaJurFisProveedor" name="cedulaJurFisProveedor" type="text"    required />

        </div>


        <div class="name">

            <label for="nombreProveedor"> Nombre del proveedor:  </label>
            <input id="nombreProveedor" name="nombreProveedor" type="text"    required />

        </div>

        <div class="name">

            <label for="fechaInProveedor"> Fecha:  </label>
            <input id="fechaInProveedor" name="fechaInProveedor" type="text" required/>

        </div>

        <div class="name">

            <label for="contrasenaProveedor"> Contraseña:  </label>
            <input id="contrasenaProveedor" name="contrasenaProveedor" type="password" pattern="(?=(.*[0-9]){2})(?=.*[a-z])(?=.*[A-Z]).{8,}" required/>
            <label >   </label>

        </div>


        <div class="name">
            <label for="acogeOfertasS"> Acoge ofertas:  </label>
            <input id="acogeOfertasS" name="acogeOfertasS"  type="text"  required/>

        </div>

        <div class="name">

            <label for="logoProveedor"> URL del logo: </label>
            <input id="logoProveedor" name="logoProveedor" type="text" requiered pattern="https?:\/\/(www\.)?[-a-zA-Z0-9@:%._\+~#=]{1,256}\.[a-zA-Z0-9()]{1,6}\b([-a-zA-Z0-9()@:%_\+.~#?&//=]*)" />

        </div>


        <div class="submit">
            <input type="submit" value="Agregar" id="form_button" onclick="paramCallAjaxProveedores()"  />
        </div>

    </form><!-- // End form -->


    <form action="<%=request.getContextPath()%>/index.jsp"  class="boton-terminar" >
        <input type="submit"  value="Terminar"   />
    </form>


</div><!-- // End #container -->

<script type="text/javascript" src="funcion.js"></script>
</body>
</html>
