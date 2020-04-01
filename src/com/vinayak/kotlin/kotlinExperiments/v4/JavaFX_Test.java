package com.vinayak.kotlin.kotlinExperiments.v4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFX_Test extends Application {

    Group root;
    Scene scene;
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        root = new Group();
        scene = new Scene(root, 1280, 720, Color.PINK);
        window = primaryStage;
        window.setScene(scene);
        window.setTitle("window title");
        window.show();
    }
}
