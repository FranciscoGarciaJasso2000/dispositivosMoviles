// Tipos de variables
fun variablesYConstantes(){
    var primeraVariable = "Esta es la creación de la primera variable"
    println(primeraVariable)

    val primeraConstante = "Esta es una constante en tiempo de ejecución"
    println(primeraConstante)
}

// Tipos de datos
fun tiposDeDatos(){
    val primerString = "Esta es una variable de tipo String"
    println(primerString)

    val entero = 5
    println("$entero es el valor de la variable de tipo entero")

    val decimal = 1.5f
    println("$decimal es el valor de la variable de tipo float")

    val primerBooleano = true
    println("Esta es una variable de tipo booleano: $primerBooleano")
}

// Sintaxis del If
fun condicionalIf(){
    val numero = 10
    if(numero < 10){
        println("La condición se cumple")
    } else {
        println("La condición no se cumple")
    }
}

//Sintaxis de la sentencia When (Switch)
fun sentenciaWhen(){
    println("Ingresa un número y te diré a que día de la semana corresponde: ")
    val diaSemana = readln().toInt()
    val nombreDia = when(diaSemana){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Ese día no existe"
    }
}

// Función que hicimos en clase
fun login(user: String, password:String) : Boolean{
    fun validate(input : String) : Boolean{
        if(input.isEmpty()){
            return false
        }
        return true
    }
    val userValidated = validate(user)
    val passValidated = validate(password)

    return userValidated && passValidated
}


fun datosLogin(){
    println("Ingresa tu usuario: ")
    var user = readln().toString()
    println("Ingresa tu contraseña: ")
    var password = readln().toString()
    val userValidated = login(user, password)
    println("Usuario loggeado? $userValidated")
}


fun rectangleArea(base:Double=20.0, height:Double=30.0):Double{
    return base*height
}


fun triangulo(){
    println("Ingresa el primer lado del triángulo")
    var lado1 = readln().toInt()
    println("Ingresa el segundo lado del triángulo")
    var lado2 = readln().toInt()
    println("Ingresa el tercer lado del triángulo")
    var lado3 = readln().toInt()
    if(lado1==lado2 && lado1==lado3 && lado2==lado3){
        println("Es equilatero")
    } else if(lado1==lado2 || lado2==lado3){
        println("Es isosceles")
    } else {
        println("Es Escaleno")
    }
}


fun promedio(){
    print("Inserta tu primera calificación (con punto decimal): ")
    var primeraCalif : Float = readln().toFloat()
    print("\nInserta tu segunda calificación (con punto decimal): ")
    var segundaCalif : Float = readln().toFloat()
    print("\nInserta tu tercera calificación (con punto decimal): ")
    var terceraCalif : Float = readln().toFloat()

    var promedio : Float = (primeraCalif+segundaCalif+terceraCalif)/3f
    var parteDecimal : Float = promedio - promedio.toInt()
    var primerDecimal : Int = (parteDecimal * 10).toInt()

    if(promedio>=6.0){
        println("\n¡Aprobaste! Tu calificación es: $promedio")
        if(primerDecimal>=5){
            var redondeo : Int = (promedio.toInt())+1
            println("\nTu calificación redondeada es: $redondeo")
        } else {
            println("\nTu calificación redondeada es: ${promedio.toInt()}")
        }
    } else {
        println("\nReprobado, ni modo")
    }
}


fun sumar3Numeros(primerNumero : Int, segundoNumero : Int, tercerNumero : Int): Int{
    return primerNumero + segundoNumero + tercerNumero
}


fun pasoParametros(){
    println("Ingresa el primer número: ")
    var num1 = readln().toInt()
    println("Ingresa el segundo número: ")
    var num2 = readln().toInt()
    println("Ingresa el tercer número: ")
    var num3 = readln().toInt()
    val suma = sumar3Numeros(num1, num2, num3)
    println("El resultado de la suma es: $suma")
}


fun ciclos(){
    val nombres = listOf(
        "kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Luigi",
        "Link",
        "Captain",
        "Samus",
        "Pikachu",
        "Jigglepuff",
        "Donkey kong",
        "Yoshi",
    )

    for (i in nombres){
        println(i)
    }

    println()

    nombres.forEach{
        println(it)
    }

    println()

    for (i in nombres){
        println(i)
        if (i == "Link"){
            println("Personaje encontrado")
            break
        }
    }

    println()

    var x = 20
    while(x > 0){
        println(x)
        x--
    }
}


val nombres = listOf(
    "Pedro Luis",
    "Juan Manuel",
    "Juan Luis",
    "Maria Ines",
    "Romeo",
    "Ernesto",
    "Juan Pedro",
    "Ariadna",
    "Mireya Maria",
    "Ana Sofia",
    "Jose Juan",
)


fun listaDeNombres(){
    val nameCount = contadorDeNombres("Juan")
    println("Tu nombre se encontró $nameCount veces")
}


fun contadorDeNombres(name: String):Int{
    var contador = 0
    for(i in nombres){
        if(name in i){
            contador++
        }
    }
    return contador
}


fun cicloFor(){
    for (i in 1..5){
        print(" $i")
    }

    println()

    for (i in 1 until 5 ){
        print(" $i")
    }

    println()

    for (i in 0..10 step 2){
        print(" $i")
    }
}


const val pi = 3.1416
fun calculaPerimetroCirculo(){
    val decimal : Float = 3.2f
    val resultado : Double = (2f*decimal)*pi
    println("El perímetro del círculo es: $resultado")
}


fun manipulaciónDeStrings(){
    val numeros = listOf("one", "two", "three", "four", "five")
    println(numeros)
    println("Número de elementos que contiene la cadena: ${numeros.size}")
    println("El segundo elemento de la cadena es: ${numeros.get(1)}")
    println("El cuarto elemento de la cadena es: ${numeros[3]}")
    println("El último elemento de la cadena es: ${numeros.get(numeros.size-1)}")
    println("El índice de elemento four es : ${numeros.indexOf("four")}")
}


fun continuar(){
    var continuar : String = ""
    var bandera : Boolean = true
    while(bandera == true){
        println()
        //println(constanteGlobal)
        //variablesYConstantes()
        //tiposDeDatos()
        //condicionalIf()
        //rectangleArea()
        //triangulo()
        //promedio()
        //pasoParametros()
        //leerDato()
        //login()
        //datosLogin()
        //calculaPerimetroCirculo()
        //ciclos()
        //listaDeNombres()
        //cicloFor()
        //manipulaciónDeStrings()
        while(true){
            print("\n¿Desea continuar?(S/N): ")
            continuar = readln().toString()
            if((continuar == "N") || (continuar == "n")){
                bandera = false
                break
            } else if((continuar != "S") && (continuar != "s")){
                println("\nEntrada no válida")
            } else {
                break
            }
        }
    }
}


fun main() {
    continuar()
}