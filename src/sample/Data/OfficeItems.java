package sample.Data;

import sample.Model.Drinks;
import sample.Model.OfficeProducts;

import java.util.Arrays;

public class OfficeItems {

    public static OfficeProducts [] officeProducts = new OfficeProducts[4];

    static {
        officeProducts[0] = new OfficeProducts("Pen",ProductSequence.nextProductId(),15,"Office","Bic","Stationery");
        officeProducts[1] = new OfficeProducts("Pencil",ProductSequence.nextProductId(),10,"Office","Visa","Stationery");
        officeProducts[2] = new OfficeProducts("Book",ProductSequence.nextProductId(),20,"Office","Ericsson","Stationery");
        officeProducts[3] = new OfficeProducts("SNotes",ProductSequence.nextProductId(),10,"Office","Bic","Stationery");
    }



    public int size(){
        return officeProducts.length;
    }

    public String getOfficeProducts(){
      if (officeProducts != null){
          return Arrays.toString(officeProducts);
      }
        return null;
    }

    public OfficeProducts findbyId(int id){
        OfficeProducts officeProducts = null;
        for (int i = 0; i < size(); i++){
            if (OfficeItems.officeProducts[i] .getId() == id ){
                officeProducts = OfficeItems.officeProducts[i];
                break;
            }
        }
        return officeProducts;
    }
}
