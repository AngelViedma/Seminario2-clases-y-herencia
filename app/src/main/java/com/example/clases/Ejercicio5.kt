package com.example.clases

class Producto(var nombre:String,var precio:Double, var stock:Int){

    override fun toString():String{
        return "Nombre: $nombre \n Precio: $precio \n Stock: $stock \n"
    }

}

var lista_prod= mutableListOf<Producto>()

fun crearProducto(nom:String,precio:Double,stock:Int){
    val prod_nuevo=Producto(nom,precio,stock)
    lista_prod.add(prod_nuevo)
}

fun modificarStock(nombre_prod:String,nueva_stock:Int){
    var aux=lista_prod.filter { it.nombre==nombre_prod }
    aux[0].stock=nueva_stock
}


fun main(){

    var c :Int = -1
    while(c != 0){
        println("Opcion 1: Crear producto")
        println("Opcion 2: Mofificar stock")
        println("Opcion 3: Mostrar productos")
        println("Opcion 0: Salir")

        c = readLine()?.toInt() ?: 0

        when (c){
            1 -> {
                println("Escribe el nombre del producto: ")
                val nombre = readLine()?:"Error"
                println("Escribe el precio del producto: ")
                val precio = readLine()?.toDouble() ?: 0.0
                println("Escribe el stock del producto: ")
                val stock = readLine()?.toInt()?:0

                crearProducto(nombre,precio,stock)
            }

            2 -> {
                println("Dime el nombre del producto para modificar su stock: ")
                val nombre= readLine()?:""
                println("Dime a cuanto quieres modificar la cantidad:")
                val stok_nuevo= readLine()?.toInt()?:0

                modificarStock(nombre,stok_nuevo)
            }

            3 -> {
                println("Mostrando Productos: ")
                println(lista_prod.toString())
            }
        }
    }



}