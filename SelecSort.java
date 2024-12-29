import java.util.*;

class SelecSort{
  public static void main(String[]args){
    System.out.println("THIS IS AN EXAMPLE OF SELECTION SORTING");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int a = sc.nextInt();
    System.out.println("Your Array has "+a+ " elements");
    System.out.println("Enter your values");
    int[] my_Array = new int[a];
    for(int i = 0; i < a; i++){
       my_Array[i] = sc.nextInt();
    }
    
    System.out.print("Your Array is recorded");
    System.out.println("my_Array= "+ Arrays.toString(my_Array));

    int n = my_Array.length;
    
    for(int x = 0; x < n-1; x++){
       int min = x;
      for(int y = x+1; y < n; y++){
         if(my_Array[y] < my_Array[min]){
           min  = y;
         }
      }
      
      int min_value = my_Array[min];
      for(int k = min; k > x; k--){
        my_Array[k] = my_Array [k-1];
      }
      my_Array[x] = min_value;
     }
     
     System.out.println("Array Sorted");
     // for(int x = 0; x < n; x++)
         System.out.println("Sorted my_Array = " + Arrays.toString(my_Array));
      
        
  }
}