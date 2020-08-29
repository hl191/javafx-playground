package ch.at.home;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ApplicationExtension.class)
public class MainTest {

    @Start
    private void start(Stage stage) throws Exception {
        System.out.println("Starting Test ...");
        new Main().start(stage);
    }

    @Test
    void shouldContainButtonWithText(FxRobot robot) {
        Button button = robot.lookup("#andGoButton").queryAs(Button.class);
        assertEquals("And ... go", button.getText());
    }

    @Test
    void clickOnButtonTriggersAlert(FxRobot robot) {
        robot.clickOn("#textArea");
        robot.write("asdf");
        robot.clickOn("#andGoButton");

        assertEquals("Informationtext: asdf", robot.lookup(".dialog-pane").queryAs(DialogPane.class).getContentText());

        robot.clickOn(ButtonType.OK.getText());
    }
}