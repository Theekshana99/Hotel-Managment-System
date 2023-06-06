package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionLoginFormController {
    public AnchorPane ReceptionLoginContext;


    public void GoReceptionLoginOnAction(ActionEvent actionEvent) throws IOException {
            URL resource = getClass().getResource("../view/ReceptionMainForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) ReceptionLoginContext.getScene().getWindow();
            window.setScene(new Scene(load));

    }

    public void BackToDashOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)ReceptionLoginContext.getScene().getWindow();
        window.setScene(new Scene(load));

    }
}
