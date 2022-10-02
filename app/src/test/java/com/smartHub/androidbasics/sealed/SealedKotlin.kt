package com.smartHub.androidbasics.sealed

sealed class SealedKotlin{
    var test = "ankit";
}

object A : SealedKotlin() {
    fun display() {
        println("Subclass A of Sealed class Demo $test")
    }
}

object B : SealedKotlin() {
    fun display() {
        println("Subclass B of sealed class Demo")
    }
}
