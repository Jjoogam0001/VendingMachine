package sample.Model;

import sample.interfaces.VendingMachine;

public class Food extends Product implements VendingMachine {

    private String ExpiryDate;
    private String Description;


    public Food(){

    }

    public Food(String name, int id, int price, String use, String expiryDate, String description) {
        super(name, id, price, use);
        ExpiryDate = expiryDate;
        Description = description;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public String getDescription() {
        return Description;
    }



    @Override
    public Product request(int ProductNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productName) {
        return Name;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }

    @Override
    public String examine() {
        return super.examine();
    }
}
