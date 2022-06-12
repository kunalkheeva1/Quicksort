//One of the fastest algorithm so far, so do it carefully,,

public class Quicksort {
    public static void quickSort(int [] arr, int lowIndex, int highIndex){
        //giving it a condition, which means it only has one value
        if(lowIndex>=highIndex){
            return;
        }

        //here i will take a pivot position and then two pointer for the rest of the array
        //one on the right side of the pivot and another on the left side of it
        int pivot = arr[highIndex];
        int leftPointer= lowIndex;
        int rightPointer = highIndex;


        //now traverse with the pointers wrt the pivot position
        while(leftPointer < rightPointer){
            // traversing the left side, and incrementing towards the rightPointer until the condition matches
            while(arr[leftPointer]<=pivot && leftPointer<rightPointer){
                leftPointer++;
            }
            //traversing the right side, and decrementing towards the leftPointer until the condition matches
            while (arr[rightPointer]>=pivot && leftPointer<rightPointer){
                rightPointer--;
            }
            //here i need a method to swap the elements so that all small will be shifted to left side
            swap(arr,leftPointer,rightPointer);
        }

        //meeting point of both the pointers
        swap(arr,leftPointer, highIndex);

        //since the first swap happened wrt to the conditions

        //lets make a recursive call, it is for left half first, as my first index will be same lowIndex,

        quickSort(arr, lowIndex,leftPointer-1);
        //now for the right half of the array
        quickSort(arr, leftPointer+1,highIndex);

    }
    //creating a swap method to swap the elements of an array.
    public static void swap(int[] arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;

    }
    //creating a method to print my array
    public static void printArr(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //now lets do method overloading when I am just gonna give only array as the parameter
    public static void quickSort(int [] arr){
        quickSort(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        //testing
        int[]arr= {3,4,2,0,84,4,9,6,7};
        printArr(arr);
        quickSort(arr);
        printArr(arr);


    }
}