package sample.Data;

import sample.Main;
import sample.Model.Drinks;



public class DrinkItems {

    public static Drinks[] drinks = new Drinks[4];

    static {
        drinks[0] = new Drinks("Soda",15,"drink","11:11:2020","Cola");
        drinks[1] = new Drinks("Yoghurt",25,"Drink","15:08:2022","Yogi");
        drinks[2] = new Drinks("Juice",50,"Soft drink","11:09:2011","Samka");
        drinks[3] = new Drinks("Coffee",90,"Breakfast","11:11:2019","Coffee");
    }



    public int size(){
        return drinks.length;
    }

}
