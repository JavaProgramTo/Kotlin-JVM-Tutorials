package com.javaprogramto.kotlin.list.sort.custom

fun main() {

    var employeeObjList = ArrayList<Employee>();
    employeeObjList.add(Employee(500))
    employeeObjList.add(Employee(300))
    employeeObjList.add(Employee(100))
    employeeObjList.add(Employee(200))

    println("Employee Objects Before sorting : $employeeObjList")
    var sortedEmpList =  employeeObjList.sortedWith(compareBy({it.id}));

    println("Employee Objects After sorting : $sortedEmpList")
}

public class Employee(var id : Int){

    override fun toString(): String {
        return "$id"
    }
}