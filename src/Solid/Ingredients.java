package Solid;

public enum Ingredients {
    BREAD(1),
    SAUSAGE(2),
    ONION(1),
    MAYONNAISE(1),
    MUSTARD(1),
    KETCHUP(1),
    TOPPING1(1),
    TOPPING2(1),
    TOPPING3(1),
    TOPPING4(1);
    private final int cost;

    Ingredients(int cost) {
        this.cost = cost;
    }
    public int getCost(){return cost;}
}
