package T4;

/**
 * 顺序二叉树的中序遍历
 * 有序
 */
public class Test {

    Node root;
    public void add(int value){
        Node newNode = new Node(value);
        if (root == null){
            root = newNode;
        }else {
            Node temp = root;
            while (true){
                if (value < temp.getValue()){//左边的值
                    if (temp.getLeft() == null){
                        temp.setLeft(newNode);
                        break;
                    }else {
                        temp = temp.getLeft();
                    }
                }else {//右边的值
                    if (temp.getRight() == null){
                        temp.setRight(newNode);
                        break;
                    }else {
                        temp = temp.getRight();
                    }
                }
            }
        }
    }

    public void show(){
        showNode(root);
    }

    public void showNode(Node pnode){
//        System.out.print(pnode.getValue()+" ");
        if (pnode.getLeft() != null){
            showNode(pnode.getLeft());
        }
//        System.out.print(pnode.getValue()+" ");
        if (pnode.getRight() != null){
            showNode(pnode.getRight());
        }
        System.out.print(pnode.getValue()+" ");
    }

    public static void main(String[] args) {
        Test tt = new Test();
        tt.add(5);
        tt.add(2);
        tt.add(7);
        tt.add(4);
        tt.add(6);
        tt.add(9);
        tt.add(3);
        tt.add(6);
        tt.add(8);
        tt.show();
    }

}
