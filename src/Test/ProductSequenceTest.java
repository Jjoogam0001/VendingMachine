package Test;

import org.junit.Assert;
import org.junit.Test;
import sample.Data.ProductSequence;


public class ProductSequenceTest {


    @Test
    public void nextProductId() {
        int expected = 13;
        int actual = ProductSequence.nextProductId();
        Assert.assertEquals(expected,actual);
    }
}