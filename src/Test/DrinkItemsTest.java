package Test;

import org.junit.Assert;
import org.junit.Test;
import sample.Data.DrinkItems;
import sample.Model.Drinks;

public class DrinkItemsTest {
   DrinkItems drinkItems = new DrinkItems();


    @Test
    public void size() {
        int expected = 4;
        int actual = drinkItems.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getDrinks() {
        Drinks[] expected = DrinkItems.drinks;
        Drinks [] actual = drinkItems.getDrinks();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void findbyId() {
    }
}