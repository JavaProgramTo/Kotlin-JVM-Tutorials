package com.javaprogramto.kotlin.exceptions.stacktrace

import java.io.PrintWriter
import java.io.StringWriter

fun main(args: Array<String>) {

    try {

        var number = 100;

        var division = number / 0;


    } catch (e: ArithmeticException){

        val stringWriter = StringWriter()
        e.printStackTrace(PrintWriter(stringWriter))
        val exceptionAsString = stringWriter.toString()
        println(exceptionAsString)

    }
}