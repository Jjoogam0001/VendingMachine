package Test.data;

import org.junit.Assert;
import org.junit.Test;

import sample.Data.FoodItems;


public class FoodItemsTest {
    FoodItems foodItems = new FoodItems();

    @Test
    public void size() {
        int expected = FoodItems.foods.length;
        int actual = foodItems.size();
        Assert.assertEquals(expected,actual);
    }


}