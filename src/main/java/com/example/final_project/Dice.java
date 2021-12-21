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
    private Pane q0;
    @FXML
    private Pane q1;
    @FXML
    private Pane q2;
    @FXML
    private Pane q3;
    @FXML
    private Pane q4;
    @FXML
    private Pane q5;
    @FXML
    private Pane q6;
    @FXML
    private Pane q7;
    @FXML
    private Pane q8;
    @FXML
    private Pane q9;
    @FXML
    private Pane q10;
    @FXML
    private Pane q11;
    @FXML

    private Pane q12;
    @FXML

    private Pane q13;
    @FXML

    private Pane q14;
    @FXML

    private Pane q15;
    @FXML

    private Pane q16;
    @FXML

    private Pane q17;
    @FXML

    private Pane q18;
    @FXML

    private Pane q19;
    @FXML

    private Pane q20;
    @FXML

    private Pane q21;
    @FXML

    private Pane q22;
    @FXML

    private Pane q23;
    @FXML

    private Pane q24;
    @FXML

    private Pane q25;
    @FXML

    private Pane q26;
    @FXML

    private Pane q27;
    @FXML

    private Pane q28;
    @FXML

    private Pane q29;
    @FXML

    private Pane q30;
    @FXML

    private Pane q31;
    @FXML

    private Pane q32;
    @FXML

    private Pane q33;
    @FXML

    private Pane q34;
    @FXML

    private Pane q35;
    @FXML

    private Pane q36;
    @FXML

    private Pane q37;
    @FXML

    private Pane q38;
    @FXML

    private Pane q39;
    @FXML

    private Pane q40;
    @FXML

    private Pane q41;
    @FXML

    private Pane q42;
    @FXML

    private Pane q43;
    @FXML

    private Pane q44;
    @FXML

    private Pane q45;
    @FXML

    private Pane q46;
    @FXML

    private Pane q47;
    @FXML

    private Pane q48;
    @FXML

    private Pane q49;
    @FXML

    private Pane q50;
    @FXML

    private Pane q51;
    @FXML

    private Pane q52;
    @FXML

    private Pane q53;
    @FXML

    private Pane q54;
    @FXML

    private Pane q55;
    @FXML

    private Pane q56;
    @FXML

    private Pane q57;
    @FXML

    private Pane q58;
    @FXML

    private Pane q59;
    @FXML

    private Pane q60;
    @FXML

    private Pane q61;
    @FXML

    private Pane q62;
    @FXML

    private Pane q63;
    @FXML

    private Pane q64;
    @FXML

    private Pane q65;
    @FXML

    private Pane q66;
    @FXML

    private Pane q67;
    @FXML

    private Pane q68;
    @FXML

    private Pane q69;
    @FXML

    private Pane q70;
    @FXML

    private Pane q71;
    @FXML

    private Pane q72;
    @FXML

    private Pane q73;
    @FXML

    private Pane q74;
    @FXML

    private Pane q75;
    @FXML

    private Pane q76;
    @FXML

    private Pane q77;
    @FXML

    private Pane q78;
    @FXML

    private Pane q79;
    @FXML

    private Pane q80;
    @FXML

    private Pane q81;
    @FXML

    private Pane q82;
    @FXML

    private Pane q83;
    @FXML

    private Pane q84;
    @FXML

    private Pane q85;
    @FXML

    private Pane q86;
    @FXML

    private Pane q87;
    @FXML

    private Pane q88;
    @FXML

    private Pane q89;
    @FXML

    private Pane q90;
    @FXML

    private Pane q91;
    @FXML

    private Pane q92;
    @FXML

    private Pane q93;
    @FXML

    private Pane q94;
    @FXML

    private Pane q95;
    @FXML

    private Pane q96;
    @FXML

    private Pane q97;
    @FXML

    private Pane q98;
    @FXML

    private Pane q99;

    class cordinates{
        double x;
        double y;
        boolean s;
        boolean l;
        int st;
        int lh;

        public cordinates(double x, double y) {
            this.x = x;
            this.y = y;
        }


        public cordinates(double x, double y, boolean s, boolean l, int st, int lh) {
            this.x = x;
            this.y = y;
            this.s = s;
            this.l = l;
            this.st = st;
            this.lh = lh;
        }


    }

    ArrayList<cordinates> ar=new ArrayList<cordinates>();
    public void adder(Pane q){
        ar.add(new cordinates(q.getLayoutX(),q.getLayoutY()));
    }
    public void adderL(Pane q,int lh){
        ar.add(new cordinates(q.getLayoutX(),q.getLayoutY(),false,true,-1,lh));

    }
    public void adderS(Pane q,int st){
        ar.add(new cordinates(q.getLayoutX(),q.getLayoutY(),false,true,-1,st));

    }
    public void pane_adder(){

        adder(q0);
        adder(q1);
        adder(q2);
        adderL(q9,13);
        adderS(q28,11);
        adder(q1);
        adder(q1);
        adder(q1);
        adder(q1);
        adder(q1);
        adder(q1);

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
    void roll(ActionEvent event) {
        int no;

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
