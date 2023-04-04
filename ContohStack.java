import java.util.Stack;
public class ContohStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Aku");
        stack.push("Anak");
        stack.push("Indonesia");

        System.out.println("Next: " + stack.peek());

        stack.push("Raya");
        System.out.println(stack.pop());

        stack.push("!");

        int count = stack.search("Aku");
        while (count != -1 && count > 1){
            stack.pop();
            count--;
        }

        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}