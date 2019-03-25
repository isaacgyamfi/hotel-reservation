package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class SignUp {
    public TextField surname;
    public TextField other_names;
    public ComboBox gender;
    public DatePicker dob;
    public TextField su_email;
    public TextArea home_address;
    public TextField phone;
    public TextField other_phone;
    public TextField emerg_name;
    public TextField emerg_phone;
    public TextField emerg_email;
    public TextField emerg_person;
    public PasswordField su_pwd;
    public Button create_acc_btn;
    public Label return_login;

    // Event to handle new account request
    public void handleCreateBtn(ActionEvent actionEvent) {
        create_acc_btn.setText("Creating new account");
        /* if the any of the fields are empty, do not allow the user the create account */
    }

    // Event to handle return to login request
    public void handleReturnLogin(MouseEvent mouseEvent) {
        /* Allow user to return to login page when text is clicked */
    }
}
