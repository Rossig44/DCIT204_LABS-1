import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter the target value to search for: ");
        int target = sc.nextInt();

        // Linear search on the original array
        int linIndex = Algorithm.linearSearch(arr, target);

        System.out.println("\n--- Linear Search ---");
        if (linIndex >= 0)
            System.out.println("Found " + target + " at index " + linIndex);
        else
            System.out.println(target + " was not found in the array.");

        // Binary search needs the array to be sorted first
        int[] sorted = Arrays.copyOf(arr, n);
        Arrays.sort(sorted);

        int binIndex = Algorithm.binarySearch(sorted, target);

        System.out.println("\n--- Binary Search ---");
        if (binIndex >= 0)
            System.out.println("Found " + target + " at index " + binIndex + " (sorted array)");
        else
            System.out.println(target + " was not found in the array.");

        sc.close();
    }
}
