package com.example.hw2
/*
Yukarıdaki isimler listesini kullanarak önce harflere göre listeyi sıralayın.
Kullanıcıdan, 1 adet isim isteyin.
Bu isim names listesinde var mı yok mu kontrol edin.
Varsa bu ismi listede arayın, tüm harfleri büyük ve ters çevrilmiş şekilde konsola yazdırın.
 */
fun main() {
    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
    val sortedNames = names.sortedBy { it.toLowerCase() }
    println("Sorted List:")
    sortedNames.forEach { println(it) }
    println("Please enter a name:")
    val userInput = readLine()
    if (names.contains(userInput)) {
        val reversedName = names.find { it == userInput }?.toUpperCase()?.reversed()
        println("$reversedName")
    } else {
        println("This name doesn't exist.")
    }
}