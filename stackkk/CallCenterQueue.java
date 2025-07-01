

import java.util.Scanner;

public class CallCenterQueue {
    private String[] calls;
    private int front;
    private int rear;
    private int count;
    private int capacity;

    public CallCenterQueue(int capacity) {
        this.capacity = capacity;
        calls = new String[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void addCall(String caller) {
        if (count == capacity) {
            System.out.println("the queue is full. Can't add " + caller + ".");
            return;
        }
        rear = (rear + 1) % capacity;
        calls[rear] = caller;
        count++;
        System.out.println("Call from " + caller + " added to the queue.");
    }

    public void answerCall() {
        if (count == 0) {
            System.out.println("No calls waiting.");
            return;
        }
        System.out.println("Answering call from " + calls[front] + ".");
        front = (front + 1) % capacity;
        count--;
    }

    public void showCalls() {
        if (count == 0) {
            System.out.println("No calls in the queue.");
            return;
        }
        System.out.println("Calls waiting in the queue:");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.println((i + 1) + ". " + calls[index]);
        }
    }

    public int waitingCalls() {
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CallCenterQueue center = new CallCenterQueue(5);

        while (true) {
            System.out.println("\n   Call Center Menu   ");
            System.out.println("1. Add new call");
            System.out.println("2. Answer next call");
            System.out.println("3. Show all waiting calls");
            System.out.println("4. How many calls waiting?");
            System.out.println("5. Exit");
            System.out.print("Pick an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter caller name or number: ");
                String caller = sc.nextLine();
                center.addCall(caller);
            } else if (choice == 2) {
                center.answerCall();
            } else if (choice == 3) {
                center.showCalls();
            } else if (choice == 4) {
                System.out.println("Calls waiting: " + center.waitingCalls());
            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
