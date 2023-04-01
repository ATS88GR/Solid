package Solid.HotDogs;

import java.util.Scanner;

public class BuyerHotDog extends HotDog {
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

    }

    @Override
    public void showAndWrite() {

    }
}
