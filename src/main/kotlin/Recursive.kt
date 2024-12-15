package org.lab3

object HanoiCounter {
    private var steps = 0

    fun reset() {
        steps = 0
    }

    fun increment(): Int = ++steps
}

fun hanoi(disks: Int, source: String, target: String, auxiliary: String) {
    when {
        disks == 1 -> {
            val step = HanoiCounter.increment()
            println("Paso $step: Mover disco 1 de $source a $target")
        }
        else -> {
            hanoi(disks - 1, source, auxiliary, target)
            val step = HanoiCounter.increment()
            println("Paso $step: Mover disco $disks de $source a $target")
            hanoi(disks - 1, auxiliary, target, source)
        }
    }
}

fun factorial(n: Int): Int = when {
    n < 0 -> throw IllegalArgumentException("Factorial no está definido para números negativos")
    n <= 1 -> 1
    else -> n * factorial(n - 1)
}