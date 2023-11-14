import java.util.Scanner;

public class LinearSearch {
    public static Scanner scanner = new Scanner(System.in);
    public static final int SEARCH_ELEMENT = scanner.nextInt();
    public static final int n = scanner.nextInt();
    public static int[] arr;
    public static boolean status = false;
    public static void implementationOfLinearSearch(){
        insertValues();
        printValues();
        searchValue();
    }

    private static void searchValue() {
        for(int i=0;i<n;i++){
            if(arr[i] == LinearSearch.SEARCH_ELEMENT){
                status=true;
                System.out.println("VALUE FOUND AT INDEX: " + i);
            }
        }
        if(!status){
            System.out.println("VALUE NOT FOUNT");
        }
    }

    private static void printValues() {
        for(int i=0;i<n;i++){
            System.out.println("Value at index " + i + " is: " + arr[i]);
        }
        System.out.println();
    }

    private static void insertValues() {
        arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        implementationOfLinearSearch();
    }
}
