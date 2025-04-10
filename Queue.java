public class Queue{ 
    private LinkedList list;


    public Queue() {
            this.list = new LinkedList();
    }


    public void add(Node item) {
        list.append(item);
    }


    public Node remove() {
        return list.remove(0);
    }


    public Node peek() {
        return list.getFront();
    }


    public boolean empty() {
        return list.getFront() == null;
    }


    public int search(Node item) {
        Node current = list.getFront();
        int index = 0;
        while (current != null) {
            if (current == item){ 
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }



}