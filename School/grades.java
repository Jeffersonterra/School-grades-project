package School;

import java.util.*;

public class grades {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String placeHold = ("");
        int z = 1;
        do {
            System.out.println("Would you like add a new student? Chose 1 for yes or 0 for no : ");
            z = in.nextInt();
            // sc.nextLine();
            String placeHolder = sc.nextLine();
            System.out.println(placeHolder);
            stack.push(placeHolder);
        } while (z != 0);
        System.out.println("The list is : ");
        // stack.pop();
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
