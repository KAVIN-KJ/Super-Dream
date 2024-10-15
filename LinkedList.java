import java.util.*;

class node{
    int val;
    node next;
    node(int v){
        this.val = v;
        this.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("**********LINKED LIST !**********");
        int n = 0;
        node head = null;
        System.out.println();
        while (true) {
            n = in.nextInt();
            if(n==-1) break;
            head = insert(n,head);
        }
        display(head);
        head = reverse(head);
        display(head);
    }

    private static node reverse(node head) {
        node prev = null;
        node next = null;
        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return head = prev;

    }

    private static void display(node head) {
        node temp = head;
        System.out.println("Displaying list !");
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static node insert(int val,node head){
        if(head==null){
            return new node(val);
        }
        else{
            node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = new node(val);
        }
        return head;
    }
}
