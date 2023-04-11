package Solid;

import Solid.HotDogs.HotDog;
import Solid.HotDogs.HotDogRecipe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private final HashMap<HotDogRecipe, Integer> hotDogOrder = new HashMap<>();
    private final ArrayList <HotDog> hotDogArrayList = new ArrayList<>();

    public void menu() {
        int chooseRecipe;
        int countBuyAll = 0;
        int countBuy;
        double discount = 0;
        System.out.println("Proceed to checkout? (y/n)");
        if (Main.sc.nextLine().equalsIgnoreCase("y")) {
            System.out.println("Payment by cash or card?(cash/card)");
            String paymentType;
            do {
                paymentType = Main.sc.nextLine();
                System.out.println("Type cash or card");
            } while (!paymentType.equalsIgnoreCase("cash") && !paymentType.equalsIgnoreCase("card"));
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
                if(chooseRecipe>0&&chooseRecipe<5) {
                    System.out.println("How many hot dogs you want?");
                    countBuy = Integer.parseInt(Main.sc.nextLine());
                    countBuyAll +=countBuy;
                    //try
                    if (countBuyAll > 14) discount = 0.15;
                    else if (countBuyAll > 7) discount = 0.1;
                    else if (countBuyAll > 2) discount = 0.05;
                    switch (chooseRecipe) {
                        case 1 -> {hotDogOrder.put(HotDogRecipe.LITE, countBuy);}
                        case 2 -> {hotDogOrder.put(HotDogRecipe.MEDIUM, countBuy);}
                        case 3 -> {hotDogOrder.put(HotDogRecipe.HARD, countBuy);}
                        case 4 -> {hotDogOrder.put(HotDogRecipe.BUYER, countBuy);}
                    }
                }else break;
            }while (true);
            if (!hotDogOrder.isEmpty()) fixOrder(discount, paymentType);
        }
    }

    private void fixOrder(double discount, String paymentType) {
        for (Map.Entry<HotDogRecipe,Integer> item: hotDogOrder.entrySet()) {
            HotDog hotDog = Main.factory.getHotDog(item.getKey());
            hotDog.setNumberOfHotDogs(item.getValue());
            hotDog.setDiscount(discount);
            hotDog.setPaymentType(paymentType);
            hotDog.makeHotDog();
            hotDogArrayList.add(hotDog);
        }
        BaseOrders.setOrderNumber(BaseOrders.getOrderNumber() + 1);
        BaseOrders.getBaseOrders().put(BaseOrders.getOrderNumber(), hotDogArrayList);
        System.out.println(hotDogArrayList);
        System.out.println(BaseOrders.getBaseOrders());
    }
}
