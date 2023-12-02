let UrlBase = "http://localhost:8080";
let nav = [];
let vis2 = [];
let vis3 = [];
let vis4 = [];
let vis5 = [];
let vis6 = [];
let vis7 = [];
let vis8 = [];
let vis9 = [];
let vis10 = [];

function ObtenerElementos(){
    fetch(UrlBase + "/nav").then(res => {
        res.json().then(json => {
            nav = json;
            ImprimirNav();
        });
    });

    fetch(UrlBase + "/vista2").then(res => {
        res.json().then(json => {
            vis2 = json;
            ImprimirVista2();
        });
    });

    fetch(UrlBase + "/vista3").then(res => {
        res.json().then(json => {
            vis3 = json;
            ImprimirVista3();
        })
    })

    fetch(UrlBase + "/vista4").then(res => {
        res.json().then(json => {
            vis4 = json;
            ImprimirVista4();
        })
    })
}

function ImprimirVista5(){
    let contenedor = document.getElementById("")
}

function ImprimirVista4(){
    let contenedor = document.getElementsByClassName("division4")[0]
    contenedor.innerHTML = ""

    let titulo = vis4[0].titulos
    let subtitulo = vis4[0].imagenes

    contenedor.innerHTML = MapearVista4(titulo, subtitulo)
}

function MapearVista4(titulo, subtitulo){
    return `<div class="division4-titulo">
    <h2>
        ${titulo}
    </h2>
</div>
<div class="division4-imagenes">
    <img src="https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/geto-division4.jpg?raw=true" alt=""> 
    <img src="https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/Urame-division4.png?raw=true" alt=""> 
    <img src="https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/yorozu-division.png?raw=true" alt=""> 
    <img src="https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/mahito-division4.png?raw=true" alt="">
</div>
<div class="division4-texto">
    <p>
        ${subtitulo}
    </p>
</div>
<div class="division4-botoncito">
    <span>
        <button><a href="https://www.mundodeportivo.com/alfabeta/series/todos-los-tipos-de-maldiciones-en-jujutsu-kaisen"  target="_blank">Tipos de  maldiciones</a></button>
    </span>
</div>`
}

function ImprimirVista3(){
    let contenedor = document.getElementsByClassName("division3")[0]
    contenedor.innerHTML = ""

    let titulo = vis3[0].titulos
    let text1 = vis3[0].texto
    let text2 = vis3[1].texto

    contenedor.innerHTML = MapearVista3(titulo, text1, text2);
}

function MapearVista3(titulo, text1, text2){
    return `<h2>
        ${titulo}
    </h2>

    <div class="info-burrito">
        <div class="gojo-deposito">
            <img id="img-gojo" src="https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/gojo%20vs%20sukuna.jpg?raw=true" alt="">
            <p>
            ${text1}
            </p>
        </div>

        <div class="sukuna-deposito"> 
            <p>
            ${text2}
            <p> 
        <img id="img-sukuna" src="https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/gojo%20vs%20sukuna(sukuna).jpg?raw=true" alt="">
        </div> 
    </div>  `
}

function ImprimirVista2(){
    let contenedor1 = document.getElementsByClassName("division1")[0]
    let contenedor2 = document.getElementsByClassName("division2")[0]
    contenedor1.innerHTML = ""
    contenedor2.innerHTML = ""

    let titulo = vis2[0].titulos
    let subtitulo1 = vis2[0].subtitulo
    let subtitulo2 = vis2[1].subtitulo
    let text1 = vis2[0].texto
    let text2 = vis2[1].texto
    let text3 = vis2[2].texto
    let img1 = vis2[0].imagenes
 
    contenedor1.innerHTML = MapearVista2_1(titulo, subtitulo1, text1, img1)
    contenedor2.innerHTML = MapearVista2_2(subtitulo2, text2, text3)
    console.log("Se asigno la seccion 1 y 2 satisfactoriamente")


}

function MapearVista2_1(titulo, subtitulo1, text1, img1){
    return `<div class="division1-texto">
    <div id="titulo">
        <h1>${titulo}</h1>
        <h2>${subtitulo1}</h2>
    </div>
    <div id="lore">
        <p>${text1}
        </p>
    </div>
</div>
<div class="division1-imagen">
    <img src="${img1}" alt="">
</div>`
}

function MapearVista2_2(subtitulo2, text2, text3, img2, img3){
    return `<div class="deposito-img">
    <img id="img1" src="https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/sukuna2tierragamer.png?raw=true" alt="">
    <img id="img2" src="https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/sukuna%20icon.png?raw=true" alt="">
</div>
<div class="deposito-texto">
    <div class="deposito-texto-burrito">
        <h2>${subtitulo2}</h2>
        <p id="frase">${text2}</p>
        <br>
        <br>
        <p id="lore">${text3}</p>
    </div>
</div>`
}

function ImprimirNav(){
    let contenedor = document.getElementsByClassName("navegador")[0];

    let img2 = nav[1].imagenes
    let titulo = nav[0].titulos
    
    contenedor.innerHTML = MapearNav(img2, titulo);
    console.log("se asigno el nav satisfactoriamente")
}

function MapearNav(img2, titulo){
    return `<div class="navegador">
    <div class="jujutsukaisen"> 
        <h2 class="desc">${titulo}</h2>
    </div>
    <div id="icono">
    </div>
    <div class="imagen">
        <img src="${img2}" alt="">
    </div>
</div>`
}
