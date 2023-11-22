package com.example.clases

class Contacto(var nombre:String, var telefono:Int, var correo:String){

    fun mostrarDatos():String{
        return "Nombre:$nombre, telefono: $telefono, correo: $correo"
    }
}


fun main(){
    val contacto1=Contacto("Angel",676767676,"19angelviedma@gmail.com")
    var listaContactos= mutableListOf<Contacto>()
    listaContactos.add(contacto1)

    var c :Int = -1
    while(c != 0){
        println("Opcion 1: Añadir contacto")
        println("Opcion 2: Eliminar contacto")
        println("Opcion 3: Mostrar contactos")
        println("Opcion 0: Salir")

        c = readLine()?.toInt() ?: 0

        when (c){
            1 -> {
                println("Escribe el nombre del contacto: ")
                val nombre = readLine()?:"Error"
                println("Escribe el numero de telefono: ")
                val tel = readLine()?.toInt() ?: 0
                println("Escribe el correo: ")
                val correo = readLine()?:"Error"

                val nuevo=Contacto(nombre,tel,correo)
                listaContactos.add(nuevo)
            }

            2 -> {
                println("Dime el nombre para borrar el contacto: ")
                val nombre= readLine()

                for(i in listaContactos.indices){
                    if(listaContactos[i].nombre==nombre){
                        listaContactos.removeAt(i)
                    }
                }
            }

            3 -> {
                println("Mostrando Contactos: ")
                for (i in 0 until listaContactos.size){
                    println(listaContactos[i].mostrarDatos())
                    println("-------------------------------------")
                }
            }
        }
    }


}