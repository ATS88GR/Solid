package Solid;

import java.util.Scanner;

public class BuyerHotDog implements HotDog {
    @Override
    public void makeHotDog() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much onion, mg?");
        double ONION = Double.parseDouble((sc.nextLine()));
        System.out.println("How much mayonnaise, ml?");
        double MAYONNAISE = Double.parseDouble(sc.nextLine());
        System.out.println("How much mustard, mg?");
        double MUSTARD = Double.parseDouble(sc.nextLine());
        System.out.println("How much ketchup, mg?");
        double KETCHUP = Double.parseDouble(sc.nextLine());
        System.out.println("How much topping #1, ml?");
        double TOPPING1 = Double.parseDouble(sc.nextLine());
        System.out.println("How much topping #2, ml?");
        double TOPPING2 = Double.parseDouble(sc.nextLine());
        System.out.println("How much topping #3, ml?");
        double TOPPING3 = Double.parseDouble(sc.nextLine());
        System.out.println("How much topping #4, ml?");
        double TOPPING4 = Double.parseDouble(sc.nextLine());
        Storage.storage.put(Ingredients.BREAD,Storage.storage.get(Ingredients.BREAD) - 1);
        Storage.storage.put(Ingredients.SAUSAGE,Storage.storage.get(Ingredients.SAUSAGE) - 1);
        Storage.storage.put(Ingredients.ONION,Storage.storage.get(Ingredients.ONION) - ONION);
        Storage.storage.put(Ingredients.MAYONNAISE,Storage.storage.get(Ingredients.MAYONNAISE) - MAYONNAISE);
        Storage.storage.put(Ingredients.MUSTARD,Storage.storage.get(Ingredients.MUSTARD) - MUSTARD);
        Storage.storage.put(Ingredients.KETCHUP,Storage.storage.get(Ingredients.KETCHUP) - KETCHUP);
        Storage.storage.put(Ingredients.TOPPING1,Storage.storage.get(Ingredients.TOPPING1) - TOPPING1);
        Storage.storage.put(Ingredients.TOPPING2,Storage.storage.get(Ingredients.TOPPING2) - TOPPING2);
        Storage.storage.put(Ingredients.TOPPING3,Storage.storage.get(Ingredients.TOPPING3) - TOPPING3);
        Storage.storage.put(Ingredients.TOPPING4,Storage.storage.get(Ingredients.TOPPING4) - TOPPING4);
    }
}
