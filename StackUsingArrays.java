package Question2;

class StackUsingArrays {
    private int[] arr;
    private int top;
    private int capacity;

    public StackUsingArrays(int size) {
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
    public static void main(String[] args) {
        StackUsingArrays stack = new StackUsingArrays(6);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        for (int i = 0; i < stack.capacity; i++) {
            System.out.println(stack.arr[i]);
        }
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}



