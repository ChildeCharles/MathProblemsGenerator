package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import java.io.IOException;

public class ControllerMainWindow {

    static String problem;
   @FXML private ComboBox<String> problemType;
    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }
    public void setProblemType(ActionEvent actionEvent) {
        this.problem = problemType.getValue();
    }

    public void goToSolvingWindow(ActionEvent actionEvent) throws IOException {
        Stage solvingStage = new Stage();
        SolvingWindow solvingWindow = new SolvingWindow();
        try {
            solvingWindow.start(solvingStage);
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}


