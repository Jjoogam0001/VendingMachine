package sample.interfaces;

import sample.Model.Product;

public interface VendingMachine {


   default int addCurrency(int [] Amount){
       int sum = 0;

       for (int i = 0; i < Amount.length; ++i)
       {
           sum += Amount[i];
       }
       System.out.println(sum);


       return sum;
    }
    Product request(int ProductNumber);
    int endSession();
    String getDescription(int productName);



    default int getBalance(int Cashpool, int Amount){
        if (Cashpool > Amount || Cashpool == Amount){
            return Cashpool - Amount;
        }

        return 0;
    }
    String [] getProducts();



}
