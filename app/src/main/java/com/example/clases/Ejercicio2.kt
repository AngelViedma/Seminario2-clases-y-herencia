package com.example.clases

class Triangulo(var lado1: Double, var lado2: Double, var lado3: Double) {
    fun esRectangulo(): Boolean {
        var ordenao = listOf(lado1, lado2, lado3).sorted()
        var a = ordenao[0]
        var b = ordenao[1]
        var c = ordenao[2]

        return (a * a + b * b) == (c * c)
    }
}

fun main() {
    var trianguloRectangulo = Triangulo(3.0, 4.0, 5.0)
    var trianguloNoRectangulo = Triangulo(5.0, 5.0, 5.0)

    println("¿Triángulo Rectángulo? " + trianguloRectangulo.esRectangulo())
    println("¿Triángulo Rectángulo? " + trianguloNoRectangulo.esRectangulo())
}




