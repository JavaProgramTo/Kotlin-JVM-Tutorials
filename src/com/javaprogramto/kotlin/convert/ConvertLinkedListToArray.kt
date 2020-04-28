package com.javaprogramto.kotlin.convert


import java.util.*


fun main(args: Array<String>){


    // creating a Integer LinkedList .
    var list =  LinkedList<Long>();


    // Adding values
    list.add(100L)
    list.add(200L);
    list.add(300L);
    list.add(400L)



    // creating an empty intger array with size of list.
    var array = arrayOfNulls<Long>(list.size);


    // converting LinkedList to array
    list.toArray(array);


    println("print converted long LinkedList as string : "+ Arrays.toString(array));


}