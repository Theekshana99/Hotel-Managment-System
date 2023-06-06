package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class RoomsActionFormController {
    public AnchorPane RoomsContext;
    public JFXComboBox combType;
   

    private static ArrayList<String>RoomType=new ArrayList<>();

    static{
         RoomType.add("Single Rooms");
         RoomType.add("Double Rooms");
         RoomType.add("Triple Rooms");
         RoomType.add("Quad Rooms");
    }

    public JFXComboBox comboType;
    public JFXComboBox comboo;

    public void initialize(){
        ObservableList<String> obList= FXCollections.observableArrayList();
        for (String temp:RoomType
        ) {
            obList.add(temp);
        }
        combType.setItems(obList);

    }


}
