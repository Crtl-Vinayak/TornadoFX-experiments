package com.vinayak.kotlin.kotlinExperiments.v7;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author Vinayak
 * @since 01/04/2020
 * @version v.1.0.0
 */
public class Main extends Application {

    Group root;
    static Scene scene;
    static Stage window;

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        root = new Group();
        scene = new Scene(root, 1280, 720, Color.CRIMSON);
        window = primaryStage;
        window.setScene(scene);
        window.setTitle("javafx application");
        window.show();

        button = new Button("switch Scene");
        button.setLayoutX(100);
        button.setLayoutY(100);
        button.setPrefWidth(100);
        button.setPrefHeight(100);
        button.setOnAction(event -> KotlinClass.kotlinObject.sceneSwitch());
        root.getChildren().add(button);

        KotlinClass.kotlinObject.sceneSetup();
        System.out.println(KotlinClass.kotlinObject.getPerfect());
    }
}
