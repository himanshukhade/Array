import java.util.*;

public class search_element {
    public static void main(String[] args) {
        int[] a = new int[5];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        
        // Input array elements
        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        // Input search element
        System.out.println("Enter the Search element:");
        int n = sc.nextInt();
        
        // Search for the element
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
                break; // Stop searching once the element is found
            }
        }
        
        // Output the result
        if (count > 0) {
            System.out.println("Item is found");
        } else {
            System.out.println("Item not found");
        }
    }
}