package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Login extends Main{
    public TextField emailText;
    public PasswordField pwdText;
    public Text feedback;
    public Button btn_login;
    public Button btn_signup;


    //Event to handle login
    public void handleLogin(ActionEvent actionEvent) throws Exception {
        // check if the email and password exists and match

        String user = "myuser";
        String url = "jdbc:mysql://localhost:3306/reservationapp";
        String password = "ghana";
        Connection conn = DriverManager.getConnection(url, user, password);

        String email = emailText.getText();
        String pwd = pwdText.getText();
        // Condition to check the email and password input
        if (email.equals("ghana@mail.com") && pwd.equals("1234")) {
            feedback.setText("Successful...logging in");
            btn_login.setText("Logging in...");
            openReservation();

        }
        else if (email.isEmpty() && pwd.isEmpty()) {
            feedback.setText("Input fields are empty");

            // TODO: create an alert to user when fields are empty
            Alert alert = new Alert(Alert.AlertType.ERROR);
        }
        else {
            feedback.setText("Invalid credentials");
            // TODO: create an alert to user when fields are invalid
            Alert alert = new Alert(Alert.AlertType.ERROR);
        }
    }


    // ActionEvent to open signup page
    public void handleSignUp(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
            Stage signupStage = new Stage();
            signupStage.setScene(new Scene(root, 800, 680));
            signupStage.setTitle("Sign up");
//            signupStage.getIcons().add(new Image("")); // add window icon
            signupStage.setResizable(false);
            signupStage.show();

        } catch (Exception exp) {
            System.out.println("Window can not load");
        }
    }

    // open reservation when the login is successful
    public void openReservation() throws Exception {

        DataUtils.setLastEmail(emailText.getText());
        Parent reservationRoot = FXMLLoader.load(getClass().getResource("reservation.fxml"));
        Stage reservationStage = new Stage();
        reservationStage.setScene(new Scene(reservationRoot, 800, 600));
        reservationStage.setTitle("Reserve a hotel");
        reservationStage.setResizable(false);
        reservationStage.show();

    }
}
