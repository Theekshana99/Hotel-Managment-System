package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminHomePageFormController {
    public AnchorPane AdminHomeContext;
    public AnchorPane Contextone;

    public void GoRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomsActionForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Contextone.getChildren().clear();
        Contextone.getChildren().add(load);
    }

    public void GoMealOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Contextone.getChildren().clear();
        Contextone.getChildren().add(load);
    }

    public void GoIncomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/IncomeReportsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Contextone.getChildren().clear();
        Contextone.getChildren().add(load);
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)AdminHomeContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
