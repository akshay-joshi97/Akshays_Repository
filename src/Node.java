public class Node{
    int value;
    Node next;
    Node prev;
    public Node(int value){
        this.value = value;
    }
    public Node(int value, Node next, Node prev){
        this.prev = prev;
        this.next = next;
        this.value = value;
    }
}
