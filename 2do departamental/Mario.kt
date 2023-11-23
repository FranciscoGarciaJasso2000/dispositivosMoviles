package clases

class Mario(var vidas: Int =3) { // Vamos a dejar setear el número de vidas al iniciar el objeto Mario

    init {
        println("It´s a me! Mario!") // Vamos a hacer que Mario se presente al construirlo
    }

    private var state = "small" // Uno empieza el juego con 3 vidas
    private var lives = 3

        set(value){
            if(field == 1){
                field = 0
                gameOver()
            } else if (field == 0){
                println("Necesitas volver a jugar")
            } else {
                field = value // Podemos asignar el valor correctamente
            }
        }

    // Resta una vida a l jugador
    private fun die(){
        lives--
        println("Has perdido una vida!")
    }

    // El modificador public es redundante
    // En función del objeto colisionante, se ejecutará un evento
    public fun collision(collisionObj: String){
        when(collisionObj){
            "Goomba"->lives--
            "Super Mushroom"->state="Super Mario"
            "Super flower"->state = "Fire Mario"
            else -> println("Objeto desconocido ¡No pasa nada!")
        }
    }

    fun getLives():String{
        return ("$lives vidas")
    }

    private fun gameOver(){
        println("¡Juego terminado!")
    }

    fun statusMario():Boolean{
        if (lives > 1){
            return true
        } else {
            return false
        }
    }

    val isAlive: Boolean
        get() {
            return lives >=1
        }
}