package stackkk;

import java.util.Scanner;

public class SupermarketQueue {
    private String[] line;
    private int front;
    private int rear;
    private int count;
    private int capacity;

    public SupermarketQueue(int capacity) {
        this.capacity = capacity;
        line = new String[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void join(String name) {
        if (count == capacity) {
            System.out.println("the line is full. " + name + " can't join.");
            return;
        }
        rear = (rear + 1) % capacity;
        line[rear] = name;
        count++;
        System.out.println(name + " joined the line.");
    }

    public void serve() {
        if (count == 0) {
            System.out.println("No one is in line to serve.");
            return;
        }
        System.out.println(line[front] + " was served and left the line.");
        front = (front + 1) % capacity;
        count--;
    }

    public void showLine() {
        if (count == 0) {
            System.out.println("The line is empty.");
            return;
        }
        System.out.println("People in line:");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.println((i + 1) + ". " + line[index]);
        }
    }

    public int peopleInLine() {
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SupermarketQueue line = new SupermarketQueue(5);

        while (true) {
            System.out.println("\n  Supermarket Line ");
            System.out.println("1. Join the line");
            System.out.println("2. Serve next person");
            System.out.println("3. Show line");
            System.out.println("4. How many people?");
            System.out.println("5. Exit");
            System.out.print("Pick an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                line.join(name);
            } else if (choice == 2) {
                line.serve();
            } else if (choice == 3) {
                line.showLine();
            } else if (choice == 4) {
                System.out.println("People in line: " + line.peopleInLine());
            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
