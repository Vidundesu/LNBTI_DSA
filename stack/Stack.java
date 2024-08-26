package stack;

class Stack {
    // Max size of the stack
    static final int MAX = 1000;
    int top;
    int[] stackArray = new int[MAX]; // Array to store stack elements

    // Constructor to initialize the stack
    Stack() {
        top = -1;
    }

    // Method to check if the stack is empty
    boolean isEmpty() {
        return (top < 0);
    }

    // Method to push an element onto the stack
    boolean push(int value) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed onto stack");
            return true;
        }
    }

    // Method to pop an element from the stack
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int value = stackArray[top--];
            return value;
        }
    }

    // Method to peek at the top element of the stack
    int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Method to print all elements of the stack
    void printStack() {
        if (top < 0) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Elements in stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Display the top element
        System.out.println("Top element is: " + stack.peek());
        
        // Pop elements from the stack
        System.out.println(stack.pop() + " popped from stack");
        
        // Print all elements in the stack
        stack.printStack();
    }
}
