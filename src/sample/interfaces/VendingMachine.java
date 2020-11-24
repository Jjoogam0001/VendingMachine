package sample.interfaces;

import sample.Model.Product;

public interface VendingMachine {


    void addCurrency(int Amount);
    Product request(int ProductNumber);
    int endSession();
    String getDescription(int productName);
    int getBalance();
    String [] getProducts();



}
