package sample.Model;

public abstract class Product {
    String Name;
    final int id;
    int Price;
    String Use;


    public Product(){

        id = 0;
    }
    public Product(String name, int id, int price, String use) {
        Name = name;
        this.id = id;
        Price = price;
        Use = use;
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
