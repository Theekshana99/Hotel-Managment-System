package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminLoginFormController {
    public AnchorPane AdminContext;

    public void LogAdminPageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminHomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) AdminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void BackToDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) AdminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
