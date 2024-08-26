package Queue;

class Queue {
    // Max size of the queue
    static final int MAX = 1000;
    int front, rear, size;
    int[] queueArray = new int[MAX]; // Array to store queue elements

    // Constructor to initialize the queue
    Queue() {
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to check if the queue is empty
    boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    boolean isFull() {
        return size == MAX;
    }

    // Method to add an element to the rear of the queue
    boolean enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return false;
        } else {
            rear = (rear + 1) % MAX; // Circular increment
            queueArray[rear] = value;
            size++;
            System.out.println(value + " enqueued to queue");
            return true;
        }
    }

    // Method to remove an element from the front of the queue
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            int value = queueArray[front];
            front = (front + 1) % MAX; // Circular increment
            size--;
            return value;
        }
    }

    // Method to peek at the front element of the queue
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    // Method to print all elements in the queue
    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Elements in queue:");
            for (int i = 0; i < size; i++) {
                System.out.println(queueArray[(front + i) % MAX]);
            }
        }
    }

    // Main method to test the queue implementation
    public static void main(String[] args) {
        Queue queue = new Queue();
        
        // Enqueue elements into the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        // Display the front element
        System.out.println("Front element is: " + queue.peek());
        
        // Dequeue elements from the queue
        System.out.println(queue.dequeue() + " dequeued from queue");
        
        // Print all elements in the queue
        queue.printQueue();
    }
}
