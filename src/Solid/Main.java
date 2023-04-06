package Solid;

import Solid.HotDogs.HotDog;
import Solid.HotDogs.HotDogFactory;
import Solid.HotDogs.HotDogRecipe;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static HotDogFactory factory = new HotDogFactory();
    static LocalDate date;
    public static void main(String[] args) {
        /*System.out.print("Please, load ingredients:\nBread: ");
        Storage.storage.put(Ingredients.BREAD, sc.nextDouble());
        System.out.print("\nSausages: ");
        Storage.storage.put(Ingredients.SAUSAGE, sc.nextDouble());
        System.out.print("\nOnions: ");
        Storage.storage.put(Ingredients.ONION, sc.nextDouble());
        System.out.print("\nMayonnaise: ");
        Storage.storage.put(Ingredients.MAYONNAISE, sc.nextDouble());
        System.out.print("\nMustard: ");
        Storage.storage.put(Ingredients.MUSTARD, sc.nextDouble());
        System.out.print("\nMustard: ");
        Storage.storage.put(Ingredients.KETCHUP, sc.nextDouble());
        System.out.print("\nKetchup: ");
        Storage.storage.put(Ingredients.TOPPING1, sc.nextDouble());
        System.out.print("\nTopping 2: ");
        Storage.storage.put(Ingredients.TOPPING2, sc.nextDouble());
        System.out.print("\nTopping 3: ");
        Storage.storage.put(Ingredients.TOPPING3, sc.nextDouble());
        System.out.print("\nTopping 4");
        Storage.storage.put(Ingredients.TOPPING4, sc.nextDouble());
        System.out.println();*/
        new Storage(20,20,10, 10000, 1000, 10000,
                50000, 50000, 50000, 50000);
        /*System.out.println("Open a cashier?(y/n)");
        if (sc.nextLine().equalsIgnoreCase("y")){
            Orders.menu();
        }*/
        chooseAction();
        /*HotDog lite = factory.getHotDog(HotDogRecipe.LITE);
        lite.makeHotDog();
        lite.showAndWrite();
        Storage.showInfo();*/
    }

    private static void chooseAction() {
        int chooseAct = 0;   //int for saving choose
        do {
            try {
                System.out.println("""
                        Select the number of actions:
                        1. Open the cashier for today
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
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
            while (chooseAct!=8);
    }

    private static void actions(int chooseAct) {
        switch (chooseAct) {
            case 1 -> {
                new Orders().menu();
                date = LocalDate.now();
            }
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {System.out.println("Exit the program");}
            default -> System.out.println("You choose number without action");
        }
    }


}
