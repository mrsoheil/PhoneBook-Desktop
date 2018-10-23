package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    public double x, y;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
        primaryStage.setScene(new Scene(root, 415, 448));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        //Move stage
        root.setOnMousePressed(event -> {
            x = event.getX();
            y = event.getY();
        });
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);
        });
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
