package DSA;

public class insertionSort {
    public static void main(String args[]){
        int a[]={1,3,0,8};
        insertionSortArray(a);
        printArray(a);
    }
    public static void insertionSortArray(int a[]){
        int curr,prev;
        for(int i=1;i<a.length;i++){
            curr=a[i];
            prev=i-1;
            while(prev>=0 && a[prev]>curr){
                a[prev+1] = a[prev];
                prev--;
            
            }
            a[prev+1] = curr;
        }
    }
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
    }
}
