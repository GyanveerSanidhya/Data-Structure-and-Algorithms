import java.util.*;

class LowestElement {
 public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your 5 values");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  int d=sc.nextInt();
  int e=sc.nextInt();
 
  int Array[]={a, b, c, d, e};
  
  System.out.println("Your Array is recorded");
  System.out.println(Arrays.toString(Array));
 
  int Low=Array[0];
  for(int i:Array){
   if(Low>i){
     Low=i;
   }
  }
  
  System.out.println("Lowest Element: "+Low);
 }
}