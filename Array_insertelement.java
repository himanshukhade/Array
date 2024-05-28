import java.util.*;

public class Array_insertelement {
    public static void main(String[] args) {
        int size, loc, item, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        size = sc.nextInt();

        int a[] = new int[size]; 
        System.out.println("Enter array elements");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter location of array");
        loc = sc.nextInt();
        System.out.println("Enter new item");
        item = sc.nextInt();

       
        for (i = size - 1; i > loc; i--) { 
            a[i] = a[i - 1];
        }
        a[loc] = item;
        size++; 

        System.out.println("Array after insertion:");
        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}