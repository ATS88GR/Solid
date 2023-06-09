package Solid.HotDogs;

import java.io.FileWriter;

public class LiteHotDog extends HotDog {

    public LiteHotDog(double bread, double sausage, double onion, double mayonnaise, double mustard, double ketchup,
                      double topping1, double topping2, double topping3, double topping4, double cost) {
        super(bread, sausage, onion, mayonnaise, mustard, ketchup, topping1, topping2, topping3, topping4, cost);

    }

    @Override
    public void showAndWrite() {
    String info = "You ordered Lite Hot Dog, cost " + cost + " USD";
        System.out.println(info);
        try (FileWriter fw = new FileWriter("C:\\Users\\user\\eclipse-workspace\\Solid\\OrderedHotDog.txt", false)){
            fw.write(info);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
