package T0;

/**
 * 堆排序
 * 建立大顶堆
 * 父节点
 * 儿子节点
 * 默认 左儿子节点最大
 * 若 右儿子节点 比左儿子节点大 则交换
 * 儿子节点和父节点比较 父节点确保最大
 *
 */
public class Demo {
    public static void main(String[] args) {
        int[] ints = {6,2,8,4,7,3,9,5,1};//9
        int size = ints.length;
        while (size > 2){
            for (int i = (size - 1)/2;i >= 1;i--){
                int maxIndex = 2 * i;
                if (((maxIndex + 1) < size) && (ints[maxIndex + 1] > ints[maxIndex])){
                    maxIndex++;
                }
                if (ints[maxIndex] > ints[i]){
                    int temp = ints[maxIndex];
                    ints[maxIndex] = ints[i];
                    ints[i] = temp;
                }
            }
            int data = ints[1];
            ints[1] = ints[size - 1];
            ints[size - 1] = data;
            size--;
        }
        for (int i = 1;i < ints.length;i++){
            System.out.print(ints[i]+", ");
        }
    }
}
