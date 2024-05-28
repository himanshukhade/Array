import java.util.*;
public class Rotate_right_3{
    public static void main(String[]args){
        int a[]={1,2,3,4,5};
         int size=a.length;
         int n=3;
        for(int j=1;j<=n;j++){
            int last=a[size-1];
            for(int i=size-1;i>0;i--){
                   a[i]=a[i-1];
            }
            a[0]=last;
        }
       
        System.out.println(Arrays.toString(a));
    }
}