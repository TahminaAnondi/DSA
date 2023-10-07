package DSA;

public class selectionSort {
    public static void main(String args[]){
        int a[] = { 2, 8, 0 ,1,-4,3,2,9,7,6,8,5,4};
        selectionSortName(a);
    }
    public static void selectionSortName(int unsortedArray[]){
        
        for(int i=0;i<unsortedArray.length-1;i++)
        {        
            
            int minIndex = i; //Assume the current position  is smaller
            // Find the index of the smallest element in the unsorted portion
            for(int j=i+1;j<unsortedArray.length;j++){
                // If we find a smaller element, update minIndex
                if(unsortedArray[minIndex]>unsortedArray[j]){
                    minIndex = j;
                }
            }
            // Swap the smallest element (at minIndex) with the current element (at i)
                int temp = unsortedArray[minIndex];
                unsortedArray[minIndex] = unsortedArray[i];
                unsortedArray[i] = temp;
        }
        // Print the sorted array
        for(int i=0;i<unsortedArray.length;i++){
            System.out.print(unsortedArray[i]+", ");
        }

    }
}
