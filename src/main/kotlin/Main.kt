package org.lab3

import org.lab3.bubbleSort
import org.lab3.factorial
import org.lab3.hanoi
import org.lab3.measureTime
import org.lab3.quickSort
import org.lab3.HanoiCounter

fun main() {
    while (true) {
        println("""
            
            Seleccione una opción:
            1. Ordenar Usando Bubble Sort
            2. Ordenar Usando Quick Sort
            3. Obtener Factorial
            4. Resolver Torres de Hanoi
            5. Salir
        """.trimIndent())

        when (readLine()?.toIntOrNull()) {
            1 -> handleSorting(::bubbleSort)
            2 -> handleSorting { arr -> quickSort(arr, 0, arr.size - 1) }
            3 -> handleFactorial()
            4 -> handleHanoi()
            5 -> {
                println("¡Gracias por usar el programa!")
                return
            }
            else -> println("Error: Opción no válida. Por favor, seleccione una opción entre 1 y 5")
        }
    }
}

private fun handleSorting(sortFunction: (IntArray) -> Unit) {
    println("Ingrese una lista de numeros separados por comas:")
    readLine()?.let { input ->
        try {
            val arr = input.split(",").map { it.trim().toInt() }.toIntArray()
            if (arr.isEmpty()) {
                println("La lista no puede estar vacía")
                return
            }

            println("Original: ${arr.joinToString()}")
            val tiempo = measureTime(sortFunction, arr)
            println("Lista ordenada: ${arr.joinToString()}")
            println("Tiempo de ejecución: %.6f segundos".format(tiempo))
        } catch (e: NumberFormatException) {
            println("Error: Ingrese una lista de números válida")
        }
    }
}

private fun handleFactorial() {
    println("Ingrese un número para calcular su factorial:")
    readLine()?.toIntOrNull()?.let { num ->
        try {
            if (num >= 0) {
                val resultado = factorial(num)
                println("El factorial de $num es: $resultado")
            } else {
                println("Error: No se puede calcular el factorial de un número negativo")
            }
        } catch (e: IllegalArgumentException) {
            println("Error: ${e.message}")
        }
    } ?: println("Error: Por favor ingrese un número válido")
}

private fun handleHanoi() {
    println("Ingrese el número de discos:")
    readLine()?.toIntOrNull()?.takeIf { it > 0 }?.let { discos ->
        println("\nPasos para resolver Torres de Hanoi con $discos discos:")
        HanoiCounter.reset()
        hanoi(discos, "A", "B", "C")
    } ?: println("Error: Ingrese un número de discos válido (mayor que 0)")
}