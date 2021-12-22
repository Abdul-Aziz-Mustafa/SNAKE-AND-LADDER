package com.example.final_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.util.Random;

public class Dice  {

    static int num;

    Random random=new Random();
    @FXML
    private ImageView diceImage;

    @FXML
    private Button rollButton;

    @FXML
    void roll(ActionEvent event) {
        String path = "C:/Users/abdul/Downloads/diceroll.mp3";

//                    Instantiating Media class
        Media media = new Media(new File(path).toURI().toString());

        //Instantiating MediaPlayer class
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setVolume(1);



        rollButton.setDisable(true);

        Thread thread = new Thread() {
            public void run() {
                System.out.println("Thread Running");
                try {
                    for (int i = 0; i < 15; i++) {
                        int number = (random.nextInt(6) + 1);
                        Image dImage = new Image(getClass().getResourceAsStream("D" + number + ".jpeg"));
                        diceImage.setImage(dImage);
                        Thread.sleep(50);
                        num = number;

                    }
                    rollButton.setDisable(false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();


    }

}
