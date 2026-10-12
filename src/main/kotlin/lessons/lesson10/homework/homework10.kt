package lessons.lesson10.homework

package lesson.lesson10


fun main() {

    // ==========================================
    // ЧАСТЬ 1. РАБОТА СО СЛОВАРЯМИ MAP
    // ==========================================

    // 1. Пустой неизменяемый словарь Int -> Int
    println("Задание 1")

    val map1: Map<Int, Int> = emptyMap()
    println(map1)


    // 2. Неизменяемый словарь Float -> Double
    println("Задание 2")

    val map2: Map<Float, Double> = mapOf(
        1.5f to 10.5,
        2.5f to 20.5,
        3.5f to 30.5
    )
    println(map2)


    // 3. Изменяемый словарь Int -> String
    println("Задание 3")

    val map3: MutableMap<Int, String> = mutableMapOf(
        1 to "Kotlin",
        2 to "Java",
        3 to "Python"
    )
    println(map3)


    // 4. Добавление новых пар
    println("Задание 4")

    map3[4] = "Swift"
    map3[5] = "Go"
    println(map3)


    // 5. Получение значения по ключу
    println("Задание 5")

    println(map3[2])
    println(map3[100]) // null, такого ключа нет


    // 6. Удаление элемента по ключу
    println("Задание 6")

    map3.remove(2)
    println(map3)


    // 7. Деление ключа на значение
    println("Задание 7")

    val map7: Map<Double, Int> = mapOf(
        10.0 to 2,
        15.0 to 3,
        20.0 to 0,
        40.0 to 5
    )

    for ((key, value) in map7) {
        if (value == 0) {
            println("Бесконечность")
        } else {
            println(key / value)
        }
    }


    // 8. Изменение значения существующего ключа
    println("Задание 8")

    val map8 = mutableMapOf(
        1 to "Hello",
        2 to "World",
        3 to "Kotlin"
    )

    map8[2] = "Java"
    println(map8)


    // 9. Объединение двух словарей через циклы
    println("Задание 9")

    val firstMap = mapOf(
        1 to "Apple",
        2 to "Banana"
    )

    val secondMap = mapOf(
        3 to "Orange",
        4 to "Mango"
    )

    val resultMap = mutableMapOf<Int, String>()

    for ((key, value) in firstMap) {
        resultMap[key] = value
    }

    for ((key, value) in secondMap) {
        resultMap[key] = value
    }

    println(resultMap)


    // 10. Словарь String -> List<Int>
    println("Задание 10")

    val map10 = mutableMapOf<String, List<Int>>()

    map10["First"] = listOf(1, 2, 3)
    map10["Second"] = listOf(4, 5, 6)
    map10["Third"] = listOf(7, 8, 9)

    println(map10)


    // 11. Словарь Int -> MutableSet<String>
    println("Задание 11")

    val map11 = mutableMapOf<Int, MutableSet<String>>()

    map11[1] = mutableSetOf("Kotlin", "Java")
    map11[2] = mutableSetOf("Python", "Swift")

    val selectedSet = map11[1]

    selectedSet?.add("Go")

    println(selectedSet)
    println(map11)


    // 12. Поиск цифры 5 в паре чисел
    println("Задание 12")

    val map12 = mapOf(
        Pair(12, 34) to "First",
        Pair(51, 20) to "Second",
        Pair(33, 45) to "Third",
        Pair(10, 20) to "Fourth"
    )

    for ((key, value) in map12) {
        val firstNumber = key.first.toString()
        val secondNumber = key.second.toString()

        if (firstNumber.startsWith("5") ||
            secondNumber.startsWith("5")) {
            println(value)
        }
    }


    // ==========================================
    // ЧАСТЬ 2. ПОДБОР ОПТИМАЛЬНОГО ТИПА
    // ==========================================

    // 1. Библиотека
    // Автор -> список книг
    println("Задание 13")

    val library: Map<String, List<String>> = mapOf(
        "Пушкин" to listOf("Евгений Онегин", "Капитанская дочка"),
        "Толстой" to listOf("Война и мир", "Анна Каренина"),
        "Достоевский" to listOf("Идиот", "Преступление и наказание")
    )

    println(library)


    // 2. Справочник растений
    // Тип растения -> список названий
    println("Задание 14")

    val plants: Map<String, List<String>> = mapOf(
        "Цветы" to listOf("Роза", "Тюльпан", "Ромашка"),
        "Деревья" to listOf("Дуб", "Береза", "Сосна"),
        "Кустарники" to listOf("Сирень", "Малина")
    )

    println(plants)


    // 3. Четвертьфинал
    // Команда -> список игроков
    println("Задание 15")

    val teams: Map<String, List<String>> = mapOf(
        "Команда А" to listOf("Иван", "Петр", "Алексей"),
        "Команда Б" to listOf("Максим", "Олег", "Дмитрий"),
        "Команда В" to listOf("Антон", "Сергей", "Николай")
    )

    println(teams)


    // 4. Курс лечения
    // Дата -> список препаратов
    println("Задание 16")

    val treatment: Map<String, List<String>> = mapOf(
        "01.10.2026" to listOf("Препарат А", "Препарат Б"),
        "02.10.2026" to listOf("Препарат А"),
        "03.10.2026" to listOf("Препарат Б", "Препарат В")
    )

    println(treatment)


    // 5. Словарь путешественника
    // Страна -> (город -> список интересных мест)
    println("Задание 17")

    val travel: Map<String, Map<String, List<String>>> = mapOf(
        "Россия" to mapOf(
            "Москва" to listOf("Красная площадь", "Кремль"),
            "Санкт-Петербург" to listOf("Эрмитаж", "Петергоф")
        ),
        "Япония" to mapOf(
            "Токио" to listOf("Сибуя", "Токийская башня"),
            "Киото" to listOf("Храм Фусими Инари", "Арасияма")
        ),
        "Вьетнам" to mapOf(
            "Ханой" to listOf("Озеро Хоанкьем", "Храм литературы"),
            "Дананг" to listOf("Мраморные горы", "Мост Дракона")
        )
    )

    println(travel)
}