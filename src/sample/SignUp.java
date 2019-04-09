package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import java.sql.*;

public class SignUp {
    public TextField surname;
    public TextField other_names;
    public ComboBox<String> gender;
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
    public CheckBox tnChchecked;


    public SignUp() {
    }

    // Event to handle new account request
    public void handleCreateBtn(ActionEvent actionEvent) throws SQLException {
        initializeDB();
        try {
            Login login = new Login();
            login.openReservation();
        } catch (Exception es) {
            System.out.println(es);
        }
//        System.out.println(dob.getValue());
    }

    public void initializeDB() throws SQLException {
            // Linking the sign up page to the database
            try {

                String user = "myuser";
                String url = "jdbc:mysql://localhost:3306/reservationapp";
                String password = "ghana";

                Connection conn = DriverManager.getConnection(url, user, password);
                String sql = "insert into maindb(surname, other_names, gender, dob, email, " +
                        "home_address, phone, other_phone, emerg_pers_name, emerg_pers_rel, emerg_phone, emerg_pers_email, pwd) " +
                        "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, surname.getText().toLowerCase());
                statement.setString(2, other_names.getText().toLowerCase());
                statement.setString(3, gender.getValue().toLowerCase());
                statement.setString(4, dob.getValue().toString());
                statement.setString(5, su_email.getText().toLowerCase());
                statement.setString(6, home_address.getText());
                statement.setString(7, phone.getText());
                statement.setString(8, other_phone.getText().toLowerCase());
                statement.setString(9, emerg_name.getText().toLowerCase());
                statement.setString(10, emerg_person.getText().toLowerCase());
                statement.setString(11, emerg_phone.getText());
                statement.setString(12, emerg_email.getText());
                statement.setString(13, su_pwd.getText());
                statement.executeUpdate();

            }
            catch (Exception es) {
                es.printStackTrace();
            }
        System.out.println("db submitted");
    }

    // Event to handle return to login request
    public void handleReturnLogin(MouseEvent mouseEvent) {
        /* Allow user to return to login page when text is clicked */
    }
}
