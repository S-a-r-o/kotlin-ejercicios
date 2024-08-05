val a = 10
val b = 20
val c = 10

println("a == b: ${a == b}")    // false
println("a != b: ${a != b}")    // true
println("a < b: ${a < b}")      // true
println("a > b: ${a > b}")      // false
println("a <= b: ${a <= b}")    // true
println("a >= b: ${a >= b}")    // false
println("a == c: ${a == c}")    // true

// Operadores lógicos
val x = true
val y = false

println("x && y: ${x && y}")    // false
println("x || y: ${x || y}")    // true
println("!x: ${!x}")            // false
println("!(x && y): ${!(x && y)}") // true

// Combinación de operadores de comparación y lógicos
val age = 25
val isStudent = true

println("age >= 18 && isStudent: ${age >= 18 && isStudent}") // true
println("age < 18 || !isStudent: ${age < 18 || !isStudent}") // false
println("!(age < 18) && isStudent: ${!(age < 18) && isStudent}") // true