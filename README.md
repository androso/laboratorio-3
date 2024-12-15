# Algoritmos Recursivos y de Ordenamiento

Este proyecto implementa varios algoritmos clásicos en Kotlin, incluyendo métodos de ordenamiento y algoritmos recursivos. La aplicación proporciona una interfaz de línea de comandos para interactuar con estas implementaciones.

## Características

- **Algoritmos de Ordenamiento**
  - Bubble Sort
  - Quick Sort
  
- **Algoritmos Recursivos**
  - Cálculo de Factorial
  - Torres de Hanoi

- **Medición de Rendimiento**
  - Tiempo de ejecución para algoritmos de ordenamiento

## Estructura del Proyecto

```
src/main/kotlin/
├── Main.kt           # Punto de entrada de la aplicación
├── Sort.kt           # Implementaciones de algoritmos de ordenamiento
├── Recursive.kt      # Implementaciones de algoritmos recursivos
└── measureTime.kt    # Utilidad para medir tiempo de ejecución
```

## Uso

Al ejecutar el programa, se presenta un menú con las siguientes opciones:

1. Ordenar usando Bubble Sort
2. Ordenar usando Quick Sort
3. Obtener Factorial
4. Resolver Torres de Hanoi
5. Salir

### Ejemplos de Uso

#### Ordenamiento
```
Seleccione una opción:
1. Ordenar Usando Bubble Sort
> 1
Ingrese una lista de numeros separados por comas:
> 5,3,8,1,2
Original: 5, 3, 8, 1, 2
Lista ordenada: 1, 2, 3, 5, 8
Tiempo de ejecución: 0.000123 segundos
```

#### Factorial
```
Seleccione una opción:
3. Obtener Factorial
> 3
Ingrese un número para calcular su factorial:
> 5
El factorial de 5 es: 120
```

#### Torres de Hanoi
```
Seleccione una opción:
4. Resolver Torres de Hanoi
> 4
Ingrese el número de discos:
> 3
Pasos para resolver Torres de Hanoi con 3 discos:
Paso 1: Mover disco 1 de A a C
Paso 2: Mover disco 2 de A a B
Paso 3: Mover disco 1 de C a B
Paso 4: Mover disco 3 de A a C
Paso 5: Mover disco 1 de B a A
Paso 6: Mover disco 2 de B a C
Paso 7: Mover disco 1 de A a C
```

## Implementación

### Algoritmos de Ordenamiento

- **Bubble Sort**: Implementación clásica con optimización de bandera de intercambio
- **Quick Sort**: Implementación recursiva usando particionamiento

### Algoritmos Recursivos

- **Factorial**: Implementación recursiva con manejo de casos base y negativos
- **Torres de Hanoi**: Implementación recursiva con contador de pasos
