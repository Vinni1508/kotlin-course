package lesson.lesson06

// Задание 1. Определение сезона
fun printSeason(month: Int) {
    if (month !in 1..12) {
        println("Ошибка, номер месяца должен быть от 1 до 12")
        return
    }

    when (month) {
        12, 1, 2 -> println("Зима")
        3, 4, 5 -> println("Весна")
        6, 7, 8 -> println("Лето")
        9, 10, 11 -> println("Осень")
    }
}

fun printSeasons(month: Int) {
    when (month) {
        !in 1..12 -> println("Ошибка, номер месяца должен быть от 1 до 12")
        12,1,2 -> println("Зима")
        in (3..5)-> println("Весна")
        in (6..8) -> println("Лето")
        in (9..11) -> println("Осень")
    }
}


// Задание 2. Расчет возраста питомца
fun printDogAge(age: Int) {
    if (age < 0 || age > 35) {
        println("Ошибка в возрасте")
        return
    }

    val humanAge: Double

    if (age <= 2) {
        humanAge = age * 10.5
    } else {
        humanAge = 2 * 10.5 + (age - 2) * 4
    }

    println(humanAge)
}

fun printDogAge2(dogAge: Int) {
    when {
        dogAge !in 1..200 -> println("Ошибка в возрасте")
        dogAge <= 2 -> println(dogAge * 10.5)
        dogAge in 3..200 -> println((dogAge - 2) * 4 + 21)
    }
}


// Задание 3. Определение способа перемещения
fun printTransport(distance: Double) {
    if (distance < 0) {
        println("Ошибка, расстояние не может быть отрицательным")
        return
    }

    if (distance <= 1) {
        println("Пешком")
    } else if (distance <= 5) {
        println("Велосипед")
    } else {
        println("Автотранспорт")
    }
}


// Задание 4. Расчет бонусных баллов
fun printBonus(purchase: Int) {
    if (purchase < 0) {
        println("Ошибка, сумма покупки не может быть отрицательной")
        return
    }

    val bonus: Int

    if (purchase <= 1000) {
        bonus = purchase / 100 * 2
    } else {
        bonus = purchase / 100 * 3
    }

    println(bonus)
}


// Задание 5. Определение типа документа
fun printDocumentType(extension: String) {
    if (extension.isEmpty()) {
        println("Ошибка, расширение файла не указано")
        return
    }

    when (extension) {
        "txt", "doc", "docx" -> println("Текстовый документ")
        "jpg", "jpeg", "png" -> println("Изображение")
        "xls", "xlsx" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}


// Задание 6. Конвертация температуры
fun convertTemperature(temperature: Double, unit: Char) {
    if (unit != 'C' && unit != 'F') {
        println("Ошибка, единица измерения должна быть C или F")
        return
    }

    if (unit == 'C' && temperature < -273.15) {
        println("Ошибка температура ниже абсолютного нуля")
        return
    }

    if (unit == 'F' && temperature < -459.67) {
        println("Ошибка температура ниже абсолютного нуля")
        return
    }

    if (unit == 'C') {
        val result = temperature * 9 / 5 + 32
        print(result)
        print("F")
    } else {
        val result = (temperature - 32) * 5 / 9
        print(result)
        print("C")
    }

    println()
}


// Задание 7. Подбор одежды по погоде
fun printClothes(temperature: Int) {
    if (temperature < -100) {
        println("Ошибка некорректная температура")
        return
    }

    if (temperature < -30 || temperature > 35) {
        println("Не выходить из дома")
    } else if (temperature < 10) {
        println("Куртка и шапка")
    } else if (temperature <= 18) {
        println("Ветровка")
    } else {
        println("Футболка и шорты")
    }
}


// Задание 8. Выбор фильма по возрасту
fun printMovieCategory(age: Int) {
    if (age < 0 || age > 150) {
        println("Ошибка возраст не корректен")
        return
    }

    if (age <= 9) {
        println("Детские")
    } else if (age <= 18) {
        println("Подростковые")
    } else {
        println("18+")
    }
}


// Тело
fun main() {

    // Задание 1
    println("Task 1")
    printSeason(7)

    printSeasons(5)

    // Задание 2
    println("Task 2")
    printDogAge(4)
    printDogAge2(10)

    // Задание 3
    println("Task 3")
    printTransport(3.5)

    // Задание 4
    println("Task 4")
    printBonus(1500)

    // Задание 5
    println("Task 5")
    printDocumentType("jpg")

    // Задание 6
    println("Task 6")
    convertTemperature(25.0, 'C')

    // Задание 7
    println("Task 7")
    printClothes(15)

    // Задание 8
    println("Task 8")
    printMovieCategory(16)
}