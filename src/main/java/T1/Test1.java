package T1;

/**
 * 大数运算
 * 求阶层
 * 借助数组的进位与留位
 */
public class Test1 {

    public static void main(String[] args) {
        int[] ints = {1,7,5};
        int num = 175;
        int[] data = new int[500];
        data[data.length - 1] = 1;
        for (int i = 1;i <= num; i++){
            data = demo(data,i);
        }
        for (int i = 0;i < data.length;i++){
            System.out.print(data[i]);
        }
    }

    public static int[] demo(int[] ints,int num){
        //计算每位相乘的值
        for (int i = 0;i < ints.length;i++){
            ints[i]*=num;
        }

        for (int i = ints.length - 1;i > 0; i--){
            ints[i - 1] += ints[i]/10;//进位
            ints[i] = ints[i] % 10;//留位
        }
        return ints;
    }


}
