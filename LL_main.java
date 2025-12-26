import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head,tail;
    Node temp = head;
    Node oddHead = null, oddTail = null;
    Node evenHead = null, evenTail = null;
    public void add(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        }
        else{
            tail.next = nn;
            tail = nn;
        }
    }
    public void alternate () {
        oddHead = null;
        oddTail = null;
        evenHead = null;
        evenTail = null;
        temp = head;
        int pos = 1;
        while (temp != null) {
            Node en = new Node(temp.data);
            if (pos % 2 != 0) {//odd position
                if (oddHead == null) {
                    oddHead = oddTail = en;
                }
                else {
                    oddTail.next = en;
                    oddTail = en;
                }
            }
            else {//even position
                if (evenHead == null) {
                    evenHead = evenTail = en;
                }
                else {
                    evenTail.next = en;
                    evenTail = en;
                }
            }
            temp = temp.next;
            pos++;
        }
    }

    void printList (Node head){
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
        System.out.println();
    }
    void display(){
        printList(head);
        printList(oddHead);
        printList(evenHead);
    }
}
public class LL_main{
    static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.alternate();
        list.display();
    }
}

