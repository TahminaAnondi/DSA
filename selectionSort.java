package DSA;

public class selectionSort {
    public static void main(String args[]){
        int a[] = { 2, 8, 0 ,1,-4,3,2,9,7,6,8,5,4};
        selectionSortName(a);
    }
    public static void selectionSortName(int unsortedArray[]){
        
        for(int i=0;i<unsortedArray.length-1;i++)
        {        
            //Assume the current element    
            int minIndex = i;
            for(int j=i+1;j<unsortedArray.length;j++){
                if(unsortedArray[minIndex]>unsortedArray[j]){
                    minIndex = j;
                }
            }
                int temp = unsortedArray[minIndex];
                unsortedArray[minIndex] = unsortedArray[i];
                unsortedArray[i] = temp;
        }
        for(int i=0;i<unsortedArray.length;i++){
            System.out.print(unsortedArray[i]+", ");
        }

    }
}
