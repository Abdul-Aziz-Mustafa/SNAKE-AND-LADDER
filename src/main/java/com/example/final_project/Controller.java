package com.example.final_project;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Controller extends Board {

    private Stage stage;
    private Scene scene;
    private Parent root;

public void switchtoscene2(ActionEvent event) throws IOException {
    Parent root= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
    stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
    scene=new Scene(root);
    String path = "C:/Users/abdul/Downloads/md.mp3";

    //Instantiating Media class
    Media media = new Media(new File(path).toURI().toString());

    //Instantiating MediaPlayer class
    MediaPlayer mediaPlayer = new MediaPlayer(media);

//        by setting this property to true, the audio will be played
        mediaPlayer.setAutoPlay(true);
    stage.setScene(scene);
    stage.show();


}
    public void switchtoscene1(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


//    Random random = new Random();


    @FXML
    private ImageView myCircle1;
    @FXML
    private ImageView myCircle2;



    @FXML
    ImageView playerWin;
    @FXML
    TextField player11;
    @FXML
    TextField player12;



    static class cordinates {
        double x;
        double y;
        boolean s = false;
        boolean l = false;
        int st = -1;
        int lh = -1;

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



    public void pane_adder() {

        adder(q0);
        adder(q1);
        adder(q2);
        adder(q3);
        adderL(q4, 16);
        adder(q5);
        adderL(q6, 14);
        adder(q7);
        adderL(q8, 12);
        adder(q9);
        adder(q10);
        adder(q11);
        adder(q12);
        adder(q13);
        adder(q14);
        adder(q15);
        adder(q16);
        adder(q17);
        adder(q18);
        adder(q19);
        adder(q20);
        adder(q21);
        adder(q22);
        adderS(q23, 17);
        adder(q24);
        adderS(q25, 15);
        adder(q26);
        adderS(q27, 13);
        adder(q28);
        adder(q29);
        adder(q30);
        adder(q31);
        adderL(q32, 46);
        adder(q33);
        adderL(q34, 44);
        adder(q35);
        adderL(q36, 42);
        adder(q37);
        adder(q38);
        adder(q39);
        adderL(q40, 80);
        adder(q41);
        adder(q42);
        adder(q43);
        adder(q44);
        adder(q45);
        adder(q46);
        adder(q47);
        adder(q48);
        adder(q49);
        adder(q50);
        adder(q51);
        adder(q52);
        adder(q53);
        adderS(q54, 33);
        adder(q55);
        adderS(q56, 35);
        adder(q57);
        adderS(q58, 37);
        adder(q59);
        adder(q60);
        adder(q61);
        adder(q62);
        adderL(q63, 82);
        adder(q64);
        adderL(q65, 84);
        adder(q66);
        adderL(q67, 86);
        adder(q68);
        adder(q69);
        adder(q70);
        adder(q71);
        adder(q72);
        adder(q73);
        adder(q74);
        adder(q75);
        adder(q76);
        adder(q77);
        adder(q78);
        adder(q79);
        adder(q80);
        adder(q81);
        adder(q82);
        adder(q83);
        adder(q84);
        adder(q85);
        adder(q86);
        adder(q87);
        adder(q88);
        adder(q89);
        adderS(q90, 49);
        adder(q91);
        adder(q92);
        adder(q93);
        adderS(q94, 73);
        adder(q95);
        adderS(q96, 75);
        adder(q97);
        adderS(q98, 77);
        adder(q99);

    }



    static int pos1 = 0;
    static int pos2 = 0;


    boolean check1 = false;
    boolean check2 = false;
    static int counter = 0;


    @FXML
    public void action(ActionEvent e) throws InterruptedException {




        if (counter % 2 == 0) {


            if (num == 1) {


                check1 = true;
            }
            if (check1) {


                pane_adder();
                System.out.println(num + "number is ");
                pos1 = pos1 + num; //97+5
                if (pos1 >= 100) {
                    pos1 = pos1 - num;

                    counter++;
                    return;
                }
                if (pos1 == 99) {
                    Image myImage = new Image(getClass().getResourceAsStream("Win.png"));
                    playerWin.setX(q3.getLayoutX());
                    playerWin.setImage(myImage);
                    check2 = false;
                    System.out.println("yay\n");
                }

                TranslateTransition translate = new TranslateTransition();
                translate.setToX(ar.get(pos1).x);
                translate.setToY(ar.get(pos1).y - 667);
                translate.setDuration(Duration.millis(750));
                System.out.println(ar.get(pos1).x);
                System.out.println(ar.get(pos1).y);
                System.out.println(q54.getLayoutX() + "x");
                System.out.println(q54.getLayoutY() + "y");

                if (ar.get(pos1).l) {
                    TranslateTransition translate1 = new TranslateTransition();

                    translate1.setToX((ar.get(ar.get(pos1).lh)).x);
                    translate1.setToY((ar.get(ar.get(pos1).lh)).y - 667);
                    translate1.setDuration(Duration.millis(750));
                    SequentialTransition seqT = new SequentialTransition(myCircle1, translate, translate1);
//                    String path = "C:/Users/abdul/Downloads/ladder.mp3";
//
//                    //Instantiating Media class
//                    Media media = new Media(new File(path).toURI().toString());
//
//                    //Instantiating MediaPlayer class
//                    MediaPlayer mediaPlayer = new MediaPlayer(media);
//                    mediaPlayer.setAutoPlay(true);


                    seqT.play();

                    pos1 = ar.get(pos1).lh;
                    counter++;

                }
                if (ar.get(pos1).s) {
                    TranslateTransition translate1 = new TranslateTransition();

                    translate1.setToX((ar.get(ar.get(pos1).st)).x);
                    translate1.setToY((ar.get(ar.get(pos1).st)).y - 667);
                    translate1.setDuration(Duration.millis(750));
                    translate1.setNode(myCircle1);
                    pos1 = ar.get(pos1).st;
//                    translate.setNode(myCircle1);

                    SequentialTransition seqT = new SequentialTransition(myCircle1, translate, translate1);

//                    String path = "C:/Users/abdul/Downloads/snake.mp3";

                    //Instantiating Media class
//                    Media media = new Media(new File(path).toURI().toString());
//
//                    //Instantiating MediaPlayer class
//                    MediaPlayer mediaPlayer = new MediaPlayer(media);
//                    mediaPlayer.setAutoPlay(true);
                    seqT.play();

                    counter++;


                }
                if (!ar.get(pos1).s && !ar.get(pos1).l) {
                    translate.setNode(myCircle1);
                    try{
                    translate.play();}
                    catch (Exception E){
                        System.out.println("ladder");
                    }
                    System.out.println(pos1 + "position\n");
                    counter++;

                }
                player11.setText(String.valueOf(pos1+1));

            } else {
                counter++;

                return;
            }

        } else {
            if (num == 1) {

                check2 = true;
            }
            if (check2) {


                pane_adder();
                System.out.println(num + "number is ");
                pos2 = pos2 + num;
                if (pos2 >= 100) {
                    pos2 = pos2 - num;
                    counter++;
                    return;
                }
                if (pos2 == 99) {
                    Image myImage1 = new Image(getClass().getResourceAsStream("Win.png"));
                    playerWin.setX(q3.getLayoutX());
                    playerWin.setImage(myImage1);
                    check1 = false;
                    System.out.println("yay\n");
                }
                TranslateTransition translate = new TranslateTransition();
                translate.setToX(ar.get(pos2).x);
                translate.setToY(ar.get(pos2).y - 667);
                translate.setDuration(Duration.millis(1000));
                System.out.println(ar.get(pos2).x);
                System.out.println(ar.get(pos2).y);
                System.out.println(q54.getLayoutX() + "x");
                System.out.println(q54.getLayoutY() + "y");
                if (ar.get(pos2).l) {
                    TranslateTransition translate1 = new TranslateTransition();

                    translate1.setToX((ar.get(ar.get(pos2).lh)).x);
                    translate1.setToY((ar.get(ar.get(pos2).lh)).y - 667);
                    translate1.setDuration(Duration.millis(750));
                    SequentialTransition seqT = new SequentialTransition(myCircle2, translate, translate1);
                    String path = "C:/Users/abdul/Downloads/ladder.mp3";

//                    //Instantiating Media class
//                    Media media = new Media(new File(path).toURI().toString());
//
//                    //Instantiating MediaPlayer class
//                    MediaPlayer mediaPlayer = new MediaPlayer(media);
//                    mediaPlayer.setAutoPlay(true);

                    seqT.play();

                    pos2 = ar.get(pos2).lh;
                    counter++;

                }
                if (ar.get(pos2).s) {
                    TranslateTransition translate1 = new TranslateTransition();

                    translate1.setToX((ar.get(ar.get(pos2).st)).x);
                    translate1.setToY((ar.get(ar.get(pos2).st)).y - 667);
                    translate1.setDuration(Duration.millis(750));
                    pos2 = ar.get(pos2).st;
//                    translate.setNode(myCircle1);

                    SequentialTransition seqT = new SequentialTransition(myCircle2, translate, translate1);
                    String path = "C:/Users/abdul/Downloads/snake.mp3";

                    //Instantiating Media class
//                    Media media = new Media(new File(path).toURI().toString());
//
//                    //Instantiating MediaPlayer class
//                    MediaPlayer mediaPlayer = new MediaPlayer(media);
//                    mediaPlayer.setAutoPlay(true);
                    seqT.play();
                    counter++;


                }
                if (!ar.get(pos2).s && !ar.get(pos2).l) {
                    translate.setNode(myCircle2);
                    try{
                    translate.play();}
                    catch (Exception E){
                        System.out.println("Snake");
                    }
                    System.out.println(pos2 + "position\n");
                    counter++;

                }
                player12.setText(String.valueOf(pos2+1));

            } else {
                counter++;

                return;
            }


        }


    }





}
