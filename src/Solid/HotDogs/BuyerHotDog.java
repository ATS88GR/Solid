package Solid.HotDogs;

import Solid.Ingredients;
import Solid.Storage;

import java.util.Map;
import java.util.Scanner;

public class BuyerHotDog extends HotDog {
    @Override
    public void makeHotDog() {
        setBread(1);
        setSausage(1);
        Scanner sc = new Scanner(System.in);
        System.out.println("How much onion, mg?");
        setOnion(Double.parseDouble((sc.nextLine())));
        System.out.println("How much mayonnaise, ml?");
        setMayonnaise(Double.parseDouble(sc.nextLine()));
        System.out.println("How much mustard, mg?");
        setMustard(Double.parseDouble(sc.nextLine()));
        System.out.println("How much ketchup, mg?");
        setKetchup(Double.parseDouble(sc.nextLine()));
        System.out.println("How much topping #1, ml?");
        setTopping1(Double.parseDouble(sc.nextLine()));
        System.out.println("How much topping #2, ml?");
        setTopping2(Double.parseDouble(sc.nextLine()));
        System.out.println("How much topping #3, ml?");
        setTopping3(Double.parseDouble(sc.nextLine()));
        System.out.println("How much topping #4, ml?");
        setTopping4(Double.parseDouble(sc.nextLine()));
        setCost(1.5);
        for (Map.Entry<Ingredients,Double> item: getIngredientsOfHotDog().entrySet())
            Storage.storage.put(item.getKey(), Storage.storage.get(item.getKey()) - item.getValue());
        showAndWrite();
    }
}
