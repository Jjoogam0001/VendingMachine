package Test;

import org.junit.Assert;
import org.junit.Test;

import sample.Data.OfficeItems;

import java.util.Arrays;

public class OfficeItemsTest {
    OfficeItems officeItems = new OfficeItems();

    @Test
    public void size() {
        int expected = OfficeItems.officeProducts.length;
        int actual = officeItems.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getOfficeProducts() {
        String expected = Arrays.toString(OfficeItems.officeProducts);
        String actual = officeItems.getOfficeProducts();
        Assert.assertEquals(expected,actual);

    }

}