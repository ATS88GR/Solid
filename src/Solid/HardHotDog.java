package Solid;

public class HardHotDog implements HotDog{
    private final double BREAD = 1.0;
    private final double SAUSAGE = 1.0;
    private final double ONION = 0.03;
    private final double MAYONNAISE = 0.02;
    private final double MUSTARD = 0.03;
    private final double KETCHUP = 0.03;
    private final double TOPPING1 = 0.01;
    private final double TOPPING2 = 0.01;
    private final double TOPPING3 = 0.01;
    private final double TOPPING4 = 0;
    @Override
    public void makeHotDog() {
        Storage.storage.put(Ingredients.BREAD,Storage.storage.get(Ingredients.BREAD) - BREAD);
        Storage.storage.put(Ingredients.SAUSAGE,Storage.storage.get(Ingredients.SAUSAGE) - SAUSAGE);
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
