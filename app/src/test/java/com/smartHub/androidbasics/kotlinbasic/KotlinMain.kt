package com.smartHub.androidbasics.kotlinbasic

object KotlinMain {

    const val a : String = ""
    val b : String = ""

    @JvmStatic
    fun main(args: Array<String>) {

//        new Variables().printHelloWorld("test",true);
        println(KotlinObject.test)
        println(KotlinObject.test1)
        println(KotlinObject.test2)
        println(KotlinObject.test3)
        println(Variables().content)
    }
}