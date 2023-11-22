package com.example.clases

class EquipoFutbol(var nombre:String,var pais:String)

fun championsLeague(equipos:List<EquipoFutbol>){

    val random=equipos.shuffled()

    for (i in random.indices step 2){
        println("El equipo ${random[i].nombre} se enfrenta a: ${random[i+1].nombre}")
    }


}

val equipos = mutableListOf(
    EquipoFutbol("Real Madrid", "España"),
    EquipoFutbol("Barcelona", "España"),
    EquipoFutbol("Manchester United", "Inglaterra"),
    EquipoFutbol("Liverpool", "Inglaterra"),
    EquipoFutbol("Bayern Munich", "Alemania"),
    EquipoFutbol("Borussia Dortmund", "Alemania"),
    EquipoFutbol("Paris Saint-Germain", "Francia"),
    EquipoFutbol("Olympique de Marsella", "Francia"),
    EquipoFutbol("Juventus", "Italia"),
    EquipoFutbol("AC Milan", "Italia"),
    EquipoFutbol("Ajax", "Países Bajos"),
    EquipoFutbol("PSV Eindhoven", "Países Bajos"),
    EquipoFutbol("Benfica", "Portugal"),
    EquipoFutbol("Porto", "Portugal"),
    EquipoFutbol("Galatasaray", "Turquía"),
    EquipoFutbol("Fenerbahçe", "Turquía")
)

fun main(){
    championsLeague(equipos)
}