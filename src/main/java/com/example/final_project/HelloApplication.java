package com.example.final_project;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage greeting_stage;

    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        this.greeting_stage = stage;
        stage.setResizable(true);
        Image icon = new Image("icon3.jpeg");
        stage.getIcons().add(icon);
        stage.setTitle("Snake And Ladder");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        stage.show();





    }
    public static void main(String[] args) {
        launch();
    }
}
