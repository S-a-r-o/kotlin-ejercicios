val numeros: IntArray = intArrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)

// Ordenar el arreglo en orden ascendente
val ordenAscendente = numeros.sortedArray()

// Ordenar el arreglo en orden descendente
val ordenDescendente = numeros.sortedArrayDescending()

// Imprimir los arreglos ordenados
println("Arreglo en orden ascendente: ${ordenAscendente.joinToString(", ")}")
println("Arreglo en orden descendente: ${ordenDescendente.joinToString(", ")}")
