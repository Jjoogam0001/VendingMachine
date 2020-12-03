package Test.data;

import org.junit.Assert;
import org.junit.Test;

import sample.Data.OfficeItems;



public class OfficeItemsTest {
    OfficeItems officeItems = new OfficeItems();

    @Test
    public void size() {
        int expected = OfficeItems.officeProducts.length;
        int actual = officeItems.size();
        Assert.assertEquals(expected,actual);
    }



}