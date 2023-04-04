package Solid;

import Solid.HotDogs.HotDog;
import Solid.HotDogs.HotDogRecipe;

import java.util.HashMap;
import java.util.Scanner;

public class Orders {
    private static final HashMap<HotDogRecipe, Integer> hotDogOrder = new HashMap<>();
    private static final Scanner sc = Main.sc;

    public static void order(){

    }

    public static void menu() {
        int chooseRecipe;
        int countBuy;
        double discount = 0;
        System.out.println("Would you like make order? (y/n)");
        if (sc.nextLine().equalsIgnoreCase("y")) {
    loop:   do {
                System.out.println("""
                        Which recipe of hot dog you choose?
                        1. Lite.
                        2. Medium.
                        3. Hard.
                        4. Buyer recipe.
                        5. Exit
                        """);
                chooseRecipe = Integer.parseInt(sc.nextLine());
                System.out.println("How many?");
                countBuy = Integer.parseInt(sc.nextLine());
                switch (chooseRecipe){
                    case 1 ->{hotDogOrder.put(HotDogRecipe.LITE, hotDogOrder.get(HotDogRecipe.LITE) + countBuy);}
                    case 2 ->{hotDogOrder.put(HotDogRecipe.MEDIUM,hotDogOrder.get(HotDogRecipe.MEDIUM) + countBuy);}
                    case 3 ->{hotDogOrder.put(HotDogRecipe.HARD,hotDogOrder.get(HotDogRecipe.HARD) + countBuy);}
                    case 4 ->{hotDogOrder.put(HotDogRecipe.BUYER,hotDogOrder.get(HotDogRecipe.BUYER) + countBuy);}
                    case 5 ->{break loop;}
                }
                if (countBuy > 14) discount = 0.15;
                else if (countBuy > 7) discount = 0.1;
                else if (countBuy > 2) discount = 0.05;
                System.out.println("How many hot dogs you want buy?");
            }while (chooseRecipe>=5);
        }

    }
}
