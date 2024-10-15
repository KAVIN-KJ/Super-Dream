import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class LinkedList_Das {
    static Node head = null;

    public static void creation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        head = new Node();
        head.data = sc.nextInt();
        head.next = null;

        Node temp = head;

        for (int i = 1; i < n; i++) {
            Node newNode = new Node();
            newNode.data = sc.nextInt();
            newNode.next = null;
            temp.next = newNode;
            temp = temp.next;
        }

        System.out.println("The linked list: ");
    }

    public static void display() {
        Node disp = head;
        while (disp != null) {
            System.out.print(disp.data + " ");
            disp = disp.next;
        }
        System.out.println();
    }

    public static void addFront() {
        Scanner sc = new Scanner(System.in);
        System.out.println("The element to be inserted at front: ");
        Node front = new Node();
        front.data = sc.nextInt();
        front.next = head;
        head = front;
        System.out.println("The linked list: ");
    }

    public static void addLast() {
        Scanner sc = new Scanner(System.in);
        System.out.println("The element to be inserted at last: ");
        Node last = new Node();
        last.data = sc.nextInt();
        last.next = null;

        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = last;

        System.out.println("The linked list: ");
    }

    public static void addBetween() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of insertion: ");
        int pos = sc.nextInt();

        System.out.println("Enter the element to be inserted: ");
        Node between = new Node();
        between.data = sc.nextInt();
        between.next = null;

        if (pos == 1) {
            between.next = head;
            head = between;
        } else {
            Node ptr1 = head;
            Node ptr2 = head;
            int count = 1;

            while (count < pos) {
                ptr2 = ptr1;
                ptr1 = ptr1.next;
                count++;
            }

            ptr2.next = between;
            between.next = ptr1;
        }

        System.out.println("The linked list: ");
    }

    public static void delFront() {
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            Node del = head;
            head = head.next;
            del = null;
        }

        System.out.println("The list after deletion of first element: ");
    }

    public static void delLast() {
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            Node ptr1 = head;
            Node ptr2 = head;

            while (ptr1.next != null) {
                ptr2 = ptr1;
                ptr1 = ptr1.next;
            }

            ptr2.next = null;
        }

        System.out.println("The list after deletion of last element: ");
    }

    public static void delBetween() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of deletion: ");
        int pos = sc.nextInt();

        if (head == null) {
            System.out.println("The list is empty");
        } else if (pos == 1) {
            Node del = head;
            head = head.next;
            del = null;
        } else {
            int count = 1;
            Node ptr1 = head;
            Node ptr2 = head;

            while (count < pos) {
                ptr2 = ptr1;
                ptr1 = ptr1.next;
                count++;
            }

            ptr2.next = ptr1.next;
            ptr1 = null;
        }

        System.out.println("The list after deletion of certain element: ");
    }

    public static void reverse() {
        Node prev = null;
        Node next = null;

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;

        System.out.println("The list after reverse: ");
    }

    public static void delEntire() {
        while (head != null) {
            Node temp = head;
            head = head.next;
            temp = null;
        }

        System.out.println("The list after full deletion: ");
    }

    public static void swap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First element: ");
        int num1 = sc.nextInt();

        System.out.println("Second element: ");
        int num2 = sc.nextInt();

        Node ptr1 = head;
        Node ptr2 = head;

        while (ptr1 != null && ptr1.data != num1) {
            ptr1 = ptr1.next;
        }

        while (ptr2 != null && ptr2.data != num2) {
            ptr2 = ptr2.next;
        }

        if (ptr1 != null && ptr2 != null) {
            int temp = ptr1.data;
            ptr1.data = ptr2.data;
            ptr2.data = temp;
        }
    }

    public static void kthNode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        if (k == 0) {
            return;
        }

        Node current = head;
        int count = 1;

        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return;
        }

        Node temp = current;

        while (current.next != null) {
            current = current.next;
        }

        current.next = head;
        head = temp.next;
        temp.next = null;
    }

    public static void find() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();

        Node ptr1 = head;
        int count = 1;

        while (count < pos) {
            ptr1 = ptr1.next;
            count++;
        }

        System.out.println(ptr1.data);
    }

    public static void main(String[] args) {
        creation();
        display();
        kthNode();
        display();
        // addFront();
        // display();
        // addLast();
        // display();
        // addBetween();
        // display();
        // delFront();
        // display();
        // delLast();
        // display();
        // delBetween();
        // display();
        // reverse();
        // display();
        // delEntire();
        display();
    }
}