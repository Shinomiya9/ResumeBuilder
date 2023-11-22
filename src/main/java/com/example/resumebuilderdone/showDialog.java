package com.example.resumebuilderdone;
import javafx.scene.control.Alert;
import java.util.Optional;
public class showDialog {
    Alert a = new Alert(Alert.AlertType.NONE);
    String filepath;

    public void showDialog() {
        // set alert type
        a.setAlertType(Alert.AlertType.INFORMATION);
        //set title
        a.setTitle("Help");
        //set context/message
        a.setContentText("This is a resume builder");
        // show dialog
        a.show();
    }
    public void showErrorGen() {
        //set alert type
        a.setAlertType(Alert.AlertType.ERROR);
        //set title
        a.setTitle("Error");
        //set context/message
        a.setContentText("PLEASE ENTER ALL DETAILS TO GENERATE CV");
        //show dialog
        a.show();
    }

    public void showConfirmation() {
        // set alert type
        a.setAlertType(Alert.AlertType.INFORMATION);
        //set Title
        a.setTitle("Success");
        //set context/message
        a.setContentText("PDF generated successfully");
        // show the dialog
        a.show();
    }

    public void showSave() {
        // set alert type
        a.setAlertType(Alert.AlertType.INFORMATION);
        //set Title
        a.setTitle("Success");
        //set context/message
        a.setContentText("Data saved to file successfully");
        // show the dialog
        a.show();

    }

    public void showClear() {
        // set alert type
        a.setAlertType(Alert.AlertType.INFORMATION);
        //set Title
        a.setTitle("Success");
        //set context/message
        a.setContentText("Data cleared");
        // show the dialog
        a.show();

    }
    public void showErrorSave() {
        //set alert type
        a.setAlertType(Alert.AlertType.ERROR);
        //set title
        a.setTitle("Error");
        //set context/message
        a.setContentText("PLEASE ENTER ALL DETAILS TO SAVE CV");
        //show dialog
        a.show();
    }

    public void showLoad() {
        //set alert type
        a.setAlertType(Alert.AlertType.INFORMATION);
        //set title
        a.setTitle("Success");
        //set context/message
        a.setContentText("File loaded sucessfully");
        //show dialog
        a.show();
    }

}