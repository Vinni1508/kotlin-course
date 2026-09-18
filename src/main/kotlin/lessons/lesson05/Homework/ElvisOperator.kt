package lessons.lesson05.Homework

class ElvisOperator {
}

fun main() {

    // Задача 1
    val baseIntensity: Double = 3.0
    val coefficient: Double? = 0.73
    val baseCoefficient: Double = 0.5

    val finalCoefficient = coefficient ?: baseCoefficient
    val resultIntensity = baseIntensity * finalCoefficient

    println(resultIntensity)


    // Задача 2
    val defaultCost: Double = 50.0
    val cost: Double? = 20.0
    val deliveryCost: Double = 5.0
    val insuranceCoefficient: Double = 0.005

    val finalCost = cost ?: defaultCost
    val insuranceCost = finalCost * insuranceCoefficient
    val totalCost = deliveryCost + insuranceCost

    println(totalCost)


    // Задача 3
    val pressure: String? = "34.6"
    val attentionMessage: String = "Attention, pressure is lost"

    val pressureForLab = pressure ?: attentionMessage

    println(pressureForLab)
}