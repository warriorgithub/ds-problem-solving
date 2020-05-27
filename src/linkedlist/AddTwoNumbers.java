package linkedlist;

import java.awt.*;

public class AddTwoNumbers {
    public static Node addTwoNumbers(Node list1, Node list2){
    if(list1==null && list2==null) return new ListOp().add(0);
    String sum1 = "";
    String sum2 = "";
    while(list1!=null){
        sum1+=list1.val;
        list1 = list1.next;
    }while(list2!=null){
        sum2+=list2.val;
        list2 = list2.next;
    }
        int total = Integer.parseInt(sum1)+Integer.parseInt(sum2);
        String str = String.valueOf(total);
        Node newNode = createNewList(str);
        Node reversNode = new ListOp().reverseLinkedList(newNode);
    return reversNode;
    }

    private static Node createNewList(String str){
        int i=0;
        ListOp.head = null;
        while(i<str.length()){

            new ListOp().add(Integer.parseInt(String.valueOf(str.charAt(i))));
            i++;
        }
        System.out.println(ListOp.head);
        return ListOp.head;
    }
    public static void main(String[] args) {
        ListOp list1 = new ListOp();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        list1.display(ListOp.head);
        Node nodeList1 = ListOp.head;
        System.out.println();
        ListOp list2 = new ListOp();
        ListOp.head = null;
        list2.add(5);
        list2.add(6);
        list2.add(4);
        list2.display(ListOp.head);
        Node nodeList2 = ListOp.head;

        Node node = addTwoNumbers(nodeList1,nodeList2);
        new ListOp().display(node);

    }
}
