package sample.Data;

public class ProductSequence {

    public static int productId;

    public static int nextProductId(){
        productId = ++productId;
        return productId;
    }
}
