import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class Main extends Application {

    private static Scene activeScene;

    @Override
    public void start(Stage stage) throws IOException {
        activeScene = new Scene(loadFXML("primary"));

        // loading the style sheet
        activeScene.getStylesheets().add(Main.class.getResource("styles.css").toExternalForm());

        // set the scene onto the stage
        stage.setScene(activeScene);

        // and now show it
        stage.show();
    }

    /**
     * Sets the root {@link Parent} of the current active scene.
     *
     * @param fxml the name of the fxml file to load as root
     * @throws IOException if the file cannot be found
     */
    static void setRoot(String fxml) throws IOException {
        activeScene.setRoot(loadFXML(fxml));
    }

    /**
     * Loads a fxml file.
     *
     * @param fxml the name of the fxml file to load
     * @return The {@link Parent} object with the loaded fxml definition
     * @throws IOException if the fxml file is not found
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}