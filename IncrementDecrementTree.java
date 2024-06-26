//2. create 2 class, declare a variable and initialize with 87, display the value before and after the pre increment and decrement
public class IncrementDecrementTree {
 public static void main(String args[]){
   int num = 87;
   System.out.println("the intialize no is"+num);
   int preincrement = ++num;
   System.out.println("the pre increment value is:"+preincrement);
   int predecrement = --num;
   System.out.println("the pre decrement value is:"+predecrement);
  
  }
}