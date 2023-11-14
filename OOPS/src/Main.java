// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int initialValue = 1;
        int days = 90; // You can change this to calculate values for more days

        int currentValue = initialValue;
        for (int day = 1; day <= days; day++) {
            System.out.println("Day " + day + ": " + currentValue);
            currentValue *= 2; // Multiply by 2 to get the value for the next day
        }
    }
}
