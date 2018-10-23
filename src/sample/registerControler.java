package sample;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.input.InputEvent;
import javafx.stage.Stage;

public class registerControler {

    @FXML
    ComboBox comboBoxObj = new ComboBox<>();
    public void initialize() {

        // do initialization and configuration work...

        // trivial example, could also be done directly in the fxml:
        comboBoxObj.getItems().addAll("Phone","Home","Work");

    }


    @FXML public void closeWindow(InputEvent e) {
        final Node source = (Node) e.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
