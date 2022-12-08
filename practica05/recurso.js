

window.onload = () => {



        const colores = ["Blue", "Red", "Gray", "White", "Aqua"];
        const titulos = ["titulo1", "titulo2", "titulo3", "titulo4", "titulo5"];

        console.log("Color recibido ", color);

        for (let index = 0; index < colores.length; index++) {
            var t = document.getElementById(titulos[index]);
            t.style.color = colores[index];
        }
    

}