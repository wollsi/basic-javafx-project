import java.io.IOException;
import javafx.fxml.FXML;

/**
 * This controller is more minimalistic as the {@link PrimaryController}. Therefor more content in the fxml file.
 */
public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        Main.setRoot("primary");
    }
}