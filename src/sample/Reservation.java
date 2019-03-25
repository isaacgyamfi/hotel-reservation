package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/* TODO: Get the email of the user from the Login class to display on the reservation page */
/* TODO: When the user logs in to the reservation page, the image the user uploaded to the sign up page should display */

public class Reservation extends Main implements Initializable {

    public Label username;
    public Label user_email;
    public Label user_phone;
    public Hyperlink contact_mgt;
    public ComboBox cityComboBox;
    public ComboBox roomComboBox;
    public ComboBox priceComboBox;
    public ToggleGroup hotelRideRadioBtnToggle;

    // Display email from the Login class in the label "user_email"
    Login login = new Login();

    // Enable user to make changes to profile
    public void handleChangProfile(ActionEvent actionEvent) {
    }

//    Enable user to log out of account
    public void handleLogout(ActionEvent actionEvent) {

    }

//    Enable user to filter the hotel listings using the specified data
    public void handleFilter(ActionEvent actionEvent) {
        hotelRideRadioBtnToggle.getSelectedToggle();
    }

    public void handleCityComboBox(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // get the values from Login to display in reservation
        user_email.setText(DataUtils.getLastEmail());
    }
}

