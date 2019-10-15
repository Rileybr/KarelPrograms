import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name:");
        String first_name = scanner.nextLine();
        System.out.print("Enter Middle Name:");
        String middle_name = scanner.nextLine();
        System.out.print("Enter Last Name:");
        String last_name = scanner.nextLine();
        System.out.print("Enter Age:");
        int age = scanner.nextInt();

        String password;
        password = first_name.substring((first_name.length()/2), (first_name.length()/2 + 1)).toUpperCase();
        password += middle_name.substring((middle_name.length()/2), (middle_name.length()/2 + 1)).toUpperCase();
        password += last_name.substring((last_name.length()/2), (last_name.length()/2 + 1)).toUpperCase();
        password += first_name.substring(first_name.length()-1);
        password += middle_name.substring(middle_name.length()-1);
        password += last_name.substring(last_name.length()-1);
        password += (age * 75);

        System.out.print(password);
    }
}
