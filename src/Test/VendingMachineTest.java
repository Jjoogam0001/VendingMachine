package Test;

import org.junit.Assert;
import org.junit.Test;
import sample.Model.Food;


public class VendingMachineTest {

    @Test
    public void addCurrency() {
        int [] costs = {90,30,45,60};
        int expected = 225;
        Food fd = new Food();
        int actual = fd.addCurrency(costs);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void request() {


    }


    @Test
    public void getBalance() {

    }


}