public class SinglyLinkedList{
    private Node head;
    public SinglyLinkedList(){
        this.head = null;
    }
    public Node add(int value){
        if (this.head ==null){
            this.head = new Node(value);
            return this.head;
        }
        Node pointer = this.head;

        while(pointer.next !=null){
            pointer = pointer.next;
        }
        
        pointer.next = new Node(value);
        return this.head;
    }
    public int[] displayvalues(){
        
    }
    public static void main(String[] args){
        SinglyLinkedList SLL = new SinglyLinkedList();
        SLL.add(12);
       System.out.println(SLL.Node);
    }

}