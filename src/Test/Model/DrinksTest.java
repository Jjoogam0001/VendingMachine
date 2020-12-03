package Test.Model;

import org.junit.Before;
import org.junit.Test;
import sample.Data.DrinkItems;
import sample.Model.Drinks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class DrinksTest {
    Drinks drks = new Drinks();


    @Test
    public void getExpiryDate() {
        String expected = "11:11:2020";
        String actual = DrinkItems.drinks[0].getExpiryDate();
        assertEquals(expected,actual);
    }

    @Test
    public void getDescription() {
        String expected = "Cola";
        String actual = DrinkItems.drinks[0].getDescription();
        assertEquals(expected,actual);
    }

    @Test
    public void request() {
        Drinks expected = DrinkItems.drinks[1];
        Drinks actual = (Drinks) drks.request(DrinkItems.drinks[1].getId());
        assertEquals(expected,actual);
    }



    @Test
    public void getProducts() {
        String expected = Arrays.toString(DrinkItems.drinks);
        String actual = drks.getProducts();
        assertEquals(expected,actual);

    }

    @Test
    public void examine() {
        String expected ="Product{" +
                "Name='" + DrinkItems.drinks[0].getName() + '\'' +
                ", id=" + DrinkItems.drinks[0].getId() +
                ", Price=" + DrinkItems.drinks[0].getPrice() +
                '}';

        String actual = DrinkItems.drinks[0].examine();
        assertEquals(expected,actual);

    }

    @Test
    public void testGetDescription() {
        String expected = "Cola";
        String name = DrinkItems.drinks[0].getName();
        String actual = drks.getDescription(name);
        assertEquals(expected,actual);
    }
}