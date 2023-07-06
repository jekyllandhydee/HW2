package com.example.hw2
/*
 5 isim içeren bir ArrayList oluşturun.
Kullanıcıdan, aralarına virgül koyarak 3 isim girmesini isteyin.
Bu girilen 3 isimlik String’i aradaki virgülleri kullanarak parçalayın ve listeye dönüştürün
Bu listenin bol olup olmadığını kontrol edin.
Boş değilse oluşturduğunuz 5 isimlik listeye ekleyin ve son halini konsola yazdırın.
*/
fun main() {
    val names = ArrayList<String>()
    names.add("Name")
    names.add("Name")
    names.add("Name")
    names.add("Name")

    println("Please enter 3 names separated by commas:")
    val input = readLine()
    val arrName = input?.split(",")?.toTypedArray()
    if (arrName != null && arrName.size == 3) {
        names.addAll(arrName)
        println("Added 3 names: ${arrName.contentToString()}")
        println("Created list: $names")
    } else {
        println("The number of names entered must be 3.")
    }
}