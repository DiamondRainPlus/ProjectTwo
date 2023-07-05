package com.example.homeworksiki

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    val isimler = ArrayList<String>(5)

    println("Lütfen virgülle ayrılmış 3 isim giriniz.")
    val girdi = readLine()

    val isimlerArray = girdi?.split(",")

    if (isimlerArray != null && isimlerArray.size >= 3){
        isimler.addAll(isimlerArray)
    }else{
        println("3 isim girmediniz veya virgül koymadınız.")
    return
    }

    if (isimler.size == 3){
        println("İsimlerin son hali : ")

        for (isim in isimler){
            println(isim)
        }
    }else{
        println("Listede 3 isim olmalıdır!")
    }

    if(isimler.isEmpty()){
        println("Liste boş.")
    }else{
        println("Liste boş değil.")
    }




}