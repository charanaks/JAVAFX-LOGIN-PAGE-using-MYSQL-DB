package com.example.javafxlogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.sql.SQLException;

public class Controller {

    @FXML
    TextField username;
    @FXML
    TextField password1;
    @FXML
    Button loginButton;

    public void loginAction() throws SQLException {

        Window owner = loginButton.getScene().getWindow();

        System.out.println(username.getText());
        System.out.println(password1.getText());
        if (username.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter your name");
            return;
        }

        if (password1.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter your email id");
            return;
        }
        String username1 = username.getText();
        String password2 = password1.getText();


        Entity entity = new Entity();
        entity.insertRecord(username1, password2);

        showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!", "Welcome " + username.getText());
    }
    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
}