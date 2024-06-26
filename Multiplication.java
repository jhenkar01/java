//write a program to display the multiplication table(2*1 = 2)like this 
public class Multiplication{

    public static void main(String[] args) {
        int number = 2; 

       
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
