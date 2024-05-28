import java.util.*;
public class Array_Elementsum {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Array Elements: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum = a[i] + sum;
        }
        System.out.println("\nSum of Elements is " + sum);
    }
}