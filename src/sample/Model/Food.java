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
    public int addCurrency(int [] Amount) {

        int sum = 0;

        for (int i = 0; i < Amount.length; ++i)
        {
            sum += Amount[i];
        }
        System.out.println(sum);


        return sum;
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
    public int getBalance(int Cashpool, int Amount) {
        if (Cashpool > Amount || Cashpool == Amount){
            return Cashpool - Amount;
        }

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
