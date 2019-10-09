import java.util.Scanner;

public class NamesPartTwo {
    // Prints the Song
    private static void song(String name){
        System.out.print(name + " " + name + ", ");
        System.out.println("bo-B" + name.substring(1));
        System.out.println("Banana-fana, fo-F" + name.substring(1));
        System.out.println("Fee-fi-mo-M" + name.substring(1));
        System.out.println(name.toUpperCase() + "!\n");
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first_name = scanner.nextLine();
        System.out.print("Enter last name: ");
        String last_name = scanner.nextLine();

        song(first_name);
        song(last_name);
    }
}
