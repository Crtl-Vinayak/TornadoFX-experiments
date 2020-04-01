package com.vinayak.kotlin.kotlinExperiments.v1

class SimpleClass {

    object fooMaster {
        fun foo() : Unit {
            println("function foo is being called!")
        }

        fun foo2() {
            println("123456789")
        }
    }

    object secondObject {
        fun foo2() : Unit {
            println("function foo2 is being called from a JavaTest Class to this function.")
        }
    }
}