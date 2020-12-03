package sample.Data;

import sample.Model.Drinks;
import sample.Model.OfficeProducts;

import java.util.Arrays;

public class OfficeItems {

    public static OfficeProducts [] officeProducts = new OfficeProducts[4];

    static {
        officeProducts[0] = new OfficeProducts("Pen",15,"Office","Bic","Stationery");
        officeProducts[1] = new OfficeProducts("Pencil",10,"Office","Visa","Stationery");
        officeProducts[2] = new OfficeProducts("Book",20,"Office","Ericsson","Stationery");
        officeProducts[3] = new OfficeProducts("SNotes",10,"Office","Bic","Stationery");
    }



    public int size(){
        return officeProducts.length;
    }













}
