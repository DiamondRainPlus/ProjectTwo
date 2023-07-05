package com.example.homeworksiki

fun main(){

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

    if (maxAgeStudent != null && minAgeStudent != null){
        println("En büyük yaşa sahip öğrenci : ${maxAgeStudent.name}, indeks : ${students.indexOf(maxAgeStudent)}")
        println("En küçük yaşa sahip öğrenci : ${minAgeStudent.name} , indeks : ${students.indexOf(minAgeStudent)}")
    }

    val filteredStudents = students.filter { it.school == "Üniversite A" }

    println("Üniversite A öğrencileri:")
    filteredStudents.forEach { println("${it.name}, ${it.age}, ${it.school}") }


    val olderThan25 = filteredStudents.filter { it.age > 25 }

    val youngerThan25 = filteredStudents.filter { it.age < 25 }

    println("Yaşları 25'ten büyük olan öğrenciler : ")
    olderThan25.forEach { println("${it.name}, ${it.age}") }

    println("Yaşları 25'ten küçük olan öğrenciler : ")
    youngerThan25.forEach { println("${it.name}, ${it.age}") }


}