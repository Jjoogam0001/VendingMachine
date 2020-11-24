package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;
import sample.Data.DrinkItems;
import sample.Data.FoodItems;
import sample.Data.OfficeItems;
import sample.Model.Drinks;
import sample.Model.Product;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

   @FXML
   ListView itemList ;
   @FXML
   Label priceTag;
   @FXML
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

         //Populate Items from dfft categories into ListView
        for (int i = 0; i < DrinkItems.drinks.length;i++){
            itemList.getItems().add(DrinkItems.drinks[i].getDescription() + ":   "+DrinkItems.drinks[i].getPrice()+ " Kr");
        }

        for (int i = 0; i < FoodItems.foods.length; i++){
            itemList.getItems().add(FoodItems.foods[i].getName()+ ":   "+FoodItems.foods[i].getPrice()+ " Kr");
        }

        for (int i = 0; i < OfficeItems.officeProducts.length; i++){
            itemList.getItems().add(OfficeItems.officeProducts[i].getName()+ ":   "+OfficeItems.officeProducts[i].getPrice()+ " Kr");
            itemList.getSelectionModel().select(i);
        }

                  // Get selected Item from list
        itemList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
               String selectedItem = (String) itemList.getSelectionModel().getSelectedItem();
               priceTag.setText(selectedItem);

                for (int i = 0; i < DrinkItems.drinks.length; i++){
                   

                }

            }
        });













        button1.setText((Dominations.Domination1.getValue()) + "Kr");
        button2.setText((Dominations.Domination2.getValue()) + "Kr");
        button3.setText((Dominations.Domination3.getValue()) + "Kr");
        button4.setText((Dominations.Domination4.getValue()) + "Kr");
        button5.setText((Dominations.Domination5.getValue()) + "Kr");
        button6.setText((Dominations.Domination6.getValue()) + "Kr");
        button7.setText((Dominations.Domination7.getValue()) + "Kr");
        button8.setText((Dominations.Domination8.getValue()) + "Kr");
        button9.setText((Dominations.Domination9.getValue()) + "Kr");
        button10.setText((Dominations.Domination10.getValue()) +"Kr");


        itemList.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

            }
        });


    }


}
