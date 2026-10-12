package lessons.lesson11.homework

package lesson.lesson11


// ==========================================
// ЧАСТЬ 1. СИГНАТУРЫ МЕТОДОВ
// ==========================================

// 1. Не принимает аргументов и не возвращает значения
public fun task1(): Unit {
    println("Задание 1")
}

// 2. Принимает два Int и возвращает их сумму
public fun task2(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает строку и ничего не возвращает
public fun task3(text: String): Unit {
    println(text)
}

// 4. Принимает список Int и возвращает среднее Double
public fun task4(numbers: List<Int>): Double {
    if (numbers.isEmpty()) return 0.0

    var sum = 0.0
    for (number in numbers) {
        sum += number
    }

    return sum / numbers.size
}

// 5. Принимает nullable String, возвращает nullable Int
// Доступна только в текущем файле
private fun task5(text: String?): Int? {
    return text?.length
}

// 6. Не принимает аргументов, возвращает nullable Double
public fun task6(): Double? {
    return null
}

// 7. Принимает nullable List<Int>, ничего не возвращает
// Доступна только в текущем файле
private fun task7(numbers: List<Int>?): Unit {
    println(numbers)
}

// 8. Принимает Int, возвращает nullable String
public fun task8(number: Int): String? {
    return if (number >= 0) number.toString() else null
}

// 9. Не принимает аргументов, возвращает List<String?>
public fun task9(): List<String?> {
    return listOf("Kotlin", null, "Java")
}

// 10. Принимает nullable String и nullable Int
// Возвращает nullable Boolean
public fun task10(text: String?, number: Int?): Boolean? {
    if (text == null || number == null) return null

    return text.length == number
}


// ==========================================
// ЧАСТЬ 2. НАПИСАНИЕ КОДА
// ==========================================

// 11. Умножить число на 2
public fun multiplyByTwo(number: Int): Int {
    return number * 2
}

// 12. Проверить, является ли число четным
public fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// 13. Вывести числа от 1 до n
// Если n < 1, прекратить выполнение
public fun printNumbersUntil(n: Int): Unit {
    if (n < 1) {
        return
    }

    for (i in 1..n) {
        println(i)
    }
}

// 14. Найти первое отрицательное число
// Если отрицательных нет, вернуть null
public fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }

    return null
}

// 15. Перебрать список nullable строк
// При встрече null прекратить выполнение
public fun processList(strings: List<String?>): Unit {
    for (text in strings) {
        if (text == null) {
            return
        }

        println(text)
    }
}


// ==========================================
// MAIN — ПРОВЕРКА ВСЕХ ЗАДАНИЙ
// ==========================================

fun main() {

    println("Task 1")
    task1()

    println("Task 2")
    println(task2(10, 20))

    println("Task 3")
    task3("Hello Kotlin")

    println("Task 4")
    println(task4(listOf(10, 20, 30, 40)))

    println("Task 5")
    println(task5("Kotlin"))
    println(task5(null))

    println("Task 6")
    println(task6())

    println("Task 7")
    task7(listOf(1, 2, 3))
    task7(null)

    println("Task 8")
    println(task8(10))
    println(task8(-5))

    println("Task 9")
    println(task9())

    println("Task 10")
    println(task10("Hello", 5))
    println(task10(null, 5))

    println("Task 11")
    println(multiplyByTwo(5))

    println("Task 12")
    println(isEven(10))
    println(isEven(7))

    println("Task 13")
    printNumbersUntil(5)
    printNumbersUntil(0)

    println("Task 14")
    println(findFirstNegative(listOf(5, 3, -2, -8)))
    println(findFirstNegative(listOf(1, 2, 3)))

    println("Task 15")
    processList(listOf("Kotlin", "Java", null, "Python"))
}