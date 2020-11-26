package sample.interfaces;

import sample.Model.Product;

public interface VendingMachine {


    int addCurrency(int [] Amount);
    Product request(int ProductNumber);
    int endSession();
    String getDescription(int productName);
    int getBalance(int Cashpool, int Amount);
    String [] getProducts();



}
