package Solid.HotDogs;

import Solid.Ingredients;
import Solid.Storage;

import java.io.FileWriter;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public abstract class HotDog implements Serializable {
  private final HashMap <Ingredients,Double> ingredientsOfHotDog = new HashMap<>();
  private double cost;
  private double discount;
  private int numberOfHotDogs;
  private LocalDate dateOfOrder;

  public void setBread(double bread) {
    ingredientsOfHotDog.put(Ingredients.BREAD,bread);
  }
  public void setSausage(double sausage) {
    ingredientsOfHotDog.put(Ingredients.SAUSAGE,sausage);
  }
  public void setOnion(double onion) {
    ingredientsOfHotDog.put(Ingredients.ONION,onion);
  }
  public void setMayonnaise(double mayonnaise) {
    ingredientsOfHotDog.put(Ingredients.MAYONNAISE,mayonnaise);
  }
  public void setMustard(double mustard) {
    ingredientsOfHotDog.put(Ingredients.MUSTARD,mustard);
  }
  public void setKetchup(double ketchup) {
    ingredientsOfHotDog.put(Ingredients.KETCHUP,ketchup);
  }
  public void setTopping1(double topping1) {
    ingredientsOfHotDog.put(Ingredients.TOPPING1,topping1);
  }
  public void setTopping2(double topping2) {
    ingredientsOfHotDog.put(Ingredients.TOPPING2,topping2);
  }
  public void setTopping3(double topping3) {
    ingredientsOfHotDog.put(Ingredients.TOPPING3,topping3);
  }
  public void setTopping4(double topping4) {
    ingredientsOfHotDog.put(Ingredients.TOPPING4,topping4);
  }
  public void setCost(double cost) {
    this.cost = cost;
  }
  public void setNumberOfHotDogs(int numberOfHotDogs) {
    this.numberOfHotDogs = numberOfHotDogs;
  }
  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public HotDog(double bread, double sausage, double onion, double mayonnaise, double mustard, double ketchup,
                double topping1, double topping2, double topping3, double topping4, double cost, int numberOfHotDogs,
                double discount) {
    ingredientsOfHotDog.put(Ingredients.BREAD,bread);
    ingredientsOfHotDog.put(Ingredients.SAUSAGE,sausage);
    ingredientsOfHotDog.put(Ingredients.ONION,onion);
    ingredientsOfHotDog.put(Ingredients.MAYONNAISE,mayonnaise);
    ingredientsOfHotDog.put(Ingredients.MUSTARD,mustard);
    ingredientsOfHotDog.put(Ingredients.KETCHUP,ketchup);
    ingredientsOfHotDog.put(Ingredients.TOPPING1,topping1);
    ingredientsOfHotDog.put(Ingredients.TOPPING2,topping2);
    ingredientsOfHotDog.put(Ingredients.TOPPING3,topping3);
    ingredientsOfHotDog.put(Ingredients.TOPPING4,topping4);
    this.cost = cost;
    this.numberOfHotDogs = numberOfHotDogs;
    this.discount = discount;
    dateOfOrder = LocalDate.now();
  }
  public HotDog(){
    dateOfOrder = LocalDate.now();
  }

  public void makeHotDog(){
    for (Map.Entry<Ingredients,Double> item: ingredientsOfHotDog.entrySet())
      Storage.storage.put(item.getKey(), Storage.storage.get(item.getKey()) - item.getValue());
  }
  public void showAndWrite(){   //need to separate class name
    cost *= (1-discount);
    String info = "You ordered " + numberOfHotDogs + " " + this.getClass().getSimpleName() + "s, total cost " + cost*numberOfHotDogs + " USD, discount " + discount*100 +"%\n";
    System.out.print(info);
    try (FileWriter fw = new FileWriter("C:\\Users\\user\\eclipse-workspace\\Solid\\OrderedHotDog.txt", true)){
      fw.write(info);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }



}
