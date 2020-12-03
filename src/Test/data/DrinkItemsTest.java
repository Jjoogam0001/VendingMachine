package Test.data;

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


}