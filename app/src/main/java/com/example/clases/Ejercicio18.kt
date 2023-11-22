package com.example.clases

open class CuerpoCeleste(
    val nombre: String,
    val masa: Double,
    val diametroMedio: Double,
    val periodoRotacion: Double,
    val distanciaMediaAlOrbitado: Double,
    val excentricidadOrbita: Double
) {
    open fun imprimirInformacion() {
        println("Nombre: $nombre")
        println("Masa: $masa kg")
        println("Diámetro Medio: $diametroMedio km")
        println("Período de Rotación: $periodoRotacion horas")
        println("Distancia Media al Orbitado: $distanciaMediaAlOrbitado km")
        println("Excentricidad de la Órbita: $excentricidadOrbita")
    }
}

class PlanetasSistemaSolar(
    nombre: String,
    masa: Double,
    diametroMedio: Double,
    periodoRotacion: Double,
    val periodoTraslacion: Double,
    distanciaMediaAlSol: Double,
    excentricidadOrbita: Double,
    val tipo: String // Nuevo atributo para el tipo de planeta
) : CuerpoCeleste(nombre, masa, diametroMedio, periodoRotacion, distanciaMediaAlSol, excentricidadOrbita) {
    override fun imprimirInformacion() {
        super.imprimirInformacion()
        println("Período de Traslación: $periodoTraslacion días")
        println("Tipo de Planeta: $tipo")
    }
}

class Satelite(
    nombre: String,
    masa: Double,
    diametroMedio: Double,
    periodoRotacion: Double,
    distanciaMediaAlPlaneta: Double,
    excentricidadOrbita: Double
) : CuerpoCeleste(nombre, masa, diametroMedio, periodoRotacion, distanciaMediaAlPlaneta, excentricidadOrbita)

fun main() {
    val sol = CuerpoCeleste("Sol", 1.989e30, 1392684.0, 609.12, 0.0, 0.0)

    val tierra = PlanetasSistemaSolar("Tierra", 5.972e24, 12742.0, 24.0, 365.25, 149.6e6, 0.0167, "Terrestre")
    val luna = Satelite("Luna", 7.34767309e22, 3474.8, 708.733, 384400.0, 0.0549)

    println("Información del Sol:")
    sol.imprimirInformacion()
    println("\nInformación de la Tierra:")
    tierra.imprimirInformacion()
    println("\nInformación de la Luna:")
    luna.imprimirInformacion()
}