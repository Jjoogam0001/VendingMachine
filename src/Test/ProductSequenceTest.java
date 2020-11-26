package Test;

import org.junit.Assert;
import org.junit.Test;
import sample.Data.ProductSequence;

import static org.junit.Assert.*;

public class ProductSequenceTest {


    @Test
    public void nextProductId() {
        int expected = 1;
        int actual = ProductSequence.nextProductId();
        Assert.assertEquals(expected,actual);
    }
}