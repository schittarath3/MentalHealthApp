package com.healthhgt8.mentalhealthapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class VolunteerSignInController extends SignInController{

    @Override
    void sendInfoToDatabase() {
        super.textFieldCheck();
    }

    @FXML
    private void startVolunteerScreen(ActionEvent actionEvent) {
        sendInfoToDatabase();
    }
}