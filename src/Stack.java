/**
 * A generic Stack class that implements a stack data structure.
 * It uses an array internally to store the elements and throws custom exceptions
 * when trying to pop or peek from an empty stack, or push to a full stack.
 *
 * @param <T> The type of elements stored in the stack.
 */
public class Stack<T> {
    private Object[] elements;  // Array to store stack elements
    private int size;           // The current size of the stack
    private int capacity;       // The maximum capacity of the stack

    /**
     * Default constructor for Stack, initializing with a default capacity of 10.
     */
    public Stack() {
        this.capacity = 10;
        this.elements = new Object[capacity];
        this.size = 0;
    }

    /**
     * Constructor that accepts an initial capacity for the stack.
     *
     * @param capacity The maximum capacity of the stack.
     */
    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
    }

    /**
     * Pushes a new element onto the stack.
     *
     * @param item The item to be pushed onto the stack.
     * @throws StackFullException If the stack is already full.
     */
    public void push(T item) throws StackFullException {
        if (size == capacity) {
            throw new StackFullException("Stack is full!");
        }
        elements[size] = item;
        size++;
    }

    /**
     * Pops an element from the stack.
     *
     * @return The element removed from the stack.
     * @throws StackEmptyException If the stack is empty.
     */
    public T pop() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stack is empty!");
        }
        size--;
        @SuppressWarnings("unchecked")
        T item = (T) elements[size];
        elements[size] = null;  // Avoid memory leak
        return item;
    }

    /**
     * Peeks at the top element of the stack without removing it.
     *
     * @return The top element of the stack.
     * @throws StackEmptyException If the stack is empty.
     */
    public T peek() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stack is empty!");
        }
        @SuppressWarnings("unchecked")
        T item = (T) elements[size - 1];
        return item;
    }

    /**
     * Lists all the elements in the stack as a string, with elements separated by ";".
     *
     * @return A string representation of the stack elements.
     */
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
