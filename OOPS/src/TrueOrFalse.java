import java.util.Scanner;

public class TrueOrFalse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int isCondition = n*m;
        System.out.println(isCondition == 150);
        scanner.close();
    }
}
