public class Quicksort {
    public static int pivotIdx(int arr[], int low, int high){
        int pivot = high; // took last element as the pivot
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





    public static void main(String[] args) {

    }
}
