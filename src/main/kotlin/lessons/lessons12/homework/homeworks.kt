package lessons.lessons12.homework

class homeworks {
}


fun main() {
    // Задачи 1-11
    val numbers = listOf(5, 10, 15, 20, 25, 30, 35)
    val emptyList = listOf<Int>()

    // 1. Проверить, что размер коллекции больше 5
    println(numbers.size > 5)

    // 2. Проверить, что коллекция пустая
    println(emptyList.isEmpty())

    // 3. Проверить, что коллекция не пустая
    println(numbers.isNotEmpty())

    // 4. Взять элемент по индексу или создать значение
    println(numbers.getOrElse(10) { 0 })

    // 5. Собрать коллекцию в строку
    println(numbers.joinToString(", "))

    // 6. Посчитать сумму всех значений
    println(numbers.sum())

    // 7. Посчитать среднее
    println(numbers.average())

    // 8. Взять максимальное число
    println(numbers.maxOrNull())

    // 9. Взять минимальное число
    println(numbers.minOrNull())

    // 10. Взять первое число или null
    println(numbers.firstOrNull())

    // 11. Проверить, что коллекция содержит элемент
    println(numbers.contains(20))


    // Задачи 12-23
    val numbers2 = listOf(12, 18, 21, 24, 27, 30, 36, 42)
    val words = listOf("кот", "собака", "дом", "машина", "кот")
    val nullableWords = listOf("кот", null, "дом", null, "лес")

    // 12. Отфильтровать числа по диапазону 18-30
    println(numbers2.filter { it in 18..30 })

    // 13. Убрать числа, которые делятся на 2 и 3 одновременно
    println(numbers2.filterNot { it % 2 == 0 && it % 3 == 0 })

    // 14. Удалить null элементы
    println(nullableWords.filterNotNull())

    // 15. Преобразовать слова в их длины
    println(words.map { it.length })

    // 16. Создать мапу: перевёрнутое слово - длина
    println(words.associate { it.reversed() to it.length })

    // 17. Отсортировать слова по алфавиту
    println(words.sorted())

    // 18. Взять первые 3 элемента
    println(words.take(3))

    // 19. Распечатать квадраты чисел
    numbers2.forEach { println(it * it) }

    // 20. Сгруппировать слова по первой букве
    println(words.groupBy { it.first() })

    // 21. Удалить дубли
    println(words.distinct())

    // 22. Отсортировать числа по убыванию
    println(numbers2.sortedDescending())

    // 23. Взять последние 3 элемента
    println(words.takeLast(3))


    // Задача 24. Характеристика числовой коллекции
    println(describeNumbers(listOf()))
    println(describeNumbers(listOf(1, 2, 3)))
    println(describeNumbers(listOf(0, 1, 2, 3, 4)))
    println(describeNumbers(listOf(3000, 3000, 3000, 3000, 3000)))
    println(describeNumbers(listOf(8, 9, 10, 11, 12)))
    println(describeNumbers(listOf(1000, 1001, 1002, 1003, 1004)))
    println(describeNumbers(listOf(-20, -19, -18, -17, -16)))
    println(describeNumbers(listOf(1001, 1002, 1003, 1004, 1005, 1006)))
    println(describeNumbers(listOf(3, 14, 5, 6, 7)))
    println(describeNumbers(listOf(1, 2, 4, 5, 6)))


    // Задача 25. Анализ учебных оценок
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(analyzeGrades(grades))


    // Список для задач 26 и 27
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало",
        "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф",
        "книга", "Фоторамка", "светильник", "Коврик",
        "вешалка", "Подставка", "телевизор", "Комод",
        "полка", "Абажур", "диван", "Кресло",
        "занавеска", "Бра", "пепельница", "Глобус",
        "статуэтка", "Поднос", "фигурка", "Ключница",
        "плед", "Тумба", "игрушка", "Настенные часы",
        "подсвечник", "Журнальный столик", "сувенир",
        "Корзина для белья", "посуда", "Настольная лампа",
        "торшер", "Этажерка"
    )

    // Задача 26. Создание каталога по первой букве
    println(createCatalog(list))

    // Задача 27. Средняя длина слов
    println(averageWordLength(list))


    // Задача 28. Категоризация чисел
    val numbers3 = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(categorizeNumbers(numbers3))


    // Задача 29. Поиск первого подходящего элемента
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println(findAge(ages, 18))
}


// Задача 24
fun describeNumbers(numbers: List<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"
        numbers.size < 5 -> "Короткая"
        numbers.first() == 0 -> "Стартовая"
        numbers.sum() > 10000 -> "Массивная"
        numbers.average() == 10.0 -> "Сбалансированная"
        numbers.joinToString("").length == 20 -> "Клейкая"
        numbers.maxOrNull()!! < -10 -> "Отрицательная"
        numbers.minOrNull()!! > 1000 -> "Положительная"
        numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}


// Задача 25
fun analyzeGrades(grades: List<Int>): List<Int> {
    return grades
        .filter { it >= 60 }
        .sorted()
        .take(3)
}


// Задача 26
fun createCatalog(words: List<String>): Map<Char, List<String>> {
    return words
        .map { it.lowercase() }
        .groupBy { it.first() }
}


// Задача 27
fun averageWordLength(words: List<String>): String {
    val average = words
        .map { it.length }
        .average()

    return "Средняя длина слов: %.2f".format(average)
}


// Задача 28
fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
    return numbers
        .distinct()
        .sortedDescending()
        .groupBy {
            if (it % 2 == 0) "четные"
            else "нечетные"
        }
}


// Задача 29
fun findAge(ages: List<Int?>, minAge: Int): Int? {
    return ages
        .filterNotNull()
        .firstOrNull { it > minAge }
}
