public class MyHashSet {
    static final int capacity = 10000;
    Node[] arr = new Node[capacity];

    public void add(int key) {
        int index = key % capacity;
        if(arr[index] != null){
            Node curr = arr[index];
            while(curr != null){
                if(curr.value == key) return;
                if(curr.next == null) break;
                curr = curr.next;
            }
            Node nodeToAdd = new Node(key);
            curr.next = nodeToAdd;
            nodeToAdd.prev = curr;
        }else{
            Node nodeToAdd = new Node(key);
            arr[index] = nodeToAdd;
        }
    }

    public void remove(int key) {
        int index = key % capacity;
        if(arr[index] != null){
            Node curr = arr[index];
            while(curr != null){
                if(curr.value == key){
                    Node prev = curr.prev;
                    Node next = curr.next;
                    if(prev != null){
                        prev.next = next;
                    }
                    if(next != null){
                        next.prev = prev;
                    }
                    if(prev == null){
                        arr[index] = next;
                    }
                    return;
                }
                curr = curr.next;
            }
        }
    }

    public boolean contains(int key) {
        int index = key % capacity;
        if(arr[index] != null){
            Node curr = arr[index];
            while(curr != null){
                if(curr.value == key){
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }else{
            return false;
        }
    }
}



