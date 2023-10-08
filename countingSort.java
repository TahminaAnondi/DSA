package DSA;

public class countingSort {

    public static void main(String args[]){
        int a[]={1,3,0,7,1,3,2};
        countingSortArray(a);
        printArray(a);
    }
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void countingSortArray(int a[]){
        //find the max num
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(largest, a[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<a.length;i++){
            
            //count[a[i]]=count[a[i]];
            count[a[i]]++;
            //System.out.print(count[a[i]]);
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }
}
