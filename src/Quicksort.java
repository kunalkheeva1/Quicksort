public class Quicksort {
    public static int pivotIdx(int arr[], int low, int high){
        int pivot = arr[high]; // took last element as the pivot
        int i= low-1;     //this is to manage the new positions
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                //swap the current element and assign it ith position
                int temp = arr[i];
                arr[i]=arr[j];       //will provide jth value to i
                arr[j]= temp;        //will provide ith value to j which is stored in temp
            }
        } i++;                  //after adding the space I wil find the space to adjust my pivot now
        int temp = arr[i];       //this strategy when element is not smaller than the given one
        arr[i]=pivot;           //basically just adding the pivot to the next position in between
        arr[high]=temp;         //large element will acquire pivot position
        return i;               //Now i wil have updated index of the pivot
    }

    //Creating a method to perform sorting and which will require the pivot position, and now dealing with the rest of the elements

    public static void quickSort(int[]arr, int low, int high){
        if(low<high){
            int pivot = pivotIdx(arr,low, high);
            //recurrsively calling the quicksort to get the remaining positions
            quickSort(arr,low, pivot-1);
            quickSort(arr,pivot+1, high);
        }
    }


    public static void main(String[] args) {
        int arr[]= {2,4,2,1,0,34,-1};
        int n = arr.length;

        quickSort(arr,0,n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
}
