package School;

import java.util.*;

public class grades {
    public static void main(String[] args) {
        Stack<String> grade = new Stack<String>();
        Stack<String> gradeB = new Stack<String>();
        Stack<String> gradeC = new Stack<String>();
        Stack<String> gradeD = new Stack<String>();

        Stack<String> stack = new Stack<String>();
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int z = 1;
        do {
            System.out.println("Would you like add a new student? Chose 1 for yes or 0 for no : ");
            z = in.nextInt();
            System.out.println("Student name: ");

            String placeHolder = sc.nextLine();
            System.out.println(placeHolder);
            stack.push(placeHolder);
            System.out.println("Student grade 1: ");

            String gradeA = sc.nextLine();
            grade.push(gradeA);
            System.out.println("Student grade 2: ");
            String gradeB = sc.nextLine();
            grade.push(gradeB);

        } while (z != 0);
        System.out.println("The list is : ");
        // stack.pop();
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
