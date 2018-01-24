package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class SolvingWindow extends Application{
    Button newProblem = new Button();
    Button saveProblem = new Button();
    Button exit = new Button();
    GenerateProblem generator = new GenerateProblem();


    @Override
    public void start(Stage solvingStage) throws Exception {

        VBox layout = new VBox();
        VBox upperLayout = new VBox(20);
        HBox lowerLayout = new HBox();
        upperLayout.setPrefSize(800, 500);
        upperLayout.setAlignment(Pos.TOP_CENTER);

        VBox exerciseLayout = new VBox(10);
        exerciseLayout.setPrefSize(800,350);

        lowerLayout.setPrefSize(800, 100);
        lowerLayout.setAlignment(Pos.CENTER);
        lowerLayout.setPadding(new Insets(20));
        lowerLayout.setSpacing(10);

        layout.setPrefSize(800,600);
        layout.setPadding(new Insets(10));

        solvingStage.setTitle(ControllerMainWindow.problem);
        Label info = new Label();
            info.setText("Poniżej wygenerowano zadanie. Możesz je skopiować ręcznie lub zapisać do pliku.");
            info.setWrapText(true);
            info.setPrefSize(800,200);
        Label exerciseLabel = new Label();
            exerciseLabel.setText("Polecenie:");
            exerciseLabel.setPrefSize(800,200);
        TextArea exercise = new TextArea();
            exercise.setWrapText(true);
            exercise.setPrefSize(800,500);
            String exerciseString = generator.start(ControllerMainWindow.problem);
            exercise.setText(exerciseString);



        exerciseLayout.getChildren().addAll(exerciseLabel, exercise);
        upperLayout.getChildren().addAll(info, exerciseLayout);
        lowerLayout.getChildren().addAll(newProblem, saveProblem, exit);
        layout.getChildren().addAll(upperLayout, lowerLayout);

        newProblem.setText("Nowe zadanie");
        newProblem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String exerciseString = generator.start(ControllerMainWindow.problem);
                exercise.setText(exerciseString);
            }
        });
        saveProblem.setText("Zapisz zadanie do pliku");
        saveProblem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Wybierz plik do zapisu");
                File file = fileChooser.showSaveDialog(solvingStage);
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(exerciseString);
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Something was wrong with the file.");
                } catch (NullPointerException e){
                    System.out.println("File not chosen.");
                }

            }
        });

        exit.setText("Wyjście");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                solvingStage.close();
            }
        });


        Scene solvingScene = new Scene(layout);
        String css = MathProblemsGenerator.class.getResource("style.css").toExternalForm();
        solvingScene.getStylesheets().add(css);
        solvingStage.setScene(solvingScene);
        solvingStage.show();


        //CANNOT ADD ICON TO JAR
        //solvingStage.getIcons().add(new Image(getClass().getResourceAsStream("../Pictures/icon.jpg")));
    }
}
