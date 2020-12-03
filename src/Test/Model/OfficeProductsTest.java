package Test.Model;

import org.junit.Test;
import sample.Data.FoodItems;
import sample.Data.OfficeItems;
import sample.Model.Food;
import sample.Model.OfficeProducts;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class OfficeProductsTest {

    OfficeProducts officeProducts = new OfficeProducts();


    @Test
    public void getManufacturer() {
        String expected = "Bic";
        String actual = OfficeItems.officeProducts[0].getManufacturer();
        assertEquals(expected,actual);
    }

    @Test
    public void getDescription() {
        String expected = "Stationery";
        String actual = OfficeItems.officeProducts[0].getDescription();
        assertEquals(expected,actual);
    }

    @Test
    public void request() {
        OfficeProducts expected = OfficeItems.officeProducts[1];
        OfficeProducts actual = (OfficeProducts) officeProducts.request(OfficeItems.officeProducts[1].getId());
        assertEquals(expected,actual);
    }


    @Test
    public void getProducts() {
        String expected = Arrays.toString(OfficeItems.officeProducts);
        String actual = officeProducts.getProducts();
        assertEquals(expected,actual);

    }

    @Test
    public void examine() {
        String expected ="Product{" +
                "Name='" + OfficeItems.officeProducts[0].getName() + '\'' +
                ", id=" + OfficeItems.officeProducts[0].getId() +
                ", Price=" + OfficeItems.officeProducts[0].getPrice() +
                '}';

        String actual =OfficeItems.officeProducts[0].examine();
        assertEquals(expected,actual);

    }

    @Test
    public void testGetDescription() {
        String expected = "Stationery";
        String name = OfficeItems.officeProducts[0].getName();
        String actual = officeProducts.getDescription(name);
        assertEquals(expected,actual);
    }
}