print("Ingrese un número: ")

// Leer la entrada del usuario como una cadena
val input = readLine()

// Intentar convertir la entrada a un número entero
val number = input?.toIntOrNull()

if (number != null) {
    // Calcular el cuadrado del número
    val square = number * number

    // Imprimir el número y su cuadrado
    println("Número ingresado: $number")
    println("Cuadrado del número: $square")
} else {
    // Informar al usuario que la entrada no es un número válido
    println("Por favor, ingrese un número válido.")
    }
