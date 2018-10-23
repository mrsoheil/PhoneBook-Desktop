package sample;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.InputEvent;
import javafx.stage.Stage;

public class showAllControler {


    @FXML public void closeWindow(InputEvent e) {
        final Node source = (Node) e.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

}
