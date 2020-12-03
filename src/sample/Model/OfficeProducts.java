package sample.Model;

import sample.Data.DrinkItems;
import sample.Data.OfficeItems;
import sample.interfaces.VendingMachine;

import java.util.Arrays;

public class OfficeProducts extends Product implements VendingMachine {

    private String Manufacturer;
    private String Description;

    public OfficeProducts(String name, int price, String use, String manufacturer, String description) {
        super(name, price, use);
        Manufacturer = manufacturer;
        Description = description;
    }
 public OfficeProducts(){

 }


    public String getManufacturer() {
        return Manufacturer;
    }

    public String getDescription() {
        return Description;
    }



    @Override
    public Product request(int ProductNumber) {

        for (int i = 0; i < OfficeItems.officeProducts.length; i++){
            if (OfficeItems.officeProducts[i].id == ProductNumber){
                return OfficeItems.officeProducts[i];
            }
        }

           return null;

    }


    @Override
    public String getDescription(String productName) {
        for (int i = 0; i < OfficeItems.officeProducts.length; i++){
            if (OfficeItems.officeProducts[i].getName().equals(productName)){
                return OfficeItems.officeProducts[i].getDescription();
            }
        }

        return null;
    }

    @Override
    public String getProducts() {
        return Arrays.toString(OfficeItems.officeProducts);
    }

    @Override
    public String examine() {
        return super.examine();
    }


}
