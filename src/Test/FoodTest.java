package Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sample.Data.ProductSequence;
import sample.Model.Drinks;
import sample.Model.Food;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FoodTest {


    private Food foods;




    @Before
  public  void testObject(){

      foods = new Food("Burger", ProductSequence.nextProductId(),90,"Edible","12:12:2020","Fast Food");

  }



    @Test
    public void getExpiryDate() {
      String expected = "12:12:2020";
      String actual = foods.getExpiryDate();
      Assert.assertEquals(expected,actual);
    }

    @Test
    public void getDescription() {
        String expected = "Fast Food";
        String actual = foods.getDescription();
        Assert.assertEquals(expected,actual);

    }

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
    public void endSession() {

    }

    @Test
    public void testGetDescription() {
    }

    @Test
    public void getBalance() {
    }

    @Test
    public void getProducts() {

    }

    @Test
    public void examine() {
    }
}