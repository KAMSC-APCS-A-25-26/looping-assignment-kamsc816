import java.util.Scanner;

public class CharacterPerLine {
    public static void main(String[] args) {        
        // TODO: Step 1 - Get user input

        // TODO: Step 2 - Print each character on a separate line
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        for(int i=0; i<word.length(); i++){
            char character = word.charAt(i);
            System.out.println(character);
        }
    }
}
