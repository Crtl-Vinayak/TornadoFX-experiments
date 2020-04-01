package com.vinayak.kotlin.kotlinExperiments.v5

import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.paint.Color
import javafx.stage.Stage

class KotlinJavaFX : Application() {

    lateinit var root : Group
    lateinit var scene : Scene
    lateinit var window : Stage

    override fun start(primaryStage: Stage?) {
        root = Group()
        scene = Scene(root, 1280.0, 720.0, Color.BLUE)
    }

    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            launch(KotlinJavaFX::class.java)
        }
    }

}