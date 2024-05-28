import java.util.Scanner;

public class sort 0,1,2 {
    public static void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zero++;
            if (nums[i] == 1) one++;
            if (nums[i] == 2) two++;
        }

        for (int i = 0; i < zero; i++) nums[i] = 0;
        for (int i = zero; i < one + zero; i++) nums[i] = 1;
        for (int i = one + zero; i < nums.length; i++) nums[i] = 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        
        int[] nums = new int[length];
        System.out.println("Enter the elements of the array (0, 1, or 2):");
        for (int i = 0; i < length; i++) {
            int input = scanner.nextInt();
            if (input < 0 || input > 2) {
                System.out.println("Invalid input! Please enter only 0, 1, or 2.");
                i--; // Decrement i to re-enter the current index
            } else {
                nums[i] = input;
            }
        }
        
        sortColors(nums);
        
        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}