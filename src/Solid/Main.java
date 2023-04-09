package Solid;

import Solid.HotDogs.HotDogFactory;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static HotDogFactory factory = new HotDogFactory();

    public static void main(String[] args) {
        /*System.out.print("Please, load ingredients:\nBread: ");
        Solid.Storage.storage.put(Solid.Ingredients.BREAD, Double.valueOf(sc.nextLine()));
        System.            out.print("Sausages: ");
        Solid.Storage.storage.put(Solid.Ingredients.SAUSAGE, Double.valueOf(sc.nextLine()));
        System.out.print("Onions: ");
        Solid.Storage.storage.put(Solid.Ingredients.ONION, Double.valueOf(sc.nextLine()));
        System.out.print("Mayonnaise: ");
        Solid.Storage.storage.put(Solid.Ingredients.MAYONNAISE, Double.valueOf(sc.nextLine()));
        System.out.print("Mustard: ");
        Solid.Storage.storage.put(Solid.Ingredients.MUSTARD, Double.valueOf(sc.nextLine()));
        System.out.print("Ketchup: ");
        Solid.Storage.storage.put(Solid.Ingredients.KETCHUP, Double.valueOf(sc.nextLine()));
        System.out.print("Topping1: ");
        Solid.Storage.storage.put(Solid.Ingredients.TOPPING1, Double.valueOf(sc.nextLine()));
        System.out.print("Topping 2: ");
        Solid.Storage.storage.put(Solid.Ingredients.TOPPING2, Double.valueOf(sc.nextLine()));
        System.out.print("Topping 3: ");
        Solid.Storage.storage.put(Solid.Ingredients.TOPPING3, Double.valueOf(sc.nextLine()));
        System.out.print("Topping 4: ");
        Solid.Storage.storage.put(Solid.Ingredients.TOPPING4, Double.valueOf(sc.nextLine()));
        System.out.println();*/
        new Storage(10,10,10, 500, 500, 500,
                500, 500, 500, 500);
        chooseAction();
    }

    private static void chooseAction() {
        int chooseAct = 0;   //int for saving choose
        do {
            try {
                System.out.println("""
                        Select the number of actions:
                        1. Order processing.
                        2. Close the cashier for today.
                        3. Upload base of orders to file.
                        4. Show accounting report.
                        5.
                        6.
                        7.
                        8. Exit.
                        """);
                if (sc.hasNextLine()) {
                    chooseAct = Integer.parseInt(sc.nextLine());
                    if (chooseAct != 8) {
                        actions(chooseAct);
                    } else System.out.println("Exit the program");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
            while (chooseAct!=8);
    }

    private static void actions(int chooseAct) {
        switch (chooseAct) {
            case 1 -> {new Order().menu();}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            default -> System.out.println("You choose number without action");
        }
    }

}
