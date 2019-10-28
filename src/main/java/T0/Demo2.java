package T0;

/**
 * 快速排序
 * 确定标杆
 * 两边同时进行
 * 左边比标杆大的扔右边
 * 右边比标杆小的扔左边
 * 左边下标小于右边
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] ints = {6,3,8,2,4,5,9,7,1};
        sort(ints,0,ints.length - 1);
        for (int i = 0;i < ints.length;i++){
            System.out.print(ints[i]+", ");
        }
    }

    static void sort(int[] ints,int s,int e){
        if (s < e){
            int index = sortUnit(ints,s,e);
            sort(ints,s,index - 1);
            sort(ints,index + 1,e);
        }
    }

    static int sortUnit(int[] ints,int s,int e){
        int temp = ints[s];
        int j = e;
        int i = s;
        while (i < j){
            while (i < j){
                if (ints[j] < temp){
                    ints[i] = ints[j];
                    break;
                }
                j--;
            }
            while (i < j){
                if (ints[i] >= temp){
                    ints[j] = ints[i];
                    break;
                }
                i++;
            }
        }
        ints[i] = temp;
        return i;
    }

}
