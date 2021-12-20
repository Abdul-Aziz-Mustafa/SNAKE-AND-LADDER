package com.example.final_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import java.io.File;
import java.util.Random;

public class Dice {
    Random random = new Random();

    @FXML
    private Circle myCircle;
    @FXML
    private Pane q1;
    private Pane q2;
    private Pane q3;

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

    public void trans(){

        myCircle.setCenterY(-q1.getHeight());


    }

}
