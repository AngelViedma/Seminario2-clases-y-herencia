package com.example.clases



fun main() {
    val tierra = Planeta("Tierra", "Terrestre", 5.972e24)
    val marte = Planeta("Marte", "Terrestre", 6.39e23)

    tierra.orbitar()
    tierra.rotar()
    val gravedadEnTierra = tierra.obtenerGravedad(6371.0)
    println("La gravedad en la Tierra es $gravedadEnTierra m/s²")

    marte.orbitar()
    marte.rotar()
    val gravedadEnMarte = marte.obtenerGravedad(3389.5)
    println("La gravedad en Marte es $gravedadEnMarte m/s²")
}