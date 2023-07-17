package nl.atjays.simplecalc;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class Main extends Application {

    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

            Group root = new Group();
            Scene scene = new Scene(root, 340, 510, Color.PURPLE);

            stage.setTitle("Simple Calculator");

            Image icon = new Image(getClass().getResourceAsStream("assets/atjaysLogo.png"));
            stage.getIcons().add(icon);

            // stage.setX(50);
            // stage.setY(50);
            stage.setFullScreen(true);
            stage.setFullScreenExitHint("try and escape");
            stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));


            stage.setScene(scene);
            stage.show();
    }
}