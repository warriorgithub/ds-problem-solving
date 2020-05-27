package linkedlist;

import java.util.Arrays;

class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
}
public class ListOp {
    public static Node head;
    public Node add(int val){
        Node currentNode=null;
        Node node = new Node(val);
        if(head==null) head= node;
        else{
            currentNode = head;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        return currentNode;
    }

    public void display(Node node){
        if(node==null) System.out.println("List is empty");
        else{
            while(node!=null){
                System.out.print(node.val);
                System.out.print("->");
                node =  node.next;
            }
        }
    }

    public Node reverseLinkedList(Node head){
        Node next=null;
        Node prev=null;
        Node current=null;
        if(head!=null){
            current =  head;
            prev = current;
            next = current.next;
            current.next = null;
            while(next!=null){
                current = next;
                next = current.next;
                current.next =  prev;
                prev = current;
            }
        }
        return prev;
    }

    public void deleteNode(Node node){

    }

    public static void main(String[] args) {
        ListOp op = new ListOp();
        op.add(10);
        op.add(20);
        op.add(30);
        op.add(40);
        op.display(head);
        System.out.println();
        System.out.println("After Reverse");
        op.display(op.reverseLinkedList(head));
        op.deleteNode(head);
    }
}
