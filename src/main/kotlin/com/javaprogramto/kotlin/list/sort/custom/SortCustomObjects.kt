package com.javaprogramto.kotlin.list.sort.custom

fun main() {

    var customObjList = ArrayList<CustomObj>();
    customObjList.add(CustomObj("yahoo"))
    customObjList.add(CustomObj("apple"))
    customObjList.add(CustomObj("google"))
    customObjList.add(CustomObj("bing"))

    println("Before sorting : $customObjList")
    var sortedList =  customObjList.sortedWith(compareBy({it.customObjPropery}));

    println("After sorting : $sortedList")
}

public class CustomObj(var customObjPropery : String){

    override fun toString(): String {
        return "$customObjPropery"
    }
}