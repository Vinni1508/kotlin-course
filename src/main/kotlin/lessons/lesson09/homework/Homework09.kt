package lesson.lesson09

// 1 Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
val a1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
val numbers = arrayOf(1, 2, 3, 4, 5)

// 2 Создайте пустой массив строк размером 10 элементов.
val a2: Array<String> = Array(10) { "" }

// 3 Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
val a3: DoubleArray = doubleArrayOf(2.0, 4.0, 6.0, 8.0, 10.0)

// 4 Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
val a4 = Array<Int>(5) { 0 }
// SET 7 Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
fun checkString(set: Set<String>, search: String) {

    var found = false

    for (element in set) {
        if (element == search) {
            found = true
        }
    }

    println(found)
}

fun main() {
    for (i in a4.indices) {
        a4[i] = i * 3
    }
// 5 Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val strings: Array<String?> = arrayOf(null, "Kotlin", "Hello")

// 6 Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val a5 = arrayOf(1, 2, 3, 4, 5)
    val copya5 = IntArray(a5.size)

    for (i in a5.indices) {
        copya5[i] = a5[i]
    }
// 7 Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val a6 = arrayOf(5, 6, 7, 8, 9)
    val a7 = arrayOf(1, 2, 3, 4, 5)

    val result = Array<Int>(a6.size) { 0 }

    for (i in a6.indices) {
        result[i] = a6[i] - a7[i]
    }
    for (i in result) {
        println(i)
    }
// 8 Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val numbers8 = arrayOf(8, 3, 7, 5, 10)

    var i = 0
    var result8 = -1

    while (i < numbers8.size) {

        if (numbers8[i] == 5) {
            result8 = i
            break
        }

        i++
    }

    println(result8)
// 9 Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val numbers9 = arrayOf(1, 2, 3, 4, 5, 6)

    for (number in numbers9) {

        if (number % 2 == 0) {
            println("$number - чётное")
        } else {
            println("$number - нечётное")
        }
    }
    // 10 Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
    fun findString(strings: Array<String>, search: String) {

        for (text in strings) {

            if (text.contains(search)) {
                println(text)
            }
        }
    }

    // 1. Пустой неизменяемый список целых чисел
    val list1: List<Int> = emptyList()


    // 2. Неизменяемый список строк из трех элементов
    val list2: List<String> = listOf("Hello", "World", "Kotlin")


    // 3. Изменяемый список целых чисел от 1 до 5
    val list3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)


    // 4. Добавить новые элементы
    val list4 = mutableListOf(1, 2, 3, 4, 5)

    list4.add(6)
    list4.add(7)
    list4.add(8)

    println(list4)


    // 5. Удалить определенный элемент
    val list5 = mutableListOf("Hello", "World", "Kotlin")

    list5.remove("World")

    println(list5)


    // 6. Вывести каждый элемент списка через цикл
    val list6 = listOf(10, 20, 30, 40, 50)

    for (element in list6) {
        println(element)
    }


    // 7. Получить второй элемент списка по индексу
    val list7 = listOf("Java", "Kotlin", "Python")

    println(list7[1])


    // 8. Заменить элемент с индексом 2
    val list8 = mutableListOf(10, 20, 30, 40)

    list8[2] = 100

    println(list8)


    // 9. Объединить два списка с помощью циклов
    val firstList = listOf("Hello", "World")
    val secondList = listOf("Kotlin", "Java")

    val resultList = mutableListOf<String>()

    for (element in firstList) {
        resultList.add(element)
    }

    for (element in secondList) {
        resultList.add(element)
    }

    println(resultList)


    // 10. Найти минимальный и максимальный элементы через цикл
    val list10 = listOf(7, 2, 9, 4, 1, 8)

    var min = list10[0]
    var max = list10[0]

    for (element in list10) {

        if (element < min) {
            min = element
        }

        if (element > max) {
            max = element
        }
    }

    println("Минимальное: $min")
    println("Максимальное: $max")


    // 11. Создать новый список только из четных чисел
    val list11 = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    val evenList = mutableListOf<Int>()

    for (element in list11) {

        if (element % 2 == 0) {
            evenList.add(element)
        }
    }

    println(evenList)

    // 1. Пустое неизменяемое множество Int
    val set1: Set<Int> = emptySet()


// 2. Неизменяемое множество
    val set2: Set<Int> = setOf(1, 2, 3)


// 3. Изменяемое множество строк
    val set3: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")


// 4. Добавить новые элементы
    val set4 = mutableSetOf("Kotlin", "Java", "Scala")

    set4.add("Swift")
    set4.add("Go")

    println(set4)


// 5. Удалить элемент
    val set5 = mutableSetOf(1, 2, 3, 4, 5)

    set5.remove(2)

    println(set5)


// 6. Перебрать Set циклом
    val set6 = setOf(10, 20, 30, 40)

    for (element in set6) {
        println(element)
    }


// 7. Проверить наличие строки в Set
    checkString(setOf("Kotlin", "Java", "Scala"), "Kotlin")


// 8. Преобразовать Set в MutableList с помощью цикла
    val set8 = setOf("Kotlin", "Java", "Scala")

    val listFromSet = mutableListOf<String>()

    for (element in set8) {
        listFromSet.add(element)
    }

    println(listFromSet)
}