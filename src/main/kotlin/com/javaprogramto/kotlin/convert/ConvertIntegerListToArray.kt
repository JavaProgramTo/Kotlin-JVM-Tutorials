package com.javaprogramto.kotlin.convert


import java.util.*


fun main(args: Array<String>){


    // creating a Integer ArrayList .
    var list =  ArrayList<Integer>();


    // Adding values
    list.add(Integer(1));
    list.add(Integer(2));
    list.add(Integer(3));
    list.add(Integer(4))



    // creating an empty intger array with size of list.
    var array = arrayOfNulls<Integer>(list.size);


    // converting list to array
    list.toArray(array);


    println("print converted int array as string : "+ Arrays.toString(array));


}