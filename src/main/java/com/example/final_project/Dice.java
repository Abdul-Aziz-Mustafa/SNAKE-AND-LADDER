package com.example.final_project;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Dice implements Initializable {
    Random random = new Random();

    @FXML
    private Circle myCircle;
    @FXML
    private Pane q1;


    @FXML
    private ImageView diceImage;

    @FXML
    private Button rollButton;

    @FXML
    void roll(ActionEvent event) {

        rollButton.setDisable(true);

        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread Running");


                try {
                    for (int i = 0; i < 15; i++) {
                        File file = new File("src/main/resources" + (random.nextInt(6)+1)+".jpeg");
                        diceImage.setImage(new Image(file.toURI().toString()));
                        Thread.sleep(1000);
                    }
                    rollButton.setDisable(false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
    }
//61.0
//74.0


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       TranslateTransition transition =new TranslateTransition();
       transition.setNode(myCircle);
       transition.setToX(0);
       transition.setByY(-q1.getHeight());

       transition.setDuration(Duration.millis(2000));
       transition.play();
    }

}
