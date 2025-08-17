
package ex05_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";

        // parallel array of prices
        double itemPrices[];
        itemPrices = new double[4];
        itemPrices[0] = 19.99;
        itemPrices[1] = 9.99;
        itemPrices[2] = 14.99;
        itemPrices[3] = 29.99;

        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        // Iterate through and print out the items and their prices
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " costs $" + itemPrices[i]);
        }
    }
}
