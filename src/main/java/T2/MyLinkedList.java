package T2;

public class MyLinkedList {
    int size = 0;
    Node head = null;

    public int size(){
        return size;
    }

    public void add(Object value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        }else {
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    public void set(int index,Object value){
        if (index < 0 || index >= size){
            throw new RuntimeException("超出范围");
        }
        Node temp = head;
        for (int i = 0;i < index;i++){
            temp = temp.getNext();
        }
        temp.setValue(value);
    }

    public Object get(int index){
        if (index < 0 || index >= size){
            throw new RuntimeException("超出范围");
        }
        Node temp = head;
        for (int i = 0;i < index;i++){
            temp = temp.getNext();
        }
        return temp.getValue();
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void removeAt(int index){
        if (index < 0 || index >= size){
            throw new RuntimeException("超出范围");
        }
        Node temp = head;
        if (index == 0){
            head = head.getNext();
        }else {
            for (int i = 0;i < index - 1;i++){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        size--;
    }

}
