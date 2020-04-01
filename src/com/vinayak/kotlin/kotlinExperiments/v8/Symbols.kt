package com.vinayak.kotlin.kotlinExperiments.v8

import javafx.fxml.FXML
import javafx.scene.layout.GridPane
import tornadofx.*

class Symbols : View()  {
    override val root : GridPane by fxml("SymbolViewer.fxml")

    var count : Int = 0

    @FXML
    fun increment() {
        println(count)
    }
}