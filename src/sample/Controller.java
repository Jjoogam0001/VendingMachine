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
import sample.Data.DrinkItems;
import sample.Data.FoodItems;
import sample.Data.OfficeItems;
import sample.Model.Drinks;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller implements Initializable {
    int price = 0;
    private int [] costs = {0};
    int CashPool = 0;


   @FXML
   ListView itemList ;
   @FXML
   Label priceTag;
   @FXML
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
   @FXML
   Button Addbutton;
   @FXML
   Label TotalAmount,BalanceLabel;



    @Override
    public void initialize(URL location, ResourceBundle resources) {



         //Populate Items from Dfft categories into ListView
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
               Addbutton.setOnMouseClicked(new EventHandler<MouseEvent>() {
                   @Override
                   public void handle(MouseEvent event) {
                       System.out.println(selectedItem);
                       // We extract price int from the selected item
                       Pattern p = Pattern.compile("\\d+");
                       Matcher m = p.matcher(selectedItem);
                       while(m.find()) {
                          price  = Integer.parseInt(m.group());
                           System.out.println(price);

                       }
                       // Add all costS OF SELECTED ITEMS into an array and return Amount
                       costs = Arrays.copyOf(costs, costs.length + 1);
                       costs[costs.length - 1] = price;
                       System.out.println(Arrays.toString(costs));
                        //Call the addCurrency Method from Drinks Class
                       Drinks drinks = new Drinks();
                       // Display The total amount on the Label
                       TotalAmount.setText(String.valueOf(drinks.addCurrency(costs)));


                   }


               });


                button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        CashPool = Dominations.Domination1.getValue();
                        Drinks drinks = new Drinks();
                        System.out.println(drinks.getBalance(CashPool, drinks.addCurrency(costs)));
                        BalanceLabel.setText(String.valueOf(drinks.getBalance(CashPool, drinks.addCurrency(costs))));
                        if (drinks.getBalance(CashPool, drinks.addCurrency(costs)) == 0){
                            BalanceLabel.setText("Midges Ej ");
                        }

                    }
                });
                button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        CashPool = Dominations.Domination2.getValue();
                        Drinks drinks = new Drinks();
                        System.out.println(drinks.getBalance(CashPool, drinks.addCurrency(costs)));
                        BalanceLabel.setText(String.valueOf(drinks.getBalance(CashPool, drinks.addCurrency(costs))));
                        if (drinks.getBalance(CashPool, drinks.addCurrency(costs)) == 0){
                            BalanceLabel.setText("Midges Ej ");
                        }

                    }
                });
                button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        CashPool = Dominations.Domination3.getValue();
                        Drinks drinks = new Drinks();
                        System.out.println(drinks.getBalance(CashPool, drinks.addCurrency(costs)));
                        BalanceLabel.setText(String.valueOf(drinks.getBalance(CashPool, drinks.addCurrency(costs))));
                        if (drinks.getBalance(CashPool, drinks.addCurrency(costs)) == 0){
                            BalanceLabel.setText("Midges Ej ");
                        }

                    }
                });
                button4.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        CashPool = Dominations.Domination4.getValue();
                        Drinks drinks = new Drinks();
                        System.out.println(drinks.getBalance(CashPool, drinks.addCurrency(costs)));
                        BalanceLabel.setText(String.valueOf(drinks.getBalance(CashPool, drinks.addCurrency(costs))));
                        if (drinks.getBalance(CashPool, drinks.addCurrency(costs)) == 0){
                            BalanceLabel.setText("Midges Ej ");
                        }

                    }
                });
                button5.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        CashPool = Dominations.Domination5.getValue();
                        Drinks drinks = new Drinks();
                        System.out.println(drinks.getBalance(CashPool, drinks.addCurrency(costs)));
                        BalanceLabel.setText(String.valueOf(drinks.getBalance(CashPool, drinks.addCurrency(costs))));
                        if (drinks.getBalance(CashPool, drinks.addCurrency(costs)) == 0){
                            BalanceLabel.setText("Midges Ej ");
                        }

                    }
                });
                button6.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        CashPool = Dominations.Domination6.getValue();
                        Drinks drinks = new Drinks();
                        System.out.println(drinks.getBalance(CashPool, drinks.addCurrency(costs)));
                        BalanceLabel.setText(String.valueOf(drinks.getBalance(CashPool, drinks.addCurrency(costs))));
                        if (drinks.getBalance(CashPool, drinks.addCurrency(costs)) == 0){
                            BalanceLabel.setText("Midges Ej ");
                        }


                    }
                });
                button7.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        CashPool = Dominations.Domination7.getValue();
                        System.out.println(CashPool);
                        Drinks drinks = new Drinks();
                        System.out.println(drinks.getBalance(CashPool, drinks.addCurrency(costs)));
                        BalanceLabel.setText(String.valueOf(drinks.getBalance(CashPool, drinks.addCurrency(costs))));
                        if (drinks.getBalance(CashPool, drinks.addCurrency(costs)) == 0){
                            BalanceLabel.setText("Midges Ej ");
                        }

                    }
                });
                button8.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        CashPool = Dominations.Domination8.getValue();
                        System.out.println(CashPool);
                        Drinks drinks = new Drinks();
                        System.out.println(drinks.getBalance(CashPool, drinks.addCurrency(costs)));
                        BalanceLabel.setText(String.valueOf(drinks.getBalance(CashPool, drinks.addCurrency(costs))));
                        if (drinks.getBalance(CashPool, drinks.addCurrency(costs)) == 0){
                            BalanceLabel.setText("Midges Ej ");
                        }

                    }
                });
                button9.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        CashPool = Dominations.Domination9.getValue();
                        System.out.println(CashPool);
                        Drinks drinks = new Drinks();
                        System.out.println(drinks.getBalance(CashPool, drinks.addCurrency(costs)));
                        BalanceLabel.setText(String.valueOf(drinks.getBalance(CashPool, drinks.addCurrency(costs))));
                        if (drinks.getBalance(CashPool, drinks.addCurrency(costs)) == 0){
                            BalanceLabel.setText("Midges Ej ");
                        }

                    }
                });
                button10.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        CashPool = Dominations.Domination10.getValue();
                        System.out.println(CashPool);
                        Drinks drinks = new Drinks();
                        System.out.println(drinks.getBalance(CashPool, drinks.addCurrency(costs)));
                        BalanceLabel.setText(String.valueOf(drinks.getBalance(CashPool, drinks.addCurrency(costs))));
                        if (drinks.getBalance(CashPool, drinks.addCurrency(costs)) == 0){
                            BalanceLabel.setText("Midges Ej ");
                        }
                    }
                });







            }
        });





























    }



}
