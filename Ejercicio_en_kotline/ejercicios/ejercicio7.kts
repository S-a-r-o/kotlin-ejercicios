print("Introduce una cadena de texto: ")
val input = readLine() ?: ""

// Cadena con la que se concatenará la entrada del usuario
val additionalString = " - Esta es la cadena adicional"

// Concatena las dos cadenas
val result = input + additionalString

// Muestra el resultado
println("Resultado: $result")
