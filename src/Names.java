public class Names {
    public static void main(String[] args){
        String first_name = "Danny";
        String last_name = "Devito";

        System.out.println(first_name + " " + last_name); // prints first name, last name
        System.out.println((first_name.length() + last_name.length())); // prints total length of the name
        System.out.println(first_name.substring(0, 1) + last_name.substring(0, 1)); // prints first initials
        System.out.println(first_name.compareTo(last_name)); // prints the difference between the two names
        System.out.println(last_name.indexOf(first_name.substring(first_name.length()-1))); // prints the index of the last letter of the first name in the last name
        System.out.println(first_name.indexOf(last_name.substring(last_name.length()-1))); // prints the index of the last letter of the last name in the first name
        System.out.print(first_name.substring(0, (first_name.length()/2 + 1)) + last_name.substring(last_name.length()/2)); // prints the first half of the first name with the second half of the last name
        System.out.print(" " + last_name.substring(0, (first_name.length()/2 + 1)) + first_name.substring(last_name.length()/2)); // prints the first half of the last name with the second half of the first name


    }
}
