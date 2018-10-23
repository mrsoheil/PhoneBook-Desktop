package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.InputEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.io.PrintWriter;

public class Controller {
    @FXML
    private TableView tblshow;
    @FXML
    TableColumn tc_name;
    @FXML
    TableColumn tc_family;
    @FXML
    TableColumn tc_number;
    @FXML
    TableColumn tc_type;



    //Close Program
    public void exit() {
        System.exit(0);
    }




    public void btn_createPerson() {
        try {
            Parent parent =FXMLLoader.load(getClass().getResource("register.fxml"));
            Stage registerStage =new Stage();
            registerStage.setScene(new Scene(parent));
            registerStage.initStyle(StageStyle.UNDECORATED);
            registerStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btn_showAll() {
        try {
            Parent parentShowAll =FXMLLoader.load(getClass().getResource("showAll.fxml"));
            Stage showAllStage =new Stage();
            showAllStage.setScene(new Scene(parentShowAll));
            showAllStage.initStyle(StageStyle.UNDECORATED);
            showAllStage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}

