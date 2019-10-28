package T0;

/**
 * 插入排序
 * 前面有序
 *
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] ints = {5,3,8,4,7,2,6};

        for (int i = 1;i < ints.length;i++){
            if (ints[i] < ints[i - 1]){
                for (int j = 0;j <= i - 1;j++){
                    if (ints[i] < ints[j]){
                        int temp = ints[i];
                        for (int k = i - 1;k >= j; k--){
                            ints[k + 1] = ints[k];
                        }
                        ints[j]  = temp;
                        break;
                    }
                }
            }
        }
        for (int i = 0;i < ints.length;i++){
            System.out.print(ints[i]+", ");
        }
    }
}
