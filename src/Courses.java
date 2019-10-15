import java.util.Scanner;

public class Courses {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the description of the course?  ");
        String course = scanner.nextLine();

        String department = course.substring(0, course.indexOf(' ', 2));
        System.out.println("Department: " + department);
        String course_number = course.substring(course.indexOf(' ', 2), (course.indexOf(' ', 2) + 4));
        System.out.println("Course Number:" + course_number);
        String title = course.substring(course.indexOf(' ', 2) + 4);
        System.out.println("Title:" + title);
    }
}
