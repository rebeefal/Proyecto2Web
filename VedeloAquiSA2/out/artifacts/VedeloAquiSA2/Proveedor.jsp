<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="Estilo.css">
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

            <label for="cedulaJurFisProveedor"> Cedula Fisica o Juridica  </label>
            <input id="cedulaJurFisProveedor" name="cedulaJurFisProveedor" type="text" pattern="[0]\d{1}-\d{4}-\d{4}$|[3]-\d{3}-\d{6}$" required />

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
            <input type="submit" value="Agregar" id="form_button"  onclick="postData()"/>
        </div>

    </form><!-- // End form -->


    <form action="<%=request.getContextPath()%>/index.jsp"  >
        <input type="submit"  value="Terminar"   />
    </form>


</div><!-- // End #container -->

<script type="text/javascript" src="funcion.js"></script>
</body>
</html>
