// Custom exception when trying to pop from or peek an empty stack.
public class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}