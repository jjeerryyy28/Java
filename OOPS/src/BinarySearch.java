import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static Scanner scanner = new Scanner(System.in);
    static int n = scanner.nextInt();
    static int[] arr = new int[n];
    static int search_element = scanner.nextInt();
    static boolean status = false;

    private static void binarySearchImplementation(){
        insertValues();
        printValues();
        int left = 0;
        int right = n-1;
        searchElement(arr, left, right, search_element);
    }

    private static void searchElement(int[] arr, int left, int right, int search_element) {
        if(left>right){
            System.out.println("Number: " + search_element + " can't be found in the array");
            return;
        }
        int mid = left+(right-left)/2;
        if(arr[mid] == search_element){
            status = true;
            System.out.println("Search element found at index: "+ mid);
        }
        else if(arr[mid]>search_element){
            searchElement(arr, left, mid-1, search_element);
        }else{
            searchElement(arr, mid+1, right, search_element);
        }
    }

    private static void printValues() {
        for(int i=0;i<n;i++){
            System.out.println("Value at index " + i + "is: " + arr[i]);
        }
    }

    private static void insertValues() {
        System.out.println("Insert values");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println();
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        bs.binarySearchImplementation();

    }
}
