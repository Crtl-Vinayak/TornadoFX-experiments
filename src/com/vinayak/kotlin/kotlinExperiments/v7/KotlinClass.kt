package com.vinayak.kotlin.kotlinExperiments.v7

import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.paint.Color

class KotlinClass {

    object kotlinObject {
        @JvmStatic var perfect : Int = 0
        @JvmStatic lateinit var root : Group
        @JvmStatic lateinit var scene : Scene
        lateinit var button : Button

        @JvmStatic fun sceneSetup() : Unit {
            root = Group()
            scene = Scene(root, 1280.0, 720.0, Color.BLUE)

            button = Button("Go back to red Scene")
            button.setOnAction { sceneSwitch() }
            root.children.add(button)
        }

        @JvmStatic fun sceneSwitch() {
            if (perfect == 0) {
                Main.window.scene = KotlinClass.kotlinObject.scene
                perfect = 1
            } else {
                Main.window.scene = Main.scene
                perfect = 0
            }
        }
    }
}