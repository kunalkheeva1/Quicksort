//One of the fastest algorithm so far, so do it carefully,,

public class Quicksort {
    public static void quickSort(int [] arr, int lowIndex, int highIndex){
        //here i will take a pivot position and then two pointer for the rest of the array
        //one on the right side of the pivot and another on the left side of it

    int pivot = arr[highIndex];
    int leftPointer= lowIndex;
    int rightPointer = highIndex;

        //now traverse with the pointers wrt the pivot position
        while(lowIndex<highIndex){
            // traversing the left side, and incrementing towards the rightPointer until the condition matches
            while(arr[leftPointer]<=arr[pivot] && lowIndex<highIndex){
                lowIndex++;
            }
            //traversing the right side, and decrementing towards the leftPointer until the condition matches
            while (arr[rightPointer]>=arr[pivot] && lowIndex<highIndex){
                highIndex--;
            }
            //here i need a method to swap the elements
            swap(arr,leftPointer,rightPointer);
        }
        //now if the pointers are meeting at some level then just swap it with the high index which is pivot
        swap(arr,leftPointer, highIndex);

        //since the first swap happened wrt to the conditions

        //lets make a recursivecall, it is for left half first, as my first index will be same lowIndex,

        quickSort(arr, lowIndex,leftPointer);
        //now for the right half of the array
        quickSort(arr, leftPointer,highIndex);

    }
    //creating a swap method to swap the elements of an array.
    public static void swap(int[] arr, int index1, int index2 ){
        int temp = arr[index1];
        for(int i=0; i<arr.length; i++){
            arr[index1]= arr[index2];
            arr[index2]= temp;
        }

    }

    public static void main(String[] args) {

    }
}