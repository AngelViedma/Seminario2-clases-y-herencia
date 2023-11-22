package com.example.clases

class Matematicas {
    fun sumar(a: Double, b: Double): Double {
        return a + b
    }

    fun restar(a: Double, b: Double): Double {
        return a - b
    }

    fun multiplicar(a: Double, b: Double): Double {
        return a * b
    }

    fun dividir(a: Double, b: Double): Double {
        return a / b
    }
}


data class Nota(val identificador: Int, val texto: String) {
    override fun toString(): String {
        return "Nota: $identificador - $texto"
    }
}


data class NotaAlarma(val identificador: Int, val texto: String, val horaAlarma: String) {
    override fun toString(): String {
        return "Nota con Alarma: $identificador - $texto (Alarma a las $horaAlarma)"
    }
}


class BlocNotas {
    private val notas = mutableListOf<Nota>()

    fun introducirNota(nota: Nota) {
        notas.add(nota)
    }

    fun listarNotas() {
        notas.forEachIndexed { index, nota ->
            println("$index: $nota")
        }
    }

    fun eliminarNota(posicion: Int) {
        if (posicion in 0 until notas.size) {
            notas.removeAt(posicion)
            println("Nota en la posición $posicion eliminada.")
        } else {
            println("Posición inválida.")
        }
    }

    fun cantidadNotas(): Int {
        return notas.size
    }
}

// Clase Prueba
fun main() {
    val matematicas = Matematicas()

    println("Suma: ${matematicas.sumar(5.0, 3.0)}")
    println("Resta: ${matematicas.restar(5.0, 3.0)}")
    println("Multiplicación: ${matematicas.multiplicar(5.0, 3.0)}")
    println("División: ${matematicas.dividir(6.0, 3.0)}")


    val blocNotas = BlocNotas()

    blocNotas.introducirNota(Nota(1, "Recordar comprar leche"))
    blocNotas.introducirNota(Nota(2, "Llamar a Juan"))
    blocNotas.introducirNota(Nota(3, "Reunión a las 4 PM"))


    println("Listado de notas:")
    blocNotas.listarNotas()

    println("Cantidad de notas en el bloc: ${blocNotas.cantidadNotas()}")

    blocNotas.eliminarNota(1)
    println("Listado de notas después de eliminar una:")
    blocNotas.listarNotas()

}