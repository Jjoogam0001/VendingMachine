package sample.Model;

import sample.Data.DrinkItems;

import sample.interfaces.VendingMachine;

import java.util.Arrays;

public class Drinks extends Product implements VendingMachine {

   private String ExpiryDate;
   private String Description;




    public Drinks(String name, int price, String use, String expiryDate, String description) {
        super(name, price, use);
        ExpiryDate = expiryDate;
        Description = description;
    }

    public Drinks() {
        super();
    }


    public String getExpiryDate() {
        return ExpiryDate;
    }

    public String getDescription() {
        return Description;
    }


    @Override
    public Product request(int ProductNumber) {
        for (int i = 0; i < DrinkItems.drinks.length; i++){
            if (DrinkItems.drinks[i].id == ProductNumber){
                return DrinkItems.drinks[i];
            }
        }

        return null;
    }



    @Override
    public String getDescription(String productName) {
        for (int i = 0; i < DrinkItems.drinks.length; i++){
            if (DrinkItems.drinks[i].getName().equals(productName)){
                return DrinkItems.drinks[i].getDescription() ;
            }
        }

        return null;
    }

    @Override
    public String getProducts() {
        return Arrays.toString(DrinkItems.drinks);
    }


    @Override
    public String examine() {
        return super.examine();
    }


}
