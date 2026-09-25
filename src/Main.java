import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        System.out.println("\nStudent Name: " + name);
        System.out.println("Mark: " + mark);

        if (mark >= 50)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
        System.out.println("Mark: " + mark);
        sc.close();
    }
}