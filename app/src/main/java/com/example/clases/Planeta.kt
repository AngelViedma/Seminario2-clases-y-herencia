package com.example.clases
class Planeta {
    var nombre: String
    var tipo: String
    var masa: Double

    constructor(nombre: String, tipo: String, masa: Double) {
        this.nombre = nombre
        this.tipo = tipo
        this.masa = masa
    }

    fun orbitar() {
        println("$nombre está orbitando ")
    }

    fun rotar() {
        println("$nombre está rotando ")
    }

    fun obtenerGravedad(superficie: Double): Double {
        val gravedad = masa * 9.81 / (superficie * superficie)
        return gravedad
    }
}