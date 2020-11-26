package Test;

import org.junit.Assert;
import org.junit.Test;
import sample.Data.DrinkItems;
import sample.Model.Drinks;

import java.util.Arrays;

public class DrinkItemsTest {
   DrinkItems drinkItems = new DrinkItems();


    @Test
    public void size() {
        int expected = DrinkItems.drinks.length;
        int actual = drinkItems.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getDrinks() {
      String expected = Arrays.toString(DrinkItems.drinks);
      String actual = drinkItems.getDrinks();
      Assert.assertEquals(expected,actual);

    }

    @Test
    public void findbyId() {

    }
}