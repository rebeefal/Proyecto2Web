



async function postProveedor() {
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


async function postProducto() {
    url = '/VedeloAquiSA2/api/Productos/add',
        dataProducto = {cedulaJurFisProveedor:(getValue("cedulaJurFisProveedor")).value,
            idProducto:(getValue("cedulaJurFisProveedor")).value,
            descripcionProducto:(getValue("descripcionProducto")).value,
            descripcionEnganchaCliente:(getValue("descripcionEnganchaCliente")).value,
            refrigeracionProducto:(getValue("refrigeracionProducto")).value,
            costoProducto:(getValue("costoProducto")).value,
            porcentajeGananciaProducto:(getValue("porcentajeGananciaProducto")).value,
            cantidadStockProducto:(getValue("cantidadStockProducto")).value,
            logoProducto:(getValue("logoProducto")).value}

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
        body: JSON.stringify(dataProducto)
    });
    return response.json();
}


async function actualizar(url){

        dataProducto = {cedulaJurFisProveedor:(getValue("cedulaJurFisProveedor")).value,
            idProducto:(getValue("cedulaJurFisProveedor")).value,
            descripcionProducto:(getValue("descripcionProducto")).value,
            descripcionEnganchaCliente:(getValue("descripcionEnganchaCliente")).value,
            refrigeracionProducto:(getValue("refrigeracionProducto")).value,
            costoProducto:(getValue("costoProducto")).value,
            porcentajeGananciaProducto:(getValue("porcentajeGananciaProducto")).value,
            cantidadStockProducto:(getValue("cantidadStockProducto")).value,
            logoProducto:(getValue("logoProducto")).value}

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
        body: JSON.stringify(dataProducto)
    });
    return response.json();
}



function searchProveedor() {
    loadAllProveedores();

}

function searchProducto(id) {
    loadById(id);
}

function cargarDatos(){
    loadByIdProveedor((getValue("cedulaJurFisProveedor")).value);
}



function actualizarProveedor(id){
    let url = "/VedeloAquiSA2/api/Productos/update/"+id ;
    callAjaxUpdate(url, processProveedorResponse)
}


function setInnerHtml(elementId, html) {
    let element = getById(elementId);
    element.innerHTML = html;

}




function loadAllProveedores(){
    let url = "/VedeloAquiSA2/api/Proveedores/all";
    callAjax(url, processProveedorResponse)
}




function callAjaxUpdate(url,callback) {
    let request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if(this.readyState == 4 && this.status == 200){
            let responseText = JSON.parse(this.responseText);
            callback(responseText);
        }
    };
    request.open("PUT", url, true);
    request.send();

}



function loadById(id){
    let url = "/VedeloAquiSA2/api/Productos/" + id;
    callAjax(url, processProductoResponse)
}


function loadByIdProveedor(id){
    let url = "/VedeloAquiSA2/api/Proveedor/" + id;
    callAjax(url, asignaValoresCargados)
}

function asignaValoresCargados(proveedor){
    setInnerHtml = ("actualizarContenedor" , "");
    proveedor.forEach(function (proveedor, index,array) {
        theHtml+=getProveedoresActualizaHTML(proveedor);
    });

    setInnerHtml = ("actualizarContenedor" , theHtml);
}

function getProveedoresActualizaHTML(proveedor) {

    return '<div class="name"><label> Ingrese los nuevos datos para el proveedor: '+ proveedor.cedulaJurFisProveedor +'   </label></div>'+
        '<div class="name">\n' +
        '            <label for="nombreProveedor"> Nombre del proveedor:  </label>\n' +
        '            <input id="nombreProveedor" name="nombreProveedor" type="text"   placeholder="'+ proveedor.nombreProveedor +'"   required />\n' +
        '</div>'+
        '<div class="name">\n' +
        '            <label for="fechaInProveedor"> Fecha:  </label>\n' +
        '            <input id="fechaInProveedor" name="fechaInProveedor" placeholder="'+ proveedor.fechaInProveedor +'"  type="text" required/>\n' +
        '</div>';

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

    setInnerHtml("contenedorProveedores",theHtml);

}


function processProductoResponse(producto) {
    let theHtml = "";
    producto.forEach(function (producto, index,array) {
        theHtml+=getProductosHTML(producto);

    });
    setInnerHtml("contenedorProveedores","");
    setInnerHtml("contenedorProveedores",theHtml);

}




function getProveedorActualizarHTML(proveedor){

    if(proveedor.cedulaJurFisProveedor){

        return '<br/><div id="contenedorProveedores'+proveedor.cedulaJurFisProveedor + '" class="item-menu">' +
            '<span>'+ proveedor.nombreProveedor + '</span>' +
            '<img class="proveedor-img" src="' + proveedor.logoProveedor+ '"/>' +
            '<button type="button" class="btn btn-primary center-blobk"  onclick="searchProducto(\''+ proveedor.cedulaJurFisProveedor+'\')">Productos</button>' +
            '<br/></div>';

//

    }else
        return "";
}



function getProveedoresHTML(proveedor){

    if(proveedor.cedulaJurFisProveedor){


        return '<br/><div id="contenedorProveedores'+proveedor.cedulaJurFisProveedor + '" class="item-menu">' +
            '<span>'+ proveedor.nombreProveedor + '</span>' +
            '<img class="proveedor-img" src="' + proveedor.logoProveedor+ '"/>' +
            '<button type="button" class="btn btn-primary center-blobk"  onclick="searchProducto(\''+ proveedor.cedulaJurFisProveedor+'\')">Productos</button>' +
            '<br/></div>';

//

    }else
        return "";
}
function getProductosHTML(producto){


        return '<br/><div id="contenedorProveedores'+producto.idProducto + '" class="item-menu">' +
            '<span>'+ producto.descripcionProducto + '</span>' +
            '<img class="proveedor-img" src="' + producto.logoProducto+ '"/>' +
            '<button type="button" class="btn btn-primary center-blobk"   onclick="comprarProveedor('+ producto.cedulaJurFisProveedor+')">Comprar</button>' +
            '<br/></div>';

}





function getValue(elementById){
    return getById(elementById);
}

function getById(elementById){

    return document.getElementById(elementById);

}





