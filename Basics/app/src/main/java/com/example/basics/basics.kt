package com.example.basics


fun main(){
    //Hello Word, variable/constant
    var name = "Denis"
    //println("hello $name")

    //Datatypes

    //integer data types
    val myByte:Byte = 12
    val myShort:Short =125
    val myInt: Int =115234123
    val myLong: Long = 39_812_309_467_120_305

    //float types float-32 bit, double 64 bit
    val myFloat: Float = 13.137F
    val myDouble: Double = 3.1415926535

    //Boolean, logical values.
    val isTrue:Boolean = false

    //character
    val Letter = 'A'
    //string
    val str = "Something"
    var firstChar: Char = str[0]
    var lastChar: Char = str[str.length-1]
    //println("$firstChar $lastChar ${str.length}")


    //Arithmetic operators
    var result = 5+8
    result /= 2
    val x = 5.0
    var resultDouble = result /x
    //println(resultDouble)

    //Comparision operators (==, !=, <, >, <=, >=)

    val isEqual = 5==3
    print(isEqual)
}
