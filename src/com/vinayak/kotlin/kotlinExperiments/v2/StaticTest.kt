package com.vinayak.kotlin.kotlinExperiments.v2

class StaticTest {

    object TestObject {
        @JvmStatic fun foo() {
            println("you called a static function")
        }
    }
}