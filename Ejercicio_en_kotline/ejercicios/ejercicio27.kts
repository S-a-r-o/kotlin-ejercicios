import java.io.File

// Define la ruta del archivo
val filePath = "mi_testamento.txt"

// Define el contenido que deseas escribir en el archivo
val content = "Esta es una línea de contenido en el archivo."

// Crea un archivo y escribe el contenido
File(filePath).writeText(content)

// Imprime un mensaje confirmando la creación del archivo
println("Archivo '$filePath' creado y contenido escrito.")