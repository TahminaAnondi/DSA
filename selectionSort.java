package DSA;

public class selectionSort {
    public static void main(String args[]){
        int a[] = { 2, 8, 0 ,1,-4,3,2,9,7,6,8,5,4};
        selectionSortName(a);
    }
    public static void selectionSortName(int unsortedArray[]){
        
        for(int i=0;i<unsortedArray.length-1;i++)
        {            
            for(int j=i+1;j<unsortedArray.length;j++){
                if(unsortedArray[i]>unsortedArray[j]){
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[i];
                    unsortedArray[i] = temp;
                }
            }
        }
        for(int i=0;i<unsortedArray.length;i++){
            System.out.print(unsortedArray[i]+", ");
        }

    }
}
