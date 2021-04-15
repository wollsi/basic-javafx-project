import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * This controller is more complex and handles some view logic. Therefore the fxml file is smaller.
 */
public class PrimaryController {

    private static String PRIMARY_LABEL_TEXT = "Primary View";

    @FXML
    private Button primaryButton;

    @FXML
    private Label primaryLabel;

    private String primaryButtonText;

    /**
     * Constructs this controller for the primary view
     */
    public PrimaryController() {
        primaryButtonText = "Go to secondary view";
    }

    /**
     * Will be called after this controller is constructed and the scene is loaded
     */
    public void initialize() {
        primaryButton.setText(primaryButtonText);
        primaryButton.setOnAction(event -> {
            try {
                switchToSecondary();
            } catch (IOException e) {
                e.printStackTrace();
                // Here an error message could be printed
            }
        });
        primaryLabel.setText(PRIMARY_LABEL_TEXT);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        Main.setRoot("secondary");
    }
}
