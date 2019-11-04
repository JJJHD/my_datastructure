package T2;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.set(2,"4");
        System.out.println("size["+list.size+"]");
        for (int i = 0;i < list.size;i++){
            System.out.print(list.get(i) + ", ");
        }
//        list.clear();
        list.removeAt(5);
        System.out.println("size["+list.size+"]");

        for (int i = 0;i < list.size;i++){
            System.out.print(list.get(i) + ", ");
        }
    }
}
