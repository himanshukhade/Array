

public class Left_rotate_1{ 
    public static void main(String[]args){
        int a[]={1,2,3,4,5};
        int first=a[0];
        int size=a.length;
        for(int i=0;i<size-1;i++){
            a[i]=a[i+1];
        }
        a[size-1]=first;
        System.out.println(Arrays.toString(a));
    }
}
