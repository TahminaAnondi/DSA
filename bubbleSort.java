package DSA;

import java.util.Scanner;

public class bubbleSort {
    public static void ascendingBubbleSort(int unsortedArray[]){
        for(int i=0;i<unsortedArray.length;i++){
            for(int j=0;j<unsortedArray.length-1-i;j++){
                if(unsortedArray[j]>unsortedArray[j+1]){
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array is: ");
        for (int m=0;m<unsortedArray.length;m++){
            System.out.print(unsortedArray[m]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 unsorted array: ");
        int a[] = new int[5];
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        ascendingBubbleSort(a);   
        sc.close(); 
    }
}
