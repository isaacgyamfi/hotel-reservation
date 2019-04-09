package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("My Day App");
        primaryStage.setScene(new Scene(root, 320, 470));
        primaryStage.setResizable(false);
        primaryStage.show();



        // TODO: close login window when sign up is opened
    }


    public static void main(String[] args) {
        launch(args);
    }
}










