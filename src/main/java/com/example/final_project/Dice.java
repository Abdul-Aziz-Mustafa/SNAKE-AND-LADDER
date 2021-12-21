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

public class Dice extends Player{
    //@by_aziz//
    Random random = new Random();

    @FXML
    private ImageView diceImage;

    @FXML
    private Button rollButton;
    @FXML
    private ImageView myCircle1;
    @FXML
    private ImageView myCircle2;


    @FXML
    protected Pane q0;
    @FXML
    protected Pane q1;
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

    class cordinates {
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

    ArrayList<cordinates> ar = new ArrayList<cordinates>();

    public void adder(Pane q) {
        ar.add(new cordinates(q.getLayoutX(), q.getLayoutY()));
    }

    public void adderL(Pane q, int lh) {
        ar.add(new cordinates(q.getLayoutX(), q.getLayoutY(), false, true, -1, lh));

    }

    public void adderS(Pane q, int st) {
        ar.add(new cordinates(q.getLayoutX(), q.getLayoutY(), false, true, -1, st));

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

    static int num;

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
                    pos1=pos1-num;

                    counter++;
                    return;
                }
                if (pos1 == 99) {
                    check2=false;
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
                    translate.setToX((ar.get(ar.get(pos1).lh)).x);
                    translate.setToY((ar.get(ar.get(pos1).lh)).y - 667);
                    translate.setDuration(Duration.millis(750));
                    pos1 = ar.get(pos1).lh;
                }
                if (ar.get(pos1).s) {
                    translate.setToX((ar.get(ar.get(pos1).st)).x);
                    translate.setToY((ar.get(ar.get(pos1).st)).y - 667);
                    translate.setDuration(Duration.millis(750));
                    pos1 = ar.get(pos1).st;

                }
                translate.setNode(myCircle1);

                translate.play();
                System.out.println(pos1 + "position\n");
                counter++;
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
                    pos2=pos2-num;
                    counter++;
                    return;
                }
                if (pos2 == 99) {
                    check1=false;
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
                    translate.setToX((ar.get(ar.get(pos2).lh)).x);
                    translate.setToY((ar.get(ar.get(pos2).lh)).y - 667);
                    translate.setDuration(Duration.millis(1000));
                    pos2 = ar.get(pos2).lh;
                }
//                if (ar.get(pos2).s) {
//                    translate.setToX((ar.get(ar.get(pos2).st)).x);
//                    translate.setToY((ar.get(ar.get(pos2).st)).y - 667);
//                    translate.setDuration(Duration.millis(1000));
//                    pos2 = ar.get(pos2).st;
//
//                }
                translate.setNode(myCircle2);

                translate.play();
                System.out.println(pos2 + "position\n");
                counter++;
            } else {
                counter++;

                return;
            }


        }


    }


    @FXML
    void roll(ActionEvent event) {


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
