package lessons.lesson07.homework

fun main() {
//Задания для цикла for

//Task 1
    println("Task 1")
    for (i in 1..5) {
        println(i)
    }
//Task 2
    println("Task 2")
    for (j in 1..10) {
        if (j % 2 == 0) {
            println(j)
        }
    }
    //Task 3
    println("Task 3")
    for (i in 1..5) {
        println(6 - i)
    }
    //Task 4
    println("Task 4")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
//Task 5
    println("Task 5")
    for (i in 1..9 step 2) {
        println(i)
    }
//Task 6
    println("Task 6")
    for (i in 1..20 step 3) {
        println(i)
    }

    println("Task 7")
    val size = 7
    for (i in 3..size) {
        println(i)
    }
    println("Task 8")
    var count = 0
    while (++count <= 5) {
        println(count * count)
    }
    println("Task 9")
    count = 5
    while (++count < 10) {
        println(count)
    }
    println("Task 10")
    count = 5
    do {
        println(count)
    } while (--count >= 1)

    println("Task 11")
    count = 5
    do {
        println(count)
    } while (++count < 10)
    println("Task 12")
    for (i in 1..10) {
        println(i)
        if (i == 6) break
    }
    println("Task 13")
    var countmax = 999
    count = 0
    while (++count < countmax) {
        println(count)
        if (count == 10) break
    }
    println("Task 14")
    for (i in 1..10) {
        if (i % 2 == 0) continue
        else {
            println(i)
        }

    }
    println("Task 15")
    count = 0
    while (++count < 10) {
        if (count % 3 == 0) continue
        else {
            println(count)
        }
    }


    println("Task 1.1")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${j * i} ")
        }
        println()
    }
    println("Task 1.2")
    var arg = 3
    count = 0
    for (i in 1..arg) {
        count = count + i
    }
    println(count)



    println("Task 1.3")
    var argF = 1
    arg = 4
    count = 0
    while (++count <= arg) {
        argF = argF * count
    }
    println("Factorial $arg = $argF")

    println("Task 1.4")
    arg = 6
    count = 0
    var argsum = 0
    while (++count <= arg) {
        if (count % 2 == 1) continue
        else {
            argsum = argsum + count
        }
    }
    println("Сумма четных чисел до $arg = $argsum")

    println("Task 1.5")
    count = 0
    var count2 = 0
    while (++count <= 3) {
        println("-----------")
        while (++count2 <= 5) {
            print("|*")
        }
        println("|")
        count2 = 0
    }
    println("-----------")


    println("Task 1.6")
    arg = 5
    var sumEven = 0
    var sumOdd = 0
    for (i in 1..arg) {
        if (i % 2 == 1) {
            sumOdd += i
        }
        if (i % 2 == 0) {
            sumEven += i
        }
    }
    println("Сумма четных $sumEven сумма нечетных $sumOdd")

}