package Solid;

import Solid.HotDogs.HotDog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class BaseOrders {

    private static final HashMap<Integer, ArrayList<HotDog>> baseOrders = new HashMap<>();

    private static Integer orderNumber = 0;

    public static HashMap<Integer, ArrayList<HotDog>> getBaseOrders() {
        return baseOrders;
    }

    public static Integer getOrderNumber() {
        return orderNumber;
    }

    public static void setOrderNumber(Integer orderNumber) {
        BaseOrders.orderNumber = orderNumber;
    }
}
