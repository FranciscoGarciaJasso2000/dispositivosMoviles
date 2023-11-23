package clases

class Vehiculo2 {

    init {
        println("Vehiculo creado")
    }
    
    companion object Factory{
        fun create(): Vehiculo2 = Vehiculo2()
    }
}