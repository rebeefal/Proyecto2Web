
function datosProd(){
    dataProducto = {cedulaJurFisProveedor:(getValue("cedulaJurFisProveedor")).value,
        idProducto:(getValue("cedulaJurFisProveedor")).value,
        descripcionProducto:(getValue("descripcionProducto")).value,
        descripcionEnganchaCliente:(getValue("descripcionEnganchaCliente")).value,
        refrigeracionProducto:(getValue("refrigeracionProducto")).value,
        costoProducto:(getValue("costoProducto")).value,
        porcentajeGananciaProducto:(getValue("porcentajeGananciaProducto")).value,
        cantidadStockProducto:(getValue("cantidadStockProducto")).value,
        logoProducto:(getValue("logoProducto")).value}

        return dataProducto;
}


function datosProv(){
    dataProv = {cedulaJurFisProveedor:(getValue("cedulaJurFisProveedor")).value,
        nombreProveedor:(getValue("nombreProveedor")).value,
        fechaInProveedor:(getValue("fechaInProveedor")).value,
        contrasenaProveedor:(getValue("contrasenaProveedor")).value,
        acogeOfertasS:(getValue("acogeOfertasS")).value,
        logoProveedor:(getValue("logoProveedor")).value}

    return dataProv;
}



async function actualizarProveedor(){
        url = '/VedeloAquiSA2/api/Proveedores/update/',
            dataProveedor = {cedulaJurFisProveedor:(getValue("cedulaJurFisProveedor")).value,
                nombreProveedor:(getValue("nombreProveedor")).value,
                fechaInProveedor:(getValue("fechaInProveedor")).value,
                contrasenaProveedor:(getValue("contrasenaProveedor")).value,
                acogeOfertasS:(getValue("acogeOfertasS")).value,
                logoProveedor:(getValue("logoProveedor")).value}

    const response = await fetch(url, {
        method: 'PUT',
        mode: 'cors',
        cache: 'no-cache',
        credentials: 'same-origin',
        headers: {
            'Content-Type': 'application/json'

        },
        redirect: 'follow',
        referrerPolicy: 'no-referrer',
        body: JSON.stringify(dataProveedor)
    });
    return response.json();
}



function paramCallAjaxProductos(){
    url = '/VedeloAquiSA2/api/Productos/add';
    datos = datosProd();
    callAjaxPost(url, datos);
}


function paramCallAjaxActualProv(){
    url = '/VedeloAquiSA2/api/Proveedores/update';
    datos = datosProv();
    callAjaxPost(url, datos);
}

////onclick="postProveedor()"/>
function paramCallAjaxProveedores(){
    url = '/VedeloAquiSA2/api/Proveedores/add';
    datos = datosProv();
    callAjaxPost(url, datos);
}


function callAjaxPost(url,datos) {
    let request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if(this.readyState == 4 && this.status == 200){
        }
    };
    request.open("POST", url, true);
    var jsonString = JSON.stringify(datos)
    request.setRequestHeader("Content-type", "application/json");
    request.send(jsonString);
}


function searchProveedor() {
    loadAllProveedores();
}

function searchProducto(id) {
    loadById(id);
}
function loadById(id){
    let url = "/VedeloAquiSA2/api/Productos/" + id;
    callAjax(url, processProductoResponse)
}

function cargarDatos(){
    loadByIdProveedor((getValue("cedulaJurFisProveedor")).value);
}

function loadByIdProveedor(id){
    let url = "/VedeloAquiSA2/api/Proveedores/"+id;
    callAjax(url, asignaValoresCargados )
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



function asignaValoresCargados(proveedor){
    let theHtml =  "";
    setInnerHtml("actualizarContenedor" , theHtml);
    theHtml=getProveedoresActualizaHTML(proveedor);
    setInnerHtml("actualizarContenedor" , theHtml);
}

function getProveedoresActualizaHTML(proveedor) {

    return '<div class="name"><label> Ingrese los nuevos datos para el proveedor: '+ proveedor.cedulaJurFisProveedor +'   </label></div>'+
        '<div class="name">\n' +
        '            <label for="nombreProveedor"> Nombre del proveedor:  </label>\n' +
        '            <input id="nombreProveedor" name="nombreProveedor" type="text"  placeholder="'+ proveedor.nombreProveedor +'"  value="'+ proveedor.nombreProveedor +'"   required />\n' +
        '</div>'+
        '<div class="name">\n' +
        '            <label for="fechaInProveedor"> Fecha:  </label>\n' +
        '            <input id="fechaInProveedor" name="fechaInProveedor"  placeholder="'+ proveedor.fechaInProveedor +'" value="'+ proveedor.fechaInProveedor +'"  type="text" required/>\n' +
        '</div>'+
        '<div class="name">\n' +
        '\n' +
        '            <label for="contrasenaProveedor"> Contraseña:  </label>\n' +
        '            <input id="contrasenaProveedor" name="contrasenaProveedor" placeholder="'+ proveedor.contrasenaProveedor +'"  value="'+ proveedor.contrasenaProveedor +'" type="password" pattern="(?=(.*[0-9]){2})(?=.*[a-z])(?=.*[A-Z]).{8,}" required/>\n' +
        '            <label >   </label>\n' +
        '\n' +
        '        </div>'+
        '<div class="name">\n' +
        '            <label for="acogeOfertasS"> Acoge ofertas:  </label>\n' +
        '            <input id="acogeOfertasS" name="acogeOfertasS"   placeholder="'+ proveedor.acogeOfertasS +'"  value="'+ proveedor.acogeOfertasS +'" type="text"  required/>\n' +
        '\n' +
        '        </div>'+
        '<div class="name">\n' +
        '\n' +
        '            <label for="logoProveedor"> URL del logo: </label>\n' +
        '            <input id="logoProveedor" name="logoProveedor" type="text"  placeholder="'+ proveedor.logoProveedor +'"   value="'+ proveedor.logoProveedor +'" requiered pattern="https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)" />\n' +
        '\n' +
        '        </div>'+
        '<button type="button" class="btn btn-primary center-blobk"   onclick="paramCallAjaxActualProv()">Comprar</button>';
}






function setInnerHtml(elementId, html) {
    let element = getById(elementId);
    element.innerHTML = html;

}

function loadAllProveedores(){
    let url = "/VedeloAquiSA2/api/Proveedores/all";
    callAjax(url, processProveedorResponse)
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

    setInnerHtml("contenedorProveedores",theHtml);

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





