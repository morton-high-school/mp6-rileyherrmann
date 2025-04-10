public class LinkedList{
     private Node head;


    public LinkedList() {
        this.head = null;
    }


    public Node getFront() {
        return head;
    }


    public void append(Node node) {
        if (head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
    }


    public void insert(Node node, int index) {
        if (index <= 0 || head == null) {
            node.setNext(head);
            head = node;
            return;
        }
        Node current = head;
        int count = 0;
        while (current.getNext() != null && count < index - 1) {
            current = current.getNext();
            count++;
        }
        node.setNext(current.getNext());
        current.setNext(node);
    }


    public Node remove(int index) {
        if (head == null || index < 0) {
            return null;
        }
        if (index == 0) {
            Node removed = head;
            head = head.getNext();
            return removed;
        }
        Node current = head;
        int count = 0;
        while (current.getNext() != null && count < index - 1) {
            current = current.getNext();
            count++;
        }
        if (current.getNext() == null){
            return null;
        }
        Node removed = current.getNext();
        current.setNext(removed.getNext());
        return removed;
    }


  public String toString() {
    if (head == null) {
        return "There are no items in this list.";
    }
    String result = "";
    Node current = head;
    int index = 0;
    while (current != null) {
        result += "Index: " + index + " Data: " + current.getData() + "\n";
        current = current.getNext();
        index++;
    }
    return result;
    }


    public void insertFront(Node node) {
        node.setNext(head);
        head = node;
    }


}