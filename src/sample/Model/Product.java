package sample.Model;

import sample.Data.ProductSequence;

public abstract class Product {
    String Name;
    final int id;
    int Price;
    String Use;



    public Product(String name, int price, String use) {
        Name = name;
        this.id = ProductSequence.nextProductId();
        Price = price;
        Use = use;
    }

    public Product() {

        id = 0;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return Price;
    }



    public String examine(){
        return "Product{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", Price=" + Price +
                '}';
    }

    public String use(){
        return "Usage { "+ Use + "}";
    }
}
