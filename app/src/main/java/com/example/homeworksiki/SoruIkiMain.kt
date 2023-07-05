package com.example.homeworksiki

fun main(){

    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")

    names.sortBy { it.lowercase() }
    for (name in names) {
        println(name)
    }

    println("Bir isim girin : ")
    val inputName = readLine()

    if (names.contains(inputName)) {
        val founName = names.find { it.equals(inputName, ignoreCase = true ) }

        if (founName != null) {
            val reservedName = founName.toUpperCase(). reversed()

            println("Bulunan İsim : $reservedName")
        }else {
            println("İsim bulunamadı.")
        }
    }else{
            println("İsim bu listede yok. ")
        }
        }


