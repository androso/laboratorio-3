package org.lab3
import kotlin.system.measureNanoTime

fun bubbleSort(arr: IntArray) {
    val lastIndex = arr.size - 1

    for (i in 0 until lastIndex) {
        var swapped = false

        for (j in 0 until lastIndex - i) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp

                swapped = true
            }
        }

        if (!swapped) break
    }
}

fun quickSort(arr: IntArray, start: Int = 0, end: Int = arr.size - 1) {
    if (start >= end) return
    val pivotIndex = partition(arr, start, end)
    quickSort(arr, start, pivotIndex - 1)
    quickSort(arr, pivotIndex + 1, end)
}

private fun partition(arr: IntArray, start: Int, end: Int): Int {
    val pivot = arr[end]
    var pivotIndex = start

    for (i in start until end) {
        if (arr[i] <= pivot) {
            val temp = arr[i]
            arr[i] = arr[pivotIndex]
            arr[pivotIndex] = temp

            pivotIndex++
        }
    }

    val temp = arr[end]
    arr[end] = arr[pivotIndex]
    arr[pivotIndex] = temp

    return pivotIndex
}

fun measureTime(algoritmo: (IntArray) -> Unit, arr: IntArray): Double {
    return measureNanoTime {
        algoritmo(arr)
    } / 1000000000.0
}


