package Solid;

public class Accounting {
    private static double expenses = 0;
    private static double profit = 0;
    private static double revenue = 0;
    private static double cashCount = 0;
    private static double cardCount = 0;

    public static double getExpenses() {return expenses;}
    public static void setExpenses(double expenses) {Accounting.expenses = expenses;}
    public static double getProfit() {return profit;}
    public static void setProfit(double profit) {Accounting.profit = profit;}
    public static double getRevenue() {return revenue;}
    public static void setRevenue(double revenue) {Accounting.revenue = revenue;}
    public static double getCashCount() {return cashCount;}
    public static void setCashCount(double cashCount) {Accounting.cashCount = cashCount;}
    public static double getCardCount() {return cardCount;}
    public static void setCardCount(double cardCount) {Accounting.cardCount = cardCount;}
}
