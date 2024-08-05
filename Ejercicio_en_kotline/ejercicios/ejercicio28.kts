import java.io.File

// Define la ruta del archivo que deseas leer
val filePath = "mi_testamento.txt"

// Lee el contenido del archivo
val content = File(filePath).readText()

// Imprime el contenido en la consola
println("Contenido del archivo '$filePath':")
println(content)
