public class LinkedListUtil{

 public static int length(LinkedList value) {
        int count = 0;
        Node current = value.getFront();
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }


    public static int search(LinkedList value, int data) {
        int index = 0;
        Node current = value.getFront();
        while (current != null) {
            if (current.getData() == data){
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }


    public static Node getNode(LinkedList value, int index) {
        Node current = value.getFront();
        int count = 0;
        while (current != null) {
            if (count == index){
                return current;
            }
            current = current.getNext();
            count++;
        }
        return null;
    }


    public static int count(LinkedList value, int data) {
        int count = 0;
        Node current = value.getFront();
        while (current != null) {
            if (current.getData() == data){ 
                count++;
            }
            current = current.getNext();
        }
        return count;
    }


    public static boolean compare(LinkedList value1, LinkedList value2) {
        Node current1 = value1.getFront();
        Node current2 = value2.getFront();
        while (current1 != null && current2 != null) {
            if (current1.getData() != current2.getData()){
                return false;
            }
            current1 = current1.getNext();
            current2 = current2.getNext();
        }
        return current1 == null && current2 == null;
    }


 public static LinkedList reverse(LinkedList value) {
    LinkedList reversed = new LinkedList();
    Node current = value.getFront();
    while (current != null) {
        Node newNode = new Node(current.getData());
        reversed.insertFront(newNode);
        current = current.getNext();
    }
    return reversed;



}
}