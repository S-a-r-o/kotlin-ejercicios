print("Por favor, ingresa un número entero: ")
val input = readLine()

// Verificar si la entrada no es nula y convertirla a entero
val number = input?.toIntOrNull()

if (number != null) {
    println("Has ingresado el número: $number")
} else {
    println("La entrada no es un número entero válido.")
}