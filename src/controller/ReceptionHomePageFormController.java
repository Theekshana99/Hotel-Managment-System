package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class
ReceptionHomePageFormController {
    public AnchorPane ReceptionHomeContext;
    public AnchorPane AnchorpaneReceptionContext;

    public void GoDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionMainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)ReceptionHomeContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void GoNewGuestOnActionss(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddNewGuestForm.fxml");
        Parent load = FXMLLoader.load(resource);
        AnchorpaneReceptionContext.getChildren().clear();
        AnchorpaneReceptionContext.getChildren().add(load);

    }

    public void GoMealsPlanOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/OrderMealForm.fxml");
        Parent load = FXMLLoader.load(resource);
        AnchorpaneReceptionContext.getChildren().clear();
        AnchorpaneReceptionContext.getChildren().add(load);
    }

    public void GoRoomAvailabilityOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomAvailabilityForm.fxml");
        Parent load = FXMLLoader.load(resource);
        AnchorpaneReceptionContext.getChildren().clear();
        AnchorpaneReceptionContext.getChildren().add(load);
    }

    public void GoPaymentOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PaymentForm.fxml");
        Parent load = FXMLLoader.load(resource);
        AnchorpaneReceptionContext.getChildren().clear();
        AnchorpaneReceptionContext.getChildren().add(load);
    }
}
