package ch.at.home;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private TextArea textArea;

    @FXML
    private Button andGoButton;

    /**
     * The constructor (is called before the initialize()-method).
     */
    public Controller() {
        System.out.println("Constructor");
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        System.out.println("Initializing GUI");

        andGoButton.setOnAction(i -> new Alert(Alert.AlertType.INFORMATION,
                                               "Informationtext: " + textArea.getText(),
                                               ButtonType.OK).showAndWait());
    }
}
