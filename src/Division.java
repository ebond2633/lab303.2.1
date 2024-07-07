public class Division {
    public static void main(String[] args) {
        double a = 4100;
        double b = 6076;

        // Determine the larger and smaller numbers
        double larger = Math.max(a, b);
        double smaller = Math.min(a, b);

        // Calculate the result of dividing the larger by the smaller
        double result = larger / smaller;

        System.out.println("Result of dividing the larger by the smaller: " + result);
    }
}
