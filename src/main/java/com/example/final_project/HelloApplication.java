package com.example.final_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene=new Scene(root);
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("icon3.jpeg")));
//        scene.getStylesheets().add(getClass().getResource("application.css"))
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
