package com.smartHub.androidbasics.kotlinbasic

class Variables {

    @JvmName("world")
    fun hello(){

    }

    @get:JvmName("getContent")
    @set:JvmName("setContent")
    var content = ""


}