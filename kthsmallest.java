import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class kthsmallest {

    public static int kthsmallest(int[] arr, int l, int r, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add the first k elements to the heap
        for (int i = l; i < l + k; i++) {
            pq.add(arr[i]);
        }
        
        // Process the remaining elements
        for (int i = l + k; i <= r; i++) {
            if (arr[i] < pq.peek()) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        
        // The root of the heap is the k-th smallest element
        return pq.peek();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        // Read the elements of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Read k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        
        // Find and print the k-th smallest element
        int kthSmallestElement = kthSmallest(arr, 0, n - 1, k);
        System.out.println("The " + k + "-th smallest element is: " + kthSmallestElement);

        scanner.close();
    }
}