package com.vinayak.kotlin.kotlinExperiments.v2

fun main() {
    Main()
    Main("Vinayak")
    Main("Anne", "Steenweg")
    Main("Peter", "van", "Dijk")
    Main.MainObject.test()
    StaticTest.TestObject.foo()
}

class Main {

    constructor() {
        println("oké (:")
    }

    constructor(firstName : String) {
        println("my firstname is $firstName")
    }

    constructor(firstName : String, lastName : String) {
        println("my firstname is  $firstName and my lastname is $lastName")
    }

    constructor(firstName : String, middleName : String, lastName: String) {
        println("my firstname is $firstName, my middlename is $middleName and my lastname is $lastName")
    }

    object MainObject {
        fun test() {
            println("test")
        }
    }
}