package com.example.clases


var listaestudiantes= mutableListOf<Estudiante>()

class Estudiante(var nombre:String, var edad:Int, var calificaciones:Double) {

    fun mostrar():String{
        return "Nombre: $nombre, edad: $edad, calificaciones: $calificaciones"
    }

}

fun filtrarDatos(nom:String):String{
    var devolver=""

    var estudiante=listaestudiantes.filter{ it.nombre==nom }
    if(!estudiante.isEmpty()){
        devolver=estudiante[0].mostrar()
    }
    return devolver
}

fun media():Double{
    var media=0.0
    for(i in listaestudiantes){
        media+=i.calificaciones
    }
    return media/ listaestudiantes.size
}


fun main(){

var c:Int=-1

    while(c!=0){
        println("Opcion 1: Añadir Estudiante")
        println("Opcion 2: Mostrar Estudiante en concreto")
        println("Opcion 3: Calcular promedio")
        println("Opcion 0: Salir")

        c = readLine()?.toInt() ?: 0

        when(c){
            1 ->{
                print("Escribe el nombre del estudiante: ")
                val nom= readLine()?:""

                print("Escribe la edad: ")
                val edad= readLine()?.toInt()?:0

                print("Escribe la calificacion del estudiante: ")
                val calificaciones= readLine()?.toDouble()?:0.0
                val nuevoEstudiante=Estudiante(nom,edad,calificaciones)
                listaestudiantes.add(nuevoEstudiante)

            }
            2 ->{
                print("Escribe el nombre del estudiante")
                val nom= readLine()?:""
                print(filtrarDatos(nom))
                }

            3 ->{
                print("${media()}\n")
            }
        }
    }




}