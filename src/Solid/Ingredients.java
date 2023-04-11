package Solid;

public enum Ingredients {
    BREAD(0.2),
    SAUSAGE(0.4),
    ONION(0.1),
    MAYONNAISE(0.02),
    MUSTARD(0.02),
    KETCHUP(0.02),
    TOPPING1(0.01),
    TOPPING2(0.01),
    TOPPING3(0.01),
    TOPPING4(0.01);
    private final double ingredientCost;
    Ingredients(double cost) {
        this.ingredientCost = cost;
    }
    public double getIngredientCost(){return ingredientCost;}
}
