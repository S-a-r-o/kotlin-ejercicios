var numero = 1

while (numero <= 20) {
    // Verificamos si el número es par
    if (numero % 2 == 0) {
        // Imprimimos el mensaje indicando que el número es par
        println("$numero es par")
    } else {
        // Imprimimos el mensaje indicando que el número es impar
        println("$numero es impar")
    }
    // Incrementamos el número en 1 para pasar al siguiente número
    numero++
}