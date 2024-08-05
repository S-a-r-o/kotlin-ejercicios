// Define el arreglo en el que buscaremos el elemento
val arreglo = arrayOf(1, 2, 3, 4, 5)

// Define el elemento que queremos buscar
val elementoBuscado = 3

// Busca el índice del elemento en el arreglo
val indice = arreglo.indexOf(elementoBuscado)

// Verifica si el índice es válido (es decir, el elemento fue encontrado)
if (indice != -1) {
    println("El elemento $elementoBuscado se encuentra en la posición $indice.")
} else {
    println("El elemento $elementoBuscado no se encuentra en el arreglo.")
}
