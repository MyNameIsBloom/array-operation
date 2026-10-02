
import java.util.Scanner; 
 
public class ArrayOperations { 
 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter number of elements: "); 
        int n = sc.nextInt(); 
 
        int arr[] = new int[n]; 
 
        // Input array elements 
        System.out.println("Enter array elements:"); 
        for(int i = 0; i < n; i++) {arr[i] = sc.nextInt(); 
        } 
 
        // Display array elements 
        System.out.println("\nArray Elements:"); 
        for(int i = 0; i < n; i++) {System.out.print(arr[i] + " "); 
        } 
 
        // Find maximum and minimum  int max = arr[0]; 
        int min = arr[0]; 
 
        for(int i = 1; i < n; i++) {if(arr[i] > max) {max = arr[i]; 
            } 
 
            if(arr[i] < min) { min = arr[i]; 
            } 
        } 
 
        // Calculate sum int sum = 0;for(int i = 0; i < n; i++) { 
            sum += arr[i]; 
        } 
 
        // Calculate average 
        double avg = (double) sum / n; 
 
        // Search element 
        System.out.print("\nEnter element to search: "); 
        int key = sc.nextInt(); boolean found = false; for(int i = 0; i < n; i++) { if(arr[i] == key) { 
                System.out.println("Element found at position: " + (i + 1)); found = true; break; 
            }         } 
        if(!found) { 
            System.out.println("Element not found in array."); 
        } 
        // Display results 
        System.out.println("\nMaximum element: " + max); 
        System.out.println("Minimum element: " + min); 
        System.out.println("Sum of elements: " + sum); System.out.println("Average of elements: " + avg); sc.close(); 
    } 
} 
