package com.example.clases

import kotlin.math.PI
import kotlin.math.pow

open class Circunferencia(private val radio: Double) {
    private var centroX: Double = 0.0
    private var centroY: Double = 0.0

    constructor(centroX: Double, centroY: Double, punto: Punto) : this(
        kotlin.math.sqrt(
            (centroX - punto.x).pow(2) + (centroY - punto.y).pow(2)
        )
    ) {
        this.centroX = centroX
        this.centroY = centroY
    }

    fun longitud(): Double {
        return 2 * PI * radio
    }

    override fun toString(): String {
        return "Circunferencia - Centro: ($centroX, $centroY), Radio: $radio, Longitud: ${longitud()}"
    }
}

class Circulo : Circunferencia {
    private var color: String = "Negro"

    constructor(radio: Double, color: String) : super(radio) {
        this.color = color
    }

    constructor(centroX: Double, centroY: Double, punto: Punto, color: String) : super(
        centroX,
        centroY,
        punto
    ) {
        this.color = color
    }

    fun area(): Double {
        return PI * super.longitud() * super.longitud()
    }

    override fun toString(): String {
        return "${super.toString()}, Color: $color, Área: ${area()}"
    }
}

data class Punto(val x: Double, val y: Double)

fun main() {
    val circunferencia1 = Circunferencia(5.0)
    println(circunferencia1)

    val punto = Punto(3.0, 4.0)
    val circunferencia2 = Circunferencia(0.0, 0.0, punto)
    println(circunferencia2)

    val circulo1 = Circulo(7.0, "Rojo")
    println(circulo1)

    val circulo2 = Circulo(0.0, 0.0, Punto(5.0, 12.0), "Azul")
    println(circulo2)
}
