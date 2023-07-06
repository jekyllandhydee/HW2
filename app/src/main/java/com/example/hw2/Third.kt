package com.example.hw2

/*
İlk olarak en büyük ve en küçük yaşa sahip olan öğrencinin ismini ve kaçıncı indexte olduğunu konsola yazdırın.
Listede school değeri Üniversite A olanları filtreleyin.
Filtreleme işleminden dönen listeyi yaşları 25’ten büyükler ve küçükler olarak alt alta konsola yazdırın.
 */
fun main() {
    data class Student(val name: String, val age: Int, val school: String)

    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )

    val maxAgeStudent = students.maxByOrNull { it.age }
    val minAgeStudent = students.minByOrNull { it.age }

    val maxAgeStudentIndex = students.indexOf(maxAgeStudent)
    val minAgeStudentIndex = students.indexOf(minAgeStudent)

    println("En büyük: ${maxAgeStudent?.name}, index: $maxAgeStudentIndex")
    println("En küçük: ${minAgeStudent?.name}, index: $minAgeStudentIndex")

    val filteredStudents = students.filter { it.school == "Üniversite A" }
    val above25 = filteredStudents.filter { it.age > 25 }
    val below25 = filteredStudents.filter { it.age < 25 }

    println("\nÜniversite A && 25'ten büyük")
    above25.forEach { println("${it.name}, ${it.age}") }
    println("\nÜniversite A && yaşları 25'ten küçük")
    below25.forEach { println("${it.name}, ${it.age}") }



}