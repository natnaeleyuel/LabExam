package Question3;

class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int num) {
        if (isFull()) {
            System.out.println("The stack is full.");
        }
        arr[++top] = num;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
        }
        return arr[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
        }
        return arr[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
}
class QueueUsingStacks {
    private Stack stack1;
    private Stack stack2;

    public QueueUsingStacks(int size) {
        stack1 = new Stack(size);
        stack2 = new Stack(size);
    }
    public void enqueue(int num) {
        if (isFull()) {
            System.out.println("Queue is full.");
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(num);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
        }
        return stack1.pop();
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
        }
        return stack1.peek();
    }
    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public boolean isFull() {
        return stack1.isFull();
    }
}
public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());

        queue.enqueue(4);
        queue.enqueue(5);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());
        }

    }
}

