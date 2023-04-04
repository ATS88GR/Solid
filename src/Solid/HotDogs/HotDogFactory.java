package Solid.HotDogs;

public class HotDogFactory {
    public HotDog getHotDog(HotDogRecipe recipe){
        HotDog toReturn;
        switch (recipe){
            case LITE -> toReturn = new LiteHotDog(1,1,0.1,0.1,0.1,0.1,0.1,0,0,0,100);
            case MEDIUM -> toReturn = new MediumHotDog(1,1,0.15,0.15,0.15,0.15,0,0.1,0.1,0,120);
            case HARD -> toReturn = new HardHotDog(1,1,0.2,0.2,0.2,0.2,0.1,0.1,0.1,0.1,140);
            case BUYER -> toReturn = new BuyerHotDog();
            default -> throw new IllegalArgumentException("Wrong Hot Dog type:" + recipe);
        }
        return toReturn;
    }
}
