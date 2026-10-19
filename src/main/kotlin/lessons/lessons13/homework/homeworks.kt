package lessons.lessons13.homework

class homeworks {
}

fun main() {

    // 1. Среднее время выполнения тестов
    val testTimes = mapOf("login" to 10, "logout" to 20, "payment" to 30)
    println("1. ${testTimes.values.average()}")

    // 2. Список всех тестовых методов
    val testMethods = mapOf("testLogin" to "smoke", "testPayment" to "regression")
    println("2. ${testMethods.keys}")

    // 3. Добавить новый тест и результат
    val testResults = mutableMapOf("login" to "passed", "logout" to "failed")
    testResults.put("payment", "passed")
    println("3. $testResults")

    // 4. Количество успешных тестов
    val results = mapOf("login" to "passed", "logout" to "failed", "payment" to "passed")
    println("4. ${results.count { it.value == "passed" }}")

    // 5. Удалить исправленный баг
    val bugs = mutableMapOf("bug1" to "open", "bug2" to "fixed")
    bugs.remove("bug2")
    println("5. $bugs")

    // 6. Вывести страницы и статусы
    val pages = mapOf("google.com" to 200, "example.com" to 404)
    pages.forEach { (url, status) ->
        println("6. Страница $url, статус $status")
    }

    // 7. Найти сервисы с долгим временем ответа
    val services = mapOf("auth" to 100, "payment" to 500, "profile" to 200)
    val slowServices = services.filter { it.value > 300 }
    println("7. $slowServices")

    // 8. Получить статус endpoint или значение по умолчанию
    val apiResults = mapOf("/login" to "200", "/payment" to "500")
    val apiStatus = apiResults.getOrElse("/profile") { "Не протестирован" }
    println("8. $apiStatus")

    // 9. Получить browserType, результат не может быть null
    val config = mapOf("browserType" to "Chrome", "environment" to "test")
    println("9. ${config.getValue("browserType")}")

    // 10. Создать копию словаря и добавить новую версию
    val versions = mapOf("app1" to "1.0", "app2" to "2.0")
    val newVersions = versions.plus("app3" to "3.0")
    println("10. $newVersions")

    // 11. Получить настройки устройства или настройки по умолчанию
    val devices = mapOf("Samsung" to "Android 15", "iPhone" to "iOS 18")
    val deviceSettings = devices.getOrDefault("Xiaomi", "Настройки по умолчанию")
    println("11. $deviceSettings")

    // 12. Проверить наличие кода ошибки
    val errors = mapOf(404 to "Not Found", 500 to "Server Error")
    println("12. ${errors.containsKey(404)}")

    // 13. Отфильтровать тесты по версии
    val scenarios = mapOf(
        "Test1_v1" to "Passed",
        "Test2_v2" to "Failed",
        "Test3_v1" to "Skipped"
    )
    val versionTests = scenarios.filterKeys { it.contains("v1") }
    println("13. $versionTests")

    // 14. Проверить наличие неудачных тестов модулей
    val modules = mapOf("auth" to "passed", "payment" to "failed")
    println("14. ${modules.containsValue("failed")}")

    // 15. Добавить настройки из другого словаря
    val settings = mutableMapOf("browser" to "Chrome")
    val extraSettings = mapOf("os" to "Windows", "language" to "ru")
    settings.putAll(extraSettings)
    println("15. $settings")

    // 16. Объединить два неизменяемых словаря
    val bugs1 = mapOf("bug1" to "open")
    val bugs2 = mapOf("bug2" to "fixed")
    val allBugs = bugs1 + bugs2
    println("16. $allBugs")

    // 17. Очистить словарь
    val lastRun = mutableMapOf("login" to "passed", "payment" to "failed")
    lastRun.clear()
    println("17. $lastRun")

    // 18. Убрать пропущенные тесты
    val report = mapOf("login" to "passed", "payment" to "skipped", "logout" to "failed")
    val filteredReport = report.filterValues { it != "skipped" }
    println("18. $filteredReport")

    // 19. Создать копию словаря без нескольких конфигураций
    val configurations = mapOf(
        "browser" to "Chrome",
        "os" to "Windows",
        "language" to "ru"
    )
    val newConfigurations = configurations - listOf("os", "language")
    println("19. $newConfigurations")

    // 20. Преобразовать словарь в список строк
    val testReport = mapOf("Test1" to "passed", "Test2" to "failed")
    val reportList = testReport.map { "${it.key}: ${it.value}" }
    println("20. $reportList")

    // 21. Преобразовать изменяемый словарь в неизменяемый
    val mutableResults = mutableMapOf("login" to "passed", "payment" to "failed")
    val archivedResults = mutableResults.toMap()
    println("21. $archivedResults")

    // 22. Преобразовать числовые ID в строки
    val testIds = mapOf(101 to 10, 102 to 20, 103 to 30)
    val stringIds = testIds.mapKeys { it.key.toString() }
    println("22. $stringIds")

    // 23. Увеличить время ответа на 10%
    val performance = mapOf("1.0" to 100.0, "2.0" to 200.0)
    val newPerformance = performance.mapValues { it.value * 1.10 }
    println("23. $newPerformance")

    // 24. Проверить, пуст ли словарь
    val compilationErrors = mapOf<String, String>()
    println("24. ${compilationErrors.isEmpty()}")

    // 25. Проверить, что словарь не пуст
    val loadResults = mapOf("service1" to "passed")
    println("25. ${loadResults.isNotEmpty()}")

    // 26. Проверить, что все тесты прошли успешно
    val autoTests = mapOf("login" to "passed", "logout" to "passed")
    println("26. ${autoTests.all { it.value == "passed" }}")

    // 27. Проверить, есть ли хотя бы один тест с ошибкой
    val checkResults = mapOf("login" to "passed", "payment" to "failed")
    println("27. ${checkResults.any { it.value == "failed" }}")

    // 28. Найти неуспешные optional тесты
    val serviceTests = mapOf(
        "optionalLogin" to "failed",
        "optionalPayment" to "passed",
        "requiredLogin" to "failed",
        "optionalProfile" to "failed"
    )
    val failedOptional = serviceTests.filterNot {
        it.value == "passed" || !it.key.contains("optional")
    }
    println("28. $failedOptional")
}