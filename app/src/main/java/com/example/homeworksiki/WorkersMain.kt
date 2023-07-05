package com.example.homeworksiki

fun main() {
    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )

    workers.forEach { worker ->
        val newSalary = worker.salary * 1.35
        val increaseAmount = newSalary - worker.salary
        println("${worker.name}: Zam oranı %35. Eski maaş: ${worker.salary}, Yeni maaş: $newSalary, Zam miktarı: $increaseAmount")
        worker.salary = newSalary
    }

    workers.shuffle()
    workers.sortBy { it.salary }

    workers.forEach { worker ->
        println("Name: ${worker.name}")
        println("Salary: ${worker.salary}")
        println("--------------------")
    }

    val lowestSalaryWorker = workers.minByOrNull { it.salary }
    val highestSalaryWorker = workers.maxByOrNull { it.salary }

    println("En düşük maaş alan işçi:")
    println("Name: ${lowestSalaryWorker?.name}")
    println("Salary: ${lowestSalaryWorker?.salary}")
    println("--------------------")

    println("En yüksek maaş alan işçi:")
    println("Name: ${highestSalaryWorker?.name}")
    println("Salary: ${highestSalaryWorker?.salary}")
    println("--------------------")

    val totalSalary = workers.sumByDouble { it.salary }
    val averageSalary = totalSalary / workers.size

    println("Maaş Ortalaması: $averageSalary")
}
