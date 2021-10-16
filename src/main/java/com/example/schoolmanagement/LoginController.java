package com.example.schoolmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class LoginController {

    @FXML
    TextField userName;
    @FXML
    TextField password;

    public void loginButton(ActionEvent event){
        if(userName.getText().toString().equals("michael")&&password.getText().toString().equals("123")){
            System.out.println("you are in");
        } else {
            System.out.println("failed");
        }
    }
}
