// Custom exception when trying to push into a full stack.
public class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}