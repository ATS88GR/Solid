package Solid;

public abstract class HotDog {
  double[] ingredients = new double[10];
  int cost;
  public void setBread(double bread) {
    ingredients[0] = bread;
  }
  public void setSausage(double sausage) {
    ingredients[1] = sausage;
  }
  public void setOnion(double onion) {
    ingredients[2] = onion;
  }
  public void setMayonnaise(double mayonnaise) {
    ingredients[3] = mayonnaise;
  }
  public void setMustard(double mustard) {
    ingredients[4] = mustard;
  }
  public void setKetchup(double ketchup) {
    ingredients[5] = ketchup;
  }
  public void setTopping1(double topping1) {
    ingredients[6] = topping1;
  }
  public void setTopping2(double topping2) {
    ingredients[7] = topping2;
  }
  public void setTopping3(double topping3) {
    ingredients[8] = topping3;
  }
  public void setTopping4(double topping4) {
    ingredients[9] = topping4;
  }
  public void setCost(int cost) {
    this.cost = cost;
  }

  public HotDog(double bread, double sausage, double onion, double mayonnaise, double mustard, double ketchup, double topping1, double topping2, double topping3, double topping4, int cost) {
    ingredients[0] = bread;
    ingredients[1] = sausage;
    ingredients[2] = onion;
    ingredients[3] = mayonnaise;
    ingredients[4] = mustard;
    ingredients[5] = ketchup;
    ingredients[6] = topping1;
    ingredients[7] = topping2;
    ingredients[8] = topping3;
    ingredients[9] = topping4;
    this.cost = cost;
  }
  public HotDog(){}

  public void makeHotDog(){
    Storage.storage.put(Ingredients.BREAD,Storage.storage.get(Ingredients.BREAD) - ingredients[0]);
    Storage.storage.put(Ingredients.SAUSAGE,Storage.storage.get(Ingredients.SAUSAGE) - ingredients[1]);
    Storage.storage.put(Ingredients.ONION,Storage.storage.get(Ingredients.ONION) - ingredients[2]);
    Storage.storage.put(Ingredients.MAYONNAISE,Storage.storage.get(Ingredients.MAYONNAISE) - ingredients[3]);
    Storage.storage.put(Ingredients.MUSTARD,Storage.storage.get(Ingredients.MUSTARD) - ingredients[4]);
    Storage.storage.put(Ingredients.KETCHUP,Storage.storage.get(Ingredients.KETCHUP) - ingredients[5]);
    Storage.storage.put(Ingredients.TOPPING1,Storage.storage.get(Ingredients.TOPPING1) - ingredients[6]);
    Storage.storage.put(Ingredients.TOPPING2,Storage.storage.get(Ingredients.TOPPING2) - ingredients[7]);
    Storage.storage.put(Ingredients.TOPPING3,Storage.storage.get(Ingredients.TOPPING3) - ingredients[8]);
    Storage.storage.put(Ingredients.TOPPING4,Storage.storage.get(Ingredients.TOPPING4) - ingredients[9]);
  }
  abstract void showAndWrite();

}
