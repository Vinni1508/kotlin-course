import kotlin.math.PI
import kotlin.math.sin

// ANSI-коды для цвета текста в консоли
const val RESET = "\u001B[0m"
const val RED = "\u001B[31m"
const val GREEN = "\u001B[32m"
const val YELLOW = "\u001B[33m"
const val BLUE = "\u001B[34m"
const val BLACK_ON_WHITE = "\u001B[30;47m"
const val WHITE_ON_RED = "\u001B[37;41m"

// 1. Животные
open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}


class Dog : Animal() {
    override fun makeSound() {
        println("${RED}Bark${RESET}")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("${GREEN}Meow${RESET}")
    }
}

class Bird : Animal() {
    override fun makeSound() {
        println("${BLUE}Tweet${RESET}")
    }
}

// 2. Геометрические фигуры
abstract class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return PI * radius * radius
    }
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle(val sideA: Double, val sideB: Double, val angleDegrees: Double) : Shape() {
    override fun area(): Double {
        val angleRadians = Math.toRadians(angleDegrees)
        return sideA * sideB * sin(angleRadians) / 2
    }
}

// 3. Принтеры
abstract class Printer {
    abstract fun printText(text: String)
}

class LaserPrinter : Printer() {
    override fun printText(text: String) {
        val words = text.split(" ")
        for (word in words) {
            println("${BLACK_ON_WHITE}${word}${RESET}")
        }
    }
}

class InkjetPrinter : Printer() {
    override fun printText(text: String) {
        val words = text.split(" ")
        val colors = listOf(
            "\u001B[30;43m", // черный текст на желтом фоне
            "\u001B[37;44m", // белый текст на синем фоне
            "\u001B[30;42m", // черный текст на зеленом фоне
            "\u001B[37;45m"  // белый текст на фиолетовом фоне
        )
        for (i in words.indices) {
            val color = colors[i % colors.size]
            println("${color}${words[i]}${RESET}")
        }
    }
}

// 4. Корзина товаров
class Cart {
    val items = mutableMapOf<Int, Int>()

    fun addToCart(itemId: Int) {
        addToCart(itemId, 1)
    }

    fun addToCart(itemId: Int, amount: Int) {
        if (amount > 0) {
            val currentAmount = items[itemId] ?: 0
            items[itemId] = currentAmount + amount
        }
    }

    fun addToCart(newItems: Map<Int, Int>) {
        for ((itemId, amount) in newItems) {
            addToCart(itemId, amount)
        }
    }

    fun addToCart(itemIds: List<Int>) {
        for (itemId in itemIds) {
            addToCart(itemId)
        }
    }

    override fun toString(): String {
        var result = "ID товара | Количество\n"
        result += "-----------|-----------\n"
        for ((itemId, amount) in items) {
            result += "${itemId.toString().padEnd(10)} | $amount\n"
        }
        result += "-----------|-----------\n"
        result += "Всего артикулов: ${items.size}\n"
        result += "Всего единиц товара: ${items.values.sum()}"
        return result
    }
}

// 5. Логгер
class Logger {
    fun log(message: String) {
        println("[INFO] $message")
    }

    fun log(level: String, message: String) {
        when (level) {
            "WARNING" -> println("${YELLOW}[WARNING] $message${RESET}")
            "ERROR" -> println("${WHITE_ON_RED}[ERROR] $message${RESET}")
            "DEBUG" -> println("[DEBUG] $message")
            "INFO" -> log(message)
            else -> println("[$level] $message")
        }
    }

    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    fun log(exception: Exception) {
        log("ERROR", exception.message ?: "Неизвестная ошибка")
    }
}

fun main() {
    println("=== 1. Животные ===")
    val animals: List<Animal> = listOf(Animal(), Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.makeSound()
    }

    println("\n=== 2. Площади фигур ===")
    val shapes: List<Shape> = listOf(
        Circle(3.0),
        Square(4.0),
        Triangle(3.0, 4.0, 90.0)
    )
    for (shape in shapes) {
        println("${shape.javaClass.simpleName}: ${shape.area()}")
    }

    println("\n=== 3. Принтеры ===")
    val text = "Это длинный текст для проверки работы лазерного и струйного принтеров с разными цветами текста и фона"
    val laser = LaserPrinter()
    val inkjet = InkjetPrinter()
    println("Лазерный принтер:")
    laser.printText(text)
    println("Струйный принтер:")
    inkjet.printText(text)

    println("\n=== 4. Корзина ===")
    val cart = Cart()
    cart.addToCart(101)
    cart.addToCart(101, 3)
    cart.addToCart(mapOf(101 to 2, 202 to 5))
    cart.addToCart(listOf(101, 202, 303, 303))
    println(cart)

    println("\n=== 5. Логгер ===")
    val logger = Logger()
    logger.log("Программа запущена")
    logger.log("WARNING", "Мало свободного места")
    logger.log("ERROR", "Не удалось загрузить файл")
    logger.log("DEBUG", "Проверяем значение переменной")
    logger.log(listOf("Первое сообщение", "Второе сообщение", "Третье сообщение"))
    logger.log(Exception("Пример исключения"))
}
