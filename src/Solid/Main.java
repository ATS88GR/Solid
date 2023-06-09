package Solid;

import Solid.HotDogs.HotDog;
import Solid.HotDogs.HotDogFactory;
import Solid.HotDogs.HotDogRecipe;

public class Main {
    public static void main(String[] args) {
        new Storage(20,20,10, 10000, 1000, 10000,
                50000, 50000, 50000, 50000);

        HotDogFactory factory = new HotDogFactory();

        HotDog lite = factory.getHotDog(HotDogRecipe.LITE);

        lite.makeHotDog();
        lite.showAndWrite();
        Storage.showInfo();
    }


}
