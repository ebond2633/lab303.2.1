public class CafeOrder {
    public static void main(String[] args) {
        // Product prices (in dollars)
        double coffeePrice = 2.50;
        double cappuccinoPrice = 3.00;
        double greenTeaPrice = 2.20;

        // Order quantities
        int coffeeQuantity = 3;
        int cappuccinoQuantity = 4;
        int greenTeaQuantity = 2;

        // Calculate subtotal
        double subtotal = (coffeePrice * coffeeQuantity) +
                (cappuccinoPrice * cappuccinoQuantity) +
                (greenTeaPrice * greenTeaQuantity);

        // Sales tax rate (assumed 8%)
        final double SALES_TAX_RATE = 0.08;
        double salesTax = subtotal * SALES_TAX_RATE;

        // Calculate total sale amount
        double totalSale = subtotal + salesTax;

        // Format results to two decimal places
        String formattedSubtotal = String.format("%.2f", subtotal);
        String formattedTotalSale = String.format("%.2f", totalSale);

        // Display results
        System.out.println("Subtotal: $" + formattedSubtotal);
        System.out.println("Sales Tax: $" + salesTax);
        System.out.println("Total Sale: $" + formattedTotalSale);
    }
}
