import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
                
        // TODO: Step 1 - Get user input

        
        // TODO: Step 2 - Generate the number triangle pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
      }

    }
}
