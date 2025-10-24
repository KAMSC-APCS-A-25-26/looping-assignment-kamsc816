import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {     
        // TODO: Step 1 - Get user input

        // TODO: Step 2 - Validate input
        
        // TODO: Step 3 - Calculate sum of even numbers
        
        // TODO: Step 4 - Display the result
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        int num = sc.nextInt();
        int total = 0;
        if (num<2){
            System.out.println("Error: Input must be 2 or greater.");
        }
        
        for(int i = 2; i<=num; i+=2){
            total = total + i;
        }
        System.out.println("The sum of even numbers between 2 and " + num + " is " + total + ".");

    }
}
