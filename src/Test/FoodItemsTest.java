package Test;

import org.junit.Assert;
import org.junit.Test;
import sample.Data.DrinkItems;
import sample.Data.FoodItems;
import sample.Model.Drinks;
import sample.Model.Food;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FoodItemsTest {
    FoodItems foodItems = new FoodItems();

    @Test
    public void size() {
        int expected = FoodItems.foods.length;
        int actual = foodItems.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFoods() {
        String expected = Arrays.toString(FoodItems.foods);
        String actual = foodItems.getFoods();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findbyId() {
    }
}