package stackkk;

public class Stack {
    private int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(5);
        s.push(10);
        s.push(15);

        System.out.println("Top: " + s.peek());    // 15
        System.out.println("Size: " + s.size());   // 3

        System.out.println("Popped: " + s.pop());  // 15
        System.out.println("Top now: " + s.peek()); // 10
        System.out.println("Is empty? " + s.isEmpty()); // false
    }
}
