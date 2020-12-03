package sample.Model;

import sample.Data.DrinkItems;
import sample.Data.FoodItems;
import sample.interfaces.VendingMachine;

import java.util.Arrays;

public class Food extends Product implements VendingMachine {

    private String ExpiryDate;
    private String Description;




    public Food(String name, int price, String use, String expiryDate, String description) {
        super(name, price, use);
        ExpiryDate = expiryDate;
        Description = description;
    }

    public Food() {

    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public String getDescription() {
        return Description;
    }



    @Override
    public Product request(int ProductNumber) {

        for (int i = 0; i < FoodItems.foods.length; i++){
            if (FoodItems.foods[i].id == ProductNumber){
                return FoodItems.foods[i];
            }
        }

        return null;
    }



    @Override
    public String getDescription(String productName) {
        for (int i = 0; i < FoodItems.foods.length; i++){
            if (FoodItems.foods[i].getName().equals(productName)){
                return FoodItems.foods[i].getDescription();
            }
        }

        return null;

    }

    @Override
    public String getProducts() {
        return Arrays.toString(FoodItems.foods);
    }

    @Override
    public String examine() {
        return super.examine();
    }
}
