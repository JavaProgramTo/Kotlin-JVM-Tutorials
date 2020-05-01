package com.javaprogramto.kotlin.list

import org.apache.commons.collections4.ListUtils

fun main() {

    var list1 = ArrayList<String>();

    list1.add("hello")
    list1.add("world")

    var list2 = ArrayList<String>()

    list2.add("welcome")
    list2.add("java developer")

    var joinedNewList = ListUtils.union(list1, list2);

    println("List one : $list1")
    println("List two : $list2")
    println("After adding two lists using ListUtils.union() method is : $joinedNewList")


}