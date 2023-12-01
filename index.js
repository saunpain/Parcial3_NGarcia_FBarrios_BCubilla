document.addEventListener('DOMContentLoaded', function() {
    console.log("El script se está ejecutando");

    window.onload = function(){
        let checkboxes = document.querySelectorAll('input[type="checkbox"]');
        console.log("se leyeron los checkboxes")
    
        checkboxes.forEach(function(checkbox) {
            console.log("se recorrieron los checkboxes")
            checkbox.addEventListener('change', function() {
                if (this.checked) {
                    console.log("se entro al this.checked")
    
                    checkboxes.forEach(function(otherCheckbox) {
                        if (otherCheckbox !== checkbox) {
                            otherCheckbox.checked = false;
                        }
                    });
    
                    recargarDatos(checkbox)
                }
            });
        });
    }
    
    function mapearDatos(personaje) {
        let contenedor = document.getElementById("contenedor-personaje")
        console.log("se asigno satisfactoriamente la variable contenedor")

        console.log(personaje)
        contenedor.innerHTML = mapearPlantilla(personaje);
        console.log("Se mapeo el personaje satisfactoriamente")
    }
    
    function mapearPlantilla(p){
        console.log("mapeando personaje")

        let urlImg = p.images.jpg.image_url
        let info = p.about
        let kanji = p.name_kanji

        return `<div class="imagen-personaje">
                    <h1>Imagen</h1>
                    <img src="${urlImg}" alt="">
                </div>
                <div class="informacion-personaje">
                    <h1>Informacion</h1>
                    <pre>${info}<pre/>
                </div>
                <div class="kanji-personaje">
                    <h1>Nombre en Kanji</h1>
                    <p>${kanji}</p>
                </div>`
    }            
    
    function recargarDatos(checkbox){
        let personajeId = checkbox.value
        console.log("se creo con exito el personaje ID")
        fetch("https://api.jikan.moe/v4/characters/"+personajeId).then(respuesta=>{
            if(respuesta.ok){
                console.log("se extrajo con exito el personaje")
                respuesta.json().then(personaje=>{
                    console.log("se convirtio el personaje a json satisfactoriamente")
                    mapearDatos(personaje.data);
                })
            }
            else{
                alert("No ha habido una respuesta exitosa")
            }
        })
    }
})
