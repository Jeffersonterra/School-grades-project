package School;

import java.util.*;

public class grades {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like add a new student?")
        String placeHold = ("");
        int z = 1;
        do{
    String placeHolder = in.nextLine();
stack.push(placeHolder);
}
        while (z != 0);
       
       // stack.pop();
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
