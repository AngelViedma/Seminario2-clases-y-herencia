package com.example.clases

fun main(){


    val listaPlanetas = mutableListOf(
        Planeta("Mercurio", "Rocoso", 0.330),
        Planeta("Venus", "Rocoso", 4.87),
        Planeta("Tierra", "Rocoso", 5.97),
        Planeta("Marte", "Rocoso", 0.642),
        Planeta("Júpiter", "Gaseoso", 1898.0),
        Planeta("Saturno", "Gaseoso", 568.0),
        Planeta("Urano", "Gaseoso", 86.8),
        Planeta("Neptuno", "Gaseoso", 102.0)
        )

    println("--------------------Ejercicio 7 -----------------")

    for (planeta in listaPlanetas){
        println("${planeta.nombre} - Tipo: ${planeta.tipo}, Masa: ${planeta.masa} M")
    }

    println("------------------- Ejercicio 8 -----------------")

    for (planeta in listaPlanetas){
        if (planeta.nombre.startsWith("M")){
            println("${planeta.nombre} - Tipo: ${planeta.tipo}, Masa: ${planeta.masa} M")
        }
    }

    println("------------------- Ejercicio 9 -----------------")

    for (planeta in listaPlanetas){
        if((planeta.tipo=="Gaseoso") && planeta.masa>(20 * 5.97)){
            println("${planeta.nombre} - Tipo: ${planeta.tipo}, Masa: ${planeta.masa} M")
        }
    }

    println("------------------- Ejercicio 10 ----------------")
    var media=0.0
    for(planeta in listaPlanetas){
        media+=planeta.masa
    }
    media/=listaPlanetas.size

    println("La media de todos los planetas es de: $media")

}