package sample.Model;

import sample.interfaces.VendingMachine;

public class OfficeProducts extends Product implements VendingMachine {

    private String Manufacturer;
    private String Description;

    public OfficeProducts(String name, int id, int price, String use, String manufacturer, String description) {
        super(name, id, price, use);
        Manufacturer = manufacturer;
        Description = description;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public String getDescription() {
        return Description;
    }

    @Override
    public void addCurrency(int Amount) {

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
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
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
