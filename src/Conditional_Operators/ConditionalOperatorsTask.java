package Conditional_Operators;
import java.util.Scanner;

public class ConditionalOperatorsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Task 1
        System.out.println("Enter any number, you can enter before and after 0: ");
        int num = scanner.nextInt();
    if (num >= 0){
        System.out.println("Positive number: " + num);
    }else{
        System.out.println("Negative number: " + num);
    }

  }
}
