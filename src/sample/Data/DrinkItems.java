package sample.Data;

import sample.Model.Drinks;

public class DrinkItems {

    public static Drinks[] drinks = new Drinks[4];

    static {
        drinks[0] = new Drinks("Soda",ProductSequence.nextProductId(),15,"drink","11:11:2020","CocaCola");
        drinks[1] = new Drinks("Yoghurt",ProductSequence.nextProductId(),25,"Drink","15:08:2022","Yogi");
        drinks[2] = new Drinks("Juice",ProductSequence.nextProductId(),50,"Soft drink","11:09:2011","Samka");
        drinks[3] = new Drinks("Coffee",ProductSequence.nextProductId(),90,"Breakfast","11:11:2019","Swedish Coffee");
    }



    public int size(){
        return drinks.length;
    }

    public Drinks[] getDrinks(){
        for (int i = 0; i< drinks.length;i++){
            return drinks;
        }
        return null;
    }

    public Drinks findbyId(int id){
        Drinks drk = null;
        for (int i = 0; i < size(); i++){
            if (drinks[i] .getId() == id ){
                drk = drinks[i];
                break;
            }
       }
        return drk;
    }

}
