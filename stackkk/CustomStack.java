

public class CustomStack {
    private int[] stack;
    private int top;

    public CustomStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        stack[top] = val;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int val = stack[top];
        top--;
        return val;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        CustomStack s = new CustomStack(3);

        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20); 

        System.out.println("Top: " + s.peek());

        System.out.println("Popped: " + s.pop());
        System.out.println("Top after pop: " + s.peek());
    }
}
