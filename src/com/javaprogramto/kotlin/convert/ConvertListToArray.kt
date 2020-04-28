package com.javaprogramto.kotlin.convert


import java.util.*


fun main(args: Array<String>){


    // creating a ArrayList.
    var list =  ArrayList<String>();


    // Adding values
    list.add("hello");
    list.add("world");
    list.add("welcome to");
    list.add("javaprogramto.com blog")



    // creating an emmpty array with size of list.
    var array = arrayOfNulls<String>(list.size);


    println("print empty array as string : "+ Arrays.toString(array));

    // converting list to array
    list.toArray(array);


    println("print converted array : "+array);


    println("print converted array as string : "+ Arrays.toString(array));


}