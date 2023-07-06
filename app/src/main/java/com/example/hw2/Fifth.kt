package com.example.hw2

/*
Yukarıdaki işçiler listesini kullanarak her çalışana %35 zam yapın.
Listeyi karıştırıp maaş değerine göre küçükten büyüğe sıralayın.
En yüksek ve en düşük maaş alanları konsola yazdırın.
Maaş ortalamasını hesaplayıp konsola yazdırın.
*/
fun main() {
    data class Workers(val name: String, val salary: Double)

    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )
    val updatedWorkers = workers.map { worker ->
        val increasedSalary = worker.salary * 1.35
        worker.copy(salary = increasedSalary)
    }
    val shuffledSortedWorkers = updatedWorkers.shuffled().sortedBy { it.salary }

    val maxSalaryWorker = shuffledSortedWorkers.last()
    val minSalaryWorker = shuffledSortedWorkers.first()
    println("En yüksek maaş: ${maxSalaryWorker.name}, maaş: ${maxSalaryWorker.salary}")
    println("En düşük maaş: ${minSalaryWorker.name}, maaş: ${minSalaryWorker.salary}")
    val averageSalary = updatedWorkers.map { it.salary }.average()
    println("Maaş ortalaması: $averageSalary")


}