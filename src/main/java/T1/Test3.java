package T1;

/**
 * 二分查找
 * 不断切分
 */
public class Test3 {
    public static void main(String[] args) {
        int[] ints = {2,4,7,8,10,12,16,19,20};
        int num = 18;

        int s = 0;
        int e = ints.length - 1;
        int m = 0;

        while (s <= e){
            m = (s + e)/2;
            if (ints[m] < num){//查找的值在右边
                s = m + 1;
            }else if (ints[m] == num){
                System.out.println("找到 "+m);
                return;
            }else {//查找的值在左边
                e = m - 1;
            }
        }
        System.out.println("没找到 ");

    }
}
