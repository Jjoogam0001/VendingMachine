package sample.Data;

import sample.Model.Drinks;
import sample.Model.Food;
import sample.Model.OfficeProducts;

import java.util.Arrays;

public class FoodItems {


    public static Food [] foods = new Food[4];

    static {
        foods[0] = new Food("Humberger",ProductSequence.nextProductId(),90,"Edible","12:12:2020","Fast Food");
        foods[1] = new Food("HotDog",ProductSequence.nextProductId(),70,"Edible","12:11:2020","Street Food");
        foods[2] = new Food("ChineseBox",ProductSequence.nextProductId(),50,"Edible","12:11:2010","Street Food");
        foods[3] = new Food("Pizza Pan",ProductSequence.nextProductId(),90,"Edible","12:12:2017","Fast Food");
    }



    public int size(){
        return foods.length;
    }

    public String getFoods(){
        for (int i = 0; i< foods.length; i++){
            return Arrays.toString(new Food[]{foods[i]});
        }
        return null;
    }

    public Food findbyId(int id){
        Food Fd = null;
        for (int i = 0; i < size(); i++){
            if (foods[i] .getId() == id ){
                Fd = foods[i];
                break;
            }
        }
        return Fd;
    }
}
