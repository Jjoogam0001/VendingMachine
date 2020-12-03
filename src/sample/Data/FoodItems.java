package sample.Data;

import sample.Model.Drinks;
import sample.Model.Food;
import sample.Model.OfficeProducts;

import java.util.Arrays;

public class FoodItems {


    public static Food [] foods = new Food[4];

    static {
        foods[0] = new Food("Burger",90,"Edible","12:12:2020","Fast Food");
        foods[1] = new Food("HotDog",70,"Edible","12:11:2020","Street Food");
        foods[2] = new Food("ChiBox",50,"Edible","12:11:2010","Street Food");
        foods[3] = new Food("Pizza",90,"Edible","12:12:2017","Fast Food");
    }



    public int size(){
        return foods.length;
    }


}
