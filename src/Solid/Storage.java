package Solid;

import java.util.HashMap;

public class Storage {

    public static HashMap<Ingredients, Double> storage;
   /* public Storage(double bread, double sausage, double onion, double mayonnaise, double mustard, double ketchup,
                   double topping1, double topping2, double topping3, double topping4) {
        storage = new HashMap<>();
        storage.put(Ingredients.BREAD, bread);
        storage.put(Ingredients.SAUSAGE, sausage);
        storage.put(Ingredients.ONION, onion);
        storage.put(Ingredients.MAYONNAISE, mayonnaise);
        storage.put(Ingredients.MUSTARD, mustard);
        storage.put(Ingredients.KETCHUP, ketchup);
        storage.put(Ingredients.TOPPING1, topping1);
        storage.put(Ingredients.TOPPING2, topping2);
        storage.put(Ingredients.TOPPING3, topping3);
        storage.put(Ingredients.TOPPING4, topping4);
    }*/
    public static void showInfo(){
        System.out.printf("Bread %.1f; sausage %.1f; onions, kg: %.1f; mayonnaise, ml: %.1f, mustard, ml: %.1f; " +
                        "ketchup, ml: %.1f; topping #1, ml %.1f; topping #2, ml %.1f; topping #3, ml %.1f; topping #4, ml %.1f\n", storage.get(Ingredients.BREAD), storage.get(Ingredients.SAUSAGE),
                storage.get(Ingredients.ONION), storage.get(Ingredients.MAYONNAISE), storage.get(Ingredients.MUSTARD), storage.get(Ingredients.KETCHUP),
                storage.get(Ingredients.TOPPING1), storage.get(Ingredients.TOPPING2), storage.get(Ingredients.TOPPING3),
                storage.get(Ingredients.TOPPING4));
    }
}
