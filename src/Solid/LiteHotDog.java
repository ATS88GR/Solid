package Solid;

import java.io.FileWriter;
import java.io.IOException;

public class LiteHotDog extends HotDog {

    public LiteHotDog(double bread, double sausage, double onion, double mayonnaise, double mustard, double ketchup, double topping1, double topping2, double topping3, double topping4, int cost) {
        super(bread, sausage, onion, mayonnaise, mustard, ketchup, topping1, topping2, topping3, topping4, cost);

    }

    @Override
    public void showAndWrite() {
    String info = "You ordered Lite Hot Dog, cost " + cost + " USD";
        System.out.println(info);
        try (FileWriter fw = new FileWriter("C:\\Users\\Старшая Академия\\IdeaProjects\\Solid\\OrderedHotDog.txt", false)){
            fw.write(info);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
