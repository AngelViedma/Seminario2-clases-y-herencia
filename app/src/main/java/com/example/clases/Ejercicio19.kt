package com.example.clases

open class PNJ(
    val nombre: String,
    var puntosVida: Double,
    var puntosMagia: Double,
    var nivel: Int
) {
    open fun levelUp() {
        nivel++
    }
}


class Guerrero(
    nombre: String,
    puntosVida: Double,
    puntosMagia: Double,
    nivel: Int
) : PNJ(nombre, puntosVida, puntosMagia, nivel) {
    override fun levelUp() {
        super.levelUp()
        puntosVida *= 1.08
        puntosMagia *= 1.01
    }
}


class Mago(
    nombre: String,
    puntosVida: Double,
    puntosMagia: Double,
    nivel: Int
) : PNJ(nombre, puntosVida, puntosMagia, nivel) {
    override fun levelUp() {
        super.levelUp()
        puntosVida *= 1.04 // Incremento del 4% en puntos de vida
        puntosMagia *= 1.03 // Incremento del 3% en puntos de magia
    }
}

fun main() {

    val guerrero = Guerrero("Guerrero", 400.0, 50.0, 1)
    guerrero.levelUp()


    val mago = Mago("Mago", 1600.0, 150.0, 1)
    mago.levelUp()

    println("Información del Guerrero:")
    println("Nivel: ${guerrero.nivel}, PV: ${guerrero.puntosVida}, PM: ${guerrero.puntosMagia}")

    println("Información del Mago:")
    println("Nivel: ${mago.nivel}, PV: ${mago.puntosVida}, PM: ${mago.puntosMagia}")

    //Cuando alcanza en guerrero al mago

    val puntosVidaGuerreroInicial = 400.0
    val puntosVidaMagoInicial = 1600.0
    val incrementoPVGuerrero = 0.08
    val incrementoPVMago = 0.04

    var nivel = 1
    var pvGuerrero = puntosVidaGuerreroInicial
    var pvMago = puntosVidaMagoInicial

    while (pvGuerrero <= pvMago) {
        pvGuerrero *= (1 + incrementoPVGuerrero)
        pvMago *= (1 + incrementoPVMago)
        nivel++
    }

    println("El Guerrero tendrá más PV que el Mago en el nivel $nivel")
}