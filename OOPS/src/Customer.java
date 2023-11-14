import java.util.Scanner;

public class Customer {
    public String fullName;
    public int age;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        customer.fullName = scanner.nextLine();
        customer.age = scanner.nextInt();

        System.out.println(customer.fullName);
        System.out.println(customer.age);
    }
}
