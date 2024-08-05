import java.io.File

// Define la ruta del archivo al que deseas agregar contenido
val filePath = "mi_testamento.txt"

// Define la nueva línea de contenido que deseas agregar
val newLine = "Esta es una nueva línea añadida al archivo."

// Agrega la nueva línea al final del archivo
File(filePath).appendText("\n$newLine")

// Imprime un mensaje confirmando que la línea ha sido agregada
println("Nueva línea añadida al archivo '$filePath'.")