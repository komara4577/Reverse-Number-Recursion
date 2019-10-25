//By Kevin O'Mara

import java.util.Scanner;

public class RecursiveNumReverse{
   public static void main(String[] args){
      int num = 0;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Input a number: ");
      num = input.nextInt();
      
      System.out.print("Reverse of the input number is: ");
      reverseMethod(num);
      
   }
   
   public static void reverseMethod(int num){
      if(num < 10){
         System.out.println(num);
         return;
      }
      else{
         System.out.print(num % 10);
         reverseMethod(num/10);
      }
   }
   
}