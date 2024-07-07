public class twoInt {
    public static void main(String[] args) {
        // Declare integer variables x and y
        int x = 5;
        int y = 6;

        // Declare a variable q and assign y/x to it
        double q = (double) y / x;

        // Print the value of q
        System.out.println("q = " + q);

        // Cast y to a double and assign it to q
        q = (double) y;

        // Print q again
        System.out.println("q (after casting y to double) = " + q);
    }
}
