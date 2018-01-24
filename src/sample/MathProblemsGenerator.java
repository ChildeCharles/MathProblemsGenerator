package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class MathProblemsGenerator extends Application{
    @Override
    public void start(Stage MainWindowStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ViewMainWindow.fxml"));
        Scene scene = new Scene(root);
        //CANNOT ADD ICON TO JAR
        //MainWindowStage.getIcons().add(new Image(getClass().getResourceAsStream("../Pictures/icon.jpg")));
        String css = MathProblemsGenerator.class.getResource("style.css").toExternalForm();
        scene.getStylesheets().add(css);
        MainWindowStage.setScene(scene);
        MainWindowStage.show();
        MainWindowStage.setTitle("Generator zadań matematycznych");

    }

    public static void main(String[] args) {
        launch(args);
    }
}
