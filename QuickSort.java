import java.util.*;

class QuickSort{
  public static int partition(int[] arr, int low, int high){
    int pivot = arr [high];
    int i = low - 1;

    for(int j = low; j < high; j++){
       if (arr[j] < pivot){
          i++;
      //Swap
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;

       }

     }

     //Swap with pivot
     i++;
     int temp = arr[i];
     arr[i] = arr[high];
     arr[high] = temp;
     
     return i;
 }

 public static void quicksort(int arr[], int low, int high){
    if(low < high){
      int pi = partition(arr, low, high);
      
      quicksort(arr, low, pi-1);
      quicksort(arr, pi+1, high);
    }
 }
 
 public static void main(String[]args){

   System.out.println("THIS IS AN EXAMPLE OF QUICKSORT ALGORITHM");  
 
   Scanner sc = new Scanner(System.in);
   
   //Asking number of elements
   
   System.out.println("Enter the Number of elements");
   int n = sc.nextInt();
   
   //Asking user to enter elements
   
   int[] arr = new int[n];

   System.out.println("Enter the elements");
   
   for(int i=0; i < n; i++){
     arr[i] = sc.nextInt();
   }

   System.out.println("Your array: "+ Arrays.toString(arr));
    
  
   quicksort(arr, 0, n - 1);
   //Print
   System.out.println("Sorted Array: "+ Arrays.toString(arr));
 }
}
 
