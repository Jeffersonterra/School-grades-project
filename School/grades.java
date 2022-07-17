package School;

import java.util.*;

public class grades {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        System.out.println("Would you like add a new student?")
        String placeHolder = ("");
        

        
        stack.push("Lari");
        stack.push("Perera");
        stack.push("Jeff");

        stack.push("Terra");
        stack.push("Magalhaes");
        stack.push("Cardoso");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
