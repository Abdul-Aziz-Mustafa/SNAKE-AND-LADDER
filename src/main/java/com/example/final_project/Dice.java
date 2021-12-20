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
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class Dice   {
    //@by_aziz//
    Random random = new Random();

    @FXML
    private ImageView diceImage;

    @FXML
    private Button rollButton;
    @FXML
    private Circle myCircle;
    @FXML
    private Pane q1;
    @FXML
    private Pane q2;
    @FXML
    private Pane q3;
    class cordinates{
        double x;
        double y;

        public cordinates(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    ArrayList<cordinates> ar=new ArrayList<cordinates>();
    public void adder(Pane q){
        ar.add(new cordinates(q.getLayoutX(),q.getLayoutY()));
    }
    public void pane_adder(){

        adder(q1);
        adder(q2);
        adder(q3);
//        adder(q1);
//        adder(q1);
//        adder(q1);
//        adder(q1);
//        adder(q1);
//        adder(q1);
//        adder(q1);
//        adder(q1);

    }
    @FXML
    public void action(ActionEvent e) throws InterruptedException {
        pane_adder();
        TranslateTransition t=new TranslateTransition();
        t.setDuration(Duration.millis(1000));
        t.setByX(61);
        t.setNode(myCircle);
        t.play();
//        Thread.sleep(1000);
        myCircle.setCenterX(ar.get(1).x);
    }
    @FXML
    int roll(ActionEvent event) {

        rollButton.setDisable(true);

        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread Running");
                try {
                    for (int i = 0; i < 15; i++) {
                        int number=(random.nextInt(6)+1);
                        Image dImage = new Image(getClass().getResourceAsStream("D" + number +".jpeg"));
                        diceImage.setImage(dImage);
                        Thread.sleep(50);
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
