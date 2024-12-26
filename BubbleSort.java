import java.util.*;

class BubbleSort {
 public static void main(String[]args){
  System.out.println("THIS IS AN EXAMPLE OF BUBBLE SORTING");
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter your values");  

  int[] Array1=new int[10];
   for(int i = 0; i < 10; i++){
       Array1[i] = sc.nextInt();
   }

   System.out.println("Your Array is recorded");
   System.out.println("Array1= "+Arrays.toString(Array1)); 
   
   //Bubble Sort
   for(int i = 0; i < Array1.length-1; i++){
       for(int j = 0; j < Array1.length-1-i; j++){
           if (Array1[j] > Array1[j+1]){
               //Swap adjacent elements
               int x = Array1[j];
               Array1[j]=Array1[j+1];
               Array1[j+1]=x;
           }
        }
    }
    
    System.out.println("Sorted Array");
    System.out.println("Sorted Array1= "+Arrays.toString(Array1));           
    
    System.out.println("Lowest value: " + Array1[0]);
  
   }
}
    
  