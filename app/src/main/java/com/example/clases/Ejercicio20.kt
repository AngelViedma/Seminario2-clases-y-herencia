package com.example.clases

data class Videojuego(val nombre: String, val año: Int, val plataforma: String
)

fun filtrarJuegos(juegos: List<Videojuego>, año: Int? = null, plataforma: String? = null): List<Videojuego> {
    return juegos.filter {
        (año == null || it.año == año) && (plataforma == null || it.plataforma == plataforma)
    }
}

//Ejercicio 21
fun filtrarJuegosPorAñoYPlataforma(juegos:List<Videojuego>, años:List<Int>?=null, plataformas: List<String>? =null):List<Videojuego>{
    return juegos.filter { (años == null || it.año in años)  && (plataformas == null || it.plataforma in plataformas)}
}

//Ejercicio 22
fun mapaVideojuegos(juegos: List<Videojuego>):Map<String,Int>{
    return juegos.groupBy { it.plataforma }
        .mapValues { it.value.size }
}



fun main() {
    // Crear una lista con 8 videojuegos de tres plataformas distintas
    val listaVideojuegos = listOf(
        Videojuego("The Last of Us Part II", 2020, "PS4"),
        Videojuego("Halo Infinite", 2021, "Xbox Series X"),
        Videojuego("Cyberpunk 2077", 2020, "PC"),
        Videojuego("Demon's Souls", 2020, "PS5"),
        Videojuego("Animal Crossing: New Horizons", 2020, "Nintendo Switch"),
        Videojuego("Assassin's Creed Valhalla", 2020, "Xbox Series X"),
        Videojuego("Death Stranding", 2019, "PC"),
        Videojuego("The Legend of Zelda: Breath of the Wild", 2017, "Nintendo Switch")
    )

    // Filtrar los juegos por año y plataforma
    val juegosFiltrados = filtrarJuegos(listaVideojuegos, 2020, "PS5")
    println("Juegos de 2022 para PS5:")
    juegosFiltrados.forEach { println("${it.nombre}, ${it.año}, ${it.plataforma}") }

    // Filtrar los juegos solo por año
    val juegosPorAño = filtrarJuegos(listaVideojuegos, 2021)
    println("\nJuegos de 2021:")
    juegosPorAño.forEach { println("${it.nombre}, ${it.año}, ${it.plataforma}") }

    // Filtrar los juegos solo por plataforma
    val juegosPorPlataforma = filtrarJuegos(listaVideojuegos, plataforma = "Nintendo Switch")
    println("\nJuegos para Nintendo Switch:")
    juegosPorPlataforma.forEach { println("${it.nombre}, ${it.año}, ${it.plataforma}") }



    //filtro Ejercicio 21

    val años = listOf(2020, 2021)
    val plataformas = listOf("PS5", "Nintendo Switch")

    val juegosFiltrados2 = filtrarJuegosPorAñoYPlataforma(listaVideojuegos, años, plataformas)
    println("Juegos de 2020 o 2021 para PS5 o Nintendo Switch:")
    juegosFiltrados.forEach { println("${it.nombre}, ${it.año}, ${it.plataforma}") }

    val juegosPorAños = filtrarJuegosPorAñoYPlataforma(listaVideojuegos, años = listOf(2020))
    println("\nJuegos de 2020:")
    juegosPorAños.forEach { println("${it.nombre}, ${it.año}, ${it.plataforma}") }

    val juegosPorPlataformas = filtrarJuegosPorAñoYPlataforma(listaVideojuegos, plataformas = listOf("PC"))
    println("\nJuegos para PC:")
    juegosPorPlataformas.forEach { println("${it.nombre}, ${it.año}, ${it.plataforma}") }
}

