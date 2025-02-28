public class StackTest {

    public static void main(String[] args) {
        // Test 1: Numeric Stack
        System.out.println("Testing Stack with Numbers:");
        Stack<Integer> numberStack = new Stack<>();

        try {
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            System.out.println("Stack after pushes: " + numberStack.list());
            System.out.println("Peek top element: " + numberStack.peek());

            System.out.println("Popped element: " + numberStack.pop());
            System.out.println("Stack after pop: " + numberStack.list());

            System.out.println("Popped element: " + numberStack.pop());
            System.out.println("Stack after pop: " + numberStack.list());

            System.out.println("Popped element: " + numberStack.pop());
            System.out.println("Stack after pop: " + numberStack.list());

            // Uncomment to test empty stack pop
            // System.out.println("Popped element: " + numberStack.pop());

        } catch (StackFullException | StackEmptyException e) {
            System.err.println(e.getMessage());
        }

        // Test 2: Text Stack
        System.out.println("\nTesting Stack with Text:");
        Stack<String> textStack = new Stack<>();

        try {
            textStack.push("Hello");
            textStack.push("World");
            textStack.push("Java");
            System.out.println("Stack after pushes: " + textStack.list());
            System.out.println("Peek top element: " + textStack.peek());

            System.out.println("Popped element: " + textStack.pop());
            System.out.println("Stack after pop: " + textStack.list());

            System.out.println("Popped element: " + textStack.pop());
            System.out.println("Stack after pop: " + textStack.list());

            System.out.println("Popped element: " + textStack.pop());
            System.out.println("Stack after pop: " + textStack.list());

            // Uncomment to test empty stack pop
            // System.out.println("Popped element: " + textStack.pop());

        } catch (StackFullException | StackEmptyException e) {
            System.err.println(e.getMessage());
        }
    }
}
