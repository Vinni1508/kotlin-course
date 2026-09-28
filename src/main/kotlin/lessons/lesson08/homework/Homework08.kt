package lessons.lesson08.homework

class Homework08 {
}
package lesson.lesson08

fun transformationString(i: String) {
    var result = i
    if (result.contains("невозможно")) {
        result = result.replace("невозможно", "совершенно точно возможно, просто требует времени")
    }
    if (result.startsWith("Я не уверен")) {
        result = result + ", но моя интуиция говорит об обратном"
    }
    if (result.contains("катастрофа")) {
        result = result.replace("катастрофа", "интересное событие")
    }
    if (result.endsWith("без проблем")) {
        result = result.replace("без проблем", "с парой интересных вызовов на пути")
    }
    val word = result.trim()
    if (!word.contains(" ")) {
        result = "Иногда," + word + ", но не всегда"
    }
    println(result)
}

fun extractDataLogin(i: String) {
    var result = i
    var parts = result.split("->")
    result = parts[1].trim()
    parts = result.split(" ")
    println(parts[0])
    println(parts[1])

}

fun hideNumber(i: String) {
    var result = i
    result = result.takeLast(4)
    result = "**** ".repeat(3) + result
    println(result)
}

fun formatemail(i: String) {
    var result = i
    result = result.replace("@", " [at] ")
    result = result.replace(".", " [dot] ")
    println(result)
}

fun extractFileName(i: String) {
    var result = i
    var parts = result.split("/")
    println(parts.last())

}

fun createAbbreviation(i: String) {
    var result = ""
    var parts = i.split(" ")
    var size = parts.size
    for (j in 0..<size) {
        result = result + parts[j].trim()[0].uppercase()

    }
    println(result)
}

fun makeUpletters(i: String) {
    var result = ""
    var parts = i.split(" ")
    var size = parts.size
    for (j in 0..<size) {
        result = result + parts[j][0].uppercase() + parts[j].substring(1).lowercase() + " "
    }

    println(result.trim())
}

fun encrypt(i: String) {
    var text = i
    var result = ""
    if (text.length % 2 != 0) {
        text = text + " "
    }
    for (j in 0..<text.length step 2) {
        result = result + text[j + 1] + text[j]
    }
    println(result)
}

fun decrypt(i: String) {
    var text = i
    var result = ""
    if (text.length % 2 != 0) {
        text = text + " "
    }
    for (j in 0..<text.length step 2) {
        result = result + text[j + 1] + text[j]
    }
    println(result)
}

fun sheets(a: Int, b: Int) {
    var size = (a * b).toString().length + 1

    for (i in 1..a) {
        for (j in 1..b) {
            print("%${size}d".format(j * i))
        }
        println()
    }
}

fun main() {
    println("Task 1")
    transformationString("Это невозможно выполнить за один день")
    transformationString("Я не уверен в успехе этого проекта")
    transformationString("Произошла катастрофа на сервере")
    transformationString("Этот код работает без проблем")
    transformationString("Удача")
    println("Task 2")
    extractDataLogin("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    println("Task 3")
    hideNumber("4539 1488 0343 6467")
    println("Task 4")
    formatemail("username@example.com")
    println("Task 5")
    extractFileName("C:/Пользователи/Документы/report.txt")
    println("Task 6")
    createAbbreviation("Котлин лучший язык программирования")
    println("Task 7")
    makeUpletters("Котлин лучший язык программирования")
    println("Task 8")
    encrypt("Котлин лучший язык программирования")
    decrypt("оКлтнил чуиш йзякып орргмаиморавин я")
    println("Task 9")
    sheets(5, 8)
}