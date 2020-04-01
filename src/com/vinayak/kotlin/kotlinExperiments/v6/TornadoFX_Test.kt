package com.vinayak.kotlin.kotlinExperiments.v6

import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.paint.Color
import javafx.stage.Stage
import tornadofx.*

class TornadoFX_Test : Application() {

    lateinit var root : Group
    lateinit var scene : Scene
    lateinit var window : Stage

    override fun start(primaryStage: Stage) {
        root = Group()
        scene = Scene(root, 1280.0, 720.0, Color.BLUE)
        window = primaryStage
        window.scene = _init()
        window.show()
    }

    private fun _init() : Scene {
        return scene
    }

    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            launch(TornadoFX_Test::class.java)
        }
    }
}
