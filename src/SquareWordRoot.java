/*
By Brandon Riley
10/17/19
Finds the "Square root" of a word by taking the square root of the length of the word and printing the corresponding character in the initial word
 */
import java.util.Scanner;

public class SquareWordRoot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String word = scanner.nextLine();
        String word_square_root = word.substring((int)Math.sqrt(word.length()), ((int)Math.sqrt(word.length()) + 1)); // Finds the "Square root" of a word by taking the square root of the length of the word and printing the corresponding character in the initial word
        System.out.print("The \"square root\" of " + word + " is " + word_square_root);
    }
}
