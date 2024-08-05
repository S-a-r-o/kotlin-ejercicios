fun suma(a: Int, b: Int): Int {
    return a + b
}

// Definimos una función que multiplica dos números
fun multiplicacion(a: Int, b: Int): Int {
    return a * b
}

// Definimos una función que saluda a una persona
fun saludo(nombre: String): String {
    return "Hola, $nombre!"
}

// Llamamos a las funciones y mostramos los resultados
val resultadoSuma = suma(5, 7)
val resultadoMultiplicacion = multiplicacion(4, 6)
val resultadoSaludo = saludo("Mundo")

println("Resultado de la suma: $resultadoSuma")
println("Resultado de la multiplicación: $resultadoMultiplicacion")
println("Resultado del saludo: $resultadoSaludo")
