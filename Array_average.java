import java.util.*;
public class Array_average{
    public static void main(String[] args) {
        int a[]=new int[5];int sum=0; double avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array element");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array element is");
        for(int i=0;i<5;i++){
            System.out.println(a[i]+" ");
        }
        for( int i=0;i<5;i++){
            sum=a[i]+sum;
        }
        avg=sum/5;
 System.out.println("Average is:- "+avg);
}   
 }


