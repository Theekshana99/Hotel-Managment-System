package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Guest;
import view.tm.GuestTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class AddNewGuestFormController {
    public AnchorPane AddNewGuestContext;

    public TableColumn colID;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colNIC;
    public TableColumn colGender;
    public TableColumn colCity;
    public TableColumn colCountry;
    public TableColumn colTelephone;
    public TableColumn colEmail;
    public TableColumn colWorkPlace;
    public TableColumn colAddressWork;

    static ArrayList<Guest> GuestList =new ArrayList();
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public JFXTextField txtNIC;
    public JFXTextField txtCity;
    public JFXTextField txtCountry;
    public JFXTextField txtTelephone;
    public JFXTextField txtMail;
    public JFXTextField txtWorkPlace;

    public JFXTextField txtId;
    public JFXTextField txtGender;
    public TableView tblGuest;
    public TableColumn colCheckDate;
    public TableColumn colCheckOut;
    public JFXTextField txtCheckOut;
    public JFXTextField txtCheckIn;


    public void initialize(){
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colNIC.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        colCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        colCountry.setCellValueFactory(new PropertyValueFactory<>("country"));
        colTelephone.setCellValueFactory(new PropertyValueFactory<>("telephone"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colWorkPlace.setCellValueFactory(new PropertyValueFactory<>("workPlace"));
        colCheckDate.setCellValueFactory(new PropertyValueFactory<>("checkInDate"));
        colCheckOut.setCellValueFactory(new PropertyValueFactory<>("checkOutDate"));
    }
    public void SaveGuestOnAction(ActionEvent actionEvent) {
        Guest guest=new Guest(txtId.getText(),txtName.getText(),txtAddress.getText(),txtNIC.getText(),txtGender.getText(),txtCity.getText(),txtCountry.getText()
                ,txtTelephone.getText(),txtMail.getText(),txtWorkPlace.getText(),txtCheckIn.getText(),txtCheckOut.getText());

        if (GuestList.add(guest)) {
            // alert-> save
            loadAllStudents();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            //alert -> try again
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
    }
    public void loadAllStudents(){
        ObservableList<GuestTM> tmObservableList = FXCollections.observableArrayList();
        for (Guest temp:GuestList
             ) {
            tmObservableList.add(
                    new GuestTM(temp.getId(),temp.getName(),temp.getAddress(),temp.getNic(),temp.getGender(),temp.getCity(),temp.getCountry(),temp.getTelephone(),temp.getEmail(),temp.getWorkPlace(),temp.getCheckInDate(),temp.getCheckOutDate())
            );
        }
        tblGuest.setItems(tmObservableList);
    }
}
