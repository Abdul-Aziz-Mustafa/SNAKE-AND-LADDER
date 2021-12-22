package com.example.final_project;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class Board extends Dice{
    @FXML
    protected Pane q0;
    @FXML
    protected Pane q1;
    @FXML
    protected Pane q2;
    @FXML
    protected Pane q3;
    @FXML
    protected Pane q4;
    @FXML
    protected Pane q5;
    @FXML
    protected Pane q6;
    @FXML
    protected Pane q7;
    @FXML
    protected Pane q8;
    @FXML
    protected Pane q9;
    @FXML
    protected Pane q10;
    @FXML
    protected Pane q11;
    @FXML

    protected Pane q12;
    @FXML

    protected Pane  q13;
    @FXML

    protected  Pane q14;
    @FXML

    protected Pane q15;
    @FXML

    protected  Pane q16;
    @FXML

    protected  Pane q17;
    @FXML

    protected  Pane q18;
    @FXML

    protected Pane q19;
    @FXML

    protected Pane q20;
    @FXML

    protected Pane q21;
    @FXML

    protected Pane q22;
    @FXML

    protected Pane q23;
    @FXML

    protected Pane q24;
    @FXML

    protected Pane q25;
    @FXML

    protected Pane q26;
    @FXML

    protected Pane q27;
    @FXML

    protected Pane q28;
    @FXML

    protected Pane q29;
    @FXML

    protected Pane q30;
    @FXML

    protected Pane q31;
    @FXML

    protected Pane q32;
    @FXML

    protected Pane q33;
    @FXML

    protected Pane q34;
    @FXML

    protected Pane q35;
    @FXML

    protected Pane q36;
    @FXML

    protected Pane q37;
    @FXML

    protected Pane q38;
    @FXML

    protected Pane q39;
    @FXML

    protected Pane q40;
    @FXML

    protected Pane q41;
    @FXML

    protected Pane q42;
    @FXML

    protected Pane q43;
    @FXML

    protected Pane q44;
    @FXML

    protected Pane q45;
    @FXML

    protected Pane q46;
    @FXML

    protected Pane q47;
    @FXML

    protected Pane q48;
    @FXML

    protected Pane q49;
    @FXML

    protected Pane q50;
    @FXML

    protected Pane q51;
    @FXML

    protected Pane q52;
    @FXML

    protected Pane q53;
    @FXML

    protected Pane q54;
    @FXML

    protected Pane q55;
    @FXML

    protected Pane q56;
    @FXML

    protected Pane q57;
    @FXML
    protected Pane q58;
    @FXML

    protected Pane q59;
    @FXML

    protected Pane q60;
    @FXML

    protected Pane q61;
    @FXML

    protected Pane q62;
    @FXML

    protected Pane q63;
    @FXML

    protected Pane q64;
    @FXML

    protected Pane q65;
    @FXML

    protected Pane q66;
    @FXML

    protected Pane q67;
    @FXML

    protected Pane q68;
    @FXML

    protected Pane q69;
    @FXML

    protected Pane q70;
    @FXML

    protected Pane q71;
    @FXML

    protected Pane q72;
    @FXML

    protected Pane q73;
    @FXML

    protected Pane q74;
    @FXML

    protected Pane q75;
    @FXML

    protected Pane q76;
    @FXML

    protected Pane q77;
    @FXML

    protected Pane q78;
    @FXML

    protected Pane q79;
    @FXML

    protected Pane q80;
    @FXML

    protected Pane q81;
    @FXML

    protected Pane q82;
    @FXML

    protected Pane q83;
    @FXML

    protected Pane q84;
    @FXML

    protected Pane q85;
    @FXML

    protected Pane q86;
    @FXML

    protected Pane q87;
    @FXML

    protected Pane q88;
    @FXML

    protected Pane q89;
    @FXML

    protected Pane q90;
    @FXML

    protected Pane q91;
    @FXML

    protected Pane q92;
    @FXML

    protected Pane q93;
    @FXML

    protected Pane q94;
    @FXML

    protected Pane q95;
    @FXML

    protected Pane q96;
    @FXML

    protected Pane q97;
    @FXML

    protected Pane q98;
    @FXML

    protected Pane q99;


    ArrayList<Controller.cordinates> ar = new ArrayList<Controller.cordinates>();

    public void adder(Pane q) {
        ar.add(new Controller.cordinates(q.getLayoutX(), q.getLayoutY()));
    }

    public void adderL(Pane q, int lh) {
        ar.add(new Controller.cordinates(q.getLayoutX(), q.getLayoutY(), false, true, -1, lh));

    }

    public void adderS(Pane q, int st) {
        ar.add(new Controller.cordinates(q.getLayoutX(), q.getLayoutY(), false, true, -1, st));

    }
}

