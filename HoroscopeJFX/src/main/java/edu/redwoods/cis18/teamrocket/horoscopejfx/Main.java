package edu.redwoods.cis18.teamrocket.horoscopejfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        /*
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(
                        getClass().getResource("mainView.fxml")));
         */
        Parent root = FXMLLoader.load(getClass().getResource("mainView.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}