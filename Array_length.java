import java.util.*;
public class Array_length{
    public static void main(String[]args){
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elment");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array element");

        for(int i=0;i<a.length;i++){
           System.out.println(a[i]+ " ");
        }

        System.out.println("Array length "+ a.length);
        
    }
}