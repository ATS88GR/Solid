package Solid;

public class HotDogFactory {
    public HotDog getHotDog(HotDogRecipe recipe){
        HotDog toReturn;
        switch (recipe){
            case LITE -> toReturn = new LiteHotDog();
            case MEDIUM -> toReturn = new MediumHotDog();
            case HARD -> toReturn = new HardHotDog();
            case BUYER -> toReturn = new BuyerHotDog();
            default -> throw new IllegalArgumentException("Wrong doughnut type:" + recipe);
        }
        return toReturn;
    }
}
