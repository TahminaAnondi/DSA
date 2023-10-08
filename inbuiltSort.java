package DSA;
import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {
    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        Arrays.sort(arr,0,2,Collections.reverseOrder());
        printArr(arr);
    }
    public static void printArr(Integer a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
