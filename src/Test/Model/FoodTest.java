package Test.Model;

import org.junit.Test;
import sample.Data.DrinkItems;
import sample.Data.FoodItems;
import sample.Model.Drinks;
import sample.Model.Food;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class FoodTest {

    Food food = new Food();


    @Test
    public void getExpiryDate() {
        String expected = "12:12:2020";
        String actual = FoodItems.foods[0].getExpiryDate();
        assertEquals(expected,actual);
    }

    @Test
    public void getDescription() {
        String expected = "Fast Food";
        String actual = FoodItems.foods[0].getDescription();
        assertEquals(expected,actual);
    }

    @Test
    public void request() {
        Food expected = FoodItems.foods[1];
        Food actual = (Food) food.request(FoodItems.foods[1].getId());
        assertEquals(expected,actual);
    }



    @Test
    public void getProducts() {
        String expected = Arrays.toString(FoodItems.foods);
        String actual = food.getProducts();
        assertEquals(expected,actual);

    }

    @Test
    public void examine() {
        String expected ="Product{" +
                "Name='" + FoodItems.foods[0].getName() + '\'' +
                ", id=" + FoodItems.foods[0].getId() +
                ", Price=" + FoodItems.foods[0].getPrice() +
                '}';

        String actual = FoodItems.foods[0].examine();
        assertEquals(expected,actual);

    }


    @Test
    public void testGetDescription() {
        String expected = "Fast Food";
        String name = FoodItems.foods[0].getName();
        String actual = food.getDescription(name);
        assertEquals(expected,actual);
    }
}