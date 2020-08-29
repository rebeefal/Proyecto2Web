

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


function search() {
    setInnerHtml("contenedorProveedores","");
    let id = (getValue("cedulaJurFisProveedor")).value;
    loadAllProveedores();

}

function setInnerHtml(elementId, html) {
    let element = (getById(elementId)).value;
    element.innerHTML = html;

}

function loadAllProveedores(){
    let url = "/VedeloAquiSA2/api/Proveedores/all";
    callAjax(url, processProveedorResponse)
}

function callAjax(url,callback) {
    let request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if(this.readyState == 4 && this.status == 200){
            let responseText = JSON.parse(this.responseText);
            callback(responseText);
        }
    };
    request.open("GET", url, true);
    request.send();

}

function processProveedorResponse(proveedor) {
    let theHtml = "";
    proveedor.forEach(function (proveedor, index,array) {
        theHtml+=getProveedoresHTML(proveedor);

    });
    setInnerHtml("contenedorProveedor",theHtml);

}

function getProveedoresHTML(proveedor){

    if(proveedor.cedulaJurFisProveedor){
        return '<div id="contenedorProveedor'+proveedor.cedulaJurFisProveedor + '" class="item-menu"><span>'
            + proveedor.nombreProveedor + '</span><img class="proveedor-img" src="' + proveedor.logoProveedor
            + '"/><button type="button" class="btn btn-primary center-blobk" onclick="actualizarProveedor('+ proveedor.cedulaJurFisProveedor+')">Actualizar</button></div>';

    }else
        return "";
}



function cedula (cedulaValor){
    return cedulaValor;
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





