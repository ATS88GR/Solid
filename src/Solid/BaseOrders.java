package Solid;

import Solid.HotDogs.HotDog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class BaseOrders {

    private static HashMap<LocalDate, ArrayList<HotDog>> baseOrders = new HashMap<>();

    public static void menu (){

    }

    public static HashMap<LocalDate, ArrayList<HotDog>> getBaseOrders() {
        return baseOrders;
    }

    public static void setBaseOrders(HashMap<LocalDate, ArrayList<HotDog>> baseOrders) {
        BaseOrders.baseOrders = baseOrders;
    }
}
