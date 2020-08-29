

async function postData() {

        url = '/VedeloAquiSA2/api/Proveedores/add',
        data = {cedulaJurFisProveedor:(getValue("cedulaJurFisProveedor")).value,
        nombreProveedor:(getValue("nombreProveedor")).value,
        fechaInProveedor:(getValue("fechaInProveedor")).value,
        contrasenaProveedor:(getValue("contrasenaProveedor")).value,
        acogeOfertasS:(getValue("acogeOfertasS")).value,
        logoProveedor:(getValue("logoProveedor")).value}

    const response = await fetch(url, {
        method: 'POST',
        mode: 'cors',
        cache: 'no-cache',
        credentials: 'same-origin',
        headers: {
            'Content-Type': 'application/json'

        },
        redirect: 'follow',
        referrerPolicy: 'no-referrer',
        body: JSON.stringify(data)
    });
    return response.json();
}




function listarProveedor(url,callback) {
    let request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if(this.readyState == 4 && this.status == 200){
            let responseText = JSON.parse(this.responseText);
            callback(responseText);
        }
    };
    request.open("GET", '/VedeloAquiSA2/api/Proveedores/all', true);
    request.send();
}




function cedula (cedulaValor){
    return cedulaValor;
}





function getProveedoresHTML(proveedor){

    if(proveedor.cedulaJurFisProveedor){
        return '<div id="contenedorProveedor'+proveedor.cedulaJurFisProveedor + '" class="item-menu"><span>'
            + proveedor.nombreProveedor + '</span><img class="proveedor-img" src="' + proveedor.logoProveedor
        + '"/><button type="button" class="btn btn-primary center-blobk" onclick="actualizarProveedor('+ proveedor.cedulaJurFisProveedor+')">Actualizar</button></div>';

    }else
        return "";
}





function actualizarProveedor(cedula){

    // me lleva a ProveedorActualizacion.jsp
}



function getValue(elementById){
    return getById(elementById);
}

function getById(elementById){
    return document.getElementById(elementById);

}





