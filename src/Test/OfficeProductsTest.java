package Test;

import org.junit.Assert;
import org.junit.Before;
import sample.Data.ProductSequence;
import sample.Model.OfficeProducts;

import static org.junit.Assert.*;

public class OfficeProductsTest {
    OfficeProducts officeProducts;

    @Before
    public void testObject(){
       officeProducts = new OfficeProducts("Pencil", ProductSequence.nextProductId(),100,"Office","BIC","WRITING");
    }


    @org.junit.Test
    public void getManufacturer() {
        String expected = "BIC";
        String actual = officeProducts.getManufacturer();
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getDescription() {
        String expected = "WRITING";
        String actual = officeProducts.getDescription();
        Assert.assertEquals(expected,actual);

    }

    @org.junit.Test
    public void addCurrency() {

    }

    @org.junit.Test
    public void request() {
    }

    @org.junit.Test
    public void endSession() {
    }

    @org.junit.Test
    public void testGetDescription() {
    }

    @org.junit.Test
    public void getBalance() {
    }

    @org.junit.Test
    public void getProducts() {
    }

    @org.junit.Test
    public void examine() {
    }
}