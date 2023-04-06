package Solid;

import Solid.HotDogs.HotDog;
import Solid.HotDogs.HotDogRecipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Orders {
    private final HashMap<HotDogRecipe, Integer> hotDogOrder = new HashMap<>();
    private static final ArrayList <HotDog> hotDogArrayList = new ArrayList<>();
    //private final HashSet<HotDog> hotDogOrder = new HashSet<>();
    //private static final Scanner sc = Main.sc;

    public void menu() {
        int chooseRecipe;
        int countBuyAll = 0;
        int countBuy;
        double discount = 0;
        System.out.println("Would you like make order? (y/n)");
        if (Main.sc.nextLine().equalsIgnoreCase("y")) {
    loop:   do {
                System.out.println("""
                        Which recipe of hot dog you choose?
                        1. Lite.
                        2. Medium.
                        3. Hard.
                        4. Buyer recipe.
                        5. Exit
                        """);
                chooseRecipe = Integer.parseInt(Main.sc.nextLine());
                if(chooseRecipe>=0&&chooseRecipe<=5) {
                    System.out.println("How many hot dogs you want?");
                    countBuy = Integer.parseInt(Main.sc.nextLine());
                    countBuyAll +=countBuy;
                    //try
                    if (countBuyAll > 14) discount = 0.15;
                    else if (countBuyAll > 7) discount = 0.1;
                    else if (countBuyAll > 2) discount = 0.05;
                    switch (chooseRecipe) {
                        case 1 -> {
                            hotDogOrder.put(HotDogRecipe.LITE, countBuy);
                            //hotDogOrder.add(Main.factory.getHotDog(HotDogRecipe.LITE));
                        }
                        case 2 -> {
                            hotDogOrder.put(HotDogRecipe.MEDIUM, countBuy);
                        }
                        case 3 -> {
                            hotDogOrder.put(HotDogRecipe.HARD, countBuy);
                        }
                        case 4 -> {
                            hotDogOrder.put(HotDogRecipe.BUYER, countBuy);
                        }
                        case 5 -> {
                            break loop;
                        }
                    }
                }
            }while (true);
            if (!hotDogOrder.isEmpty()) fixOrder(discount);
        }
    }

    private void fixOrder(double discount) {
        //ArrayList <HotDog> hotDogArrayList = new ArrayList<>();
        for (Map.Entry<HotDogRecipe,Integer> item: hotDogOrder.entrySet()) {
            HotDog hotDog = Main.factory.getHotDog(item.getKey());
            hotDog.setDiscount(discount);
            hotDog.makeHotDog();
            hotDog.showAndWrite();
            hotDogArrayList.add(hotDog);
        }
        BaseOrders.getBaseOrders().put(Main.date, hotDogArrayList);
    }
}
