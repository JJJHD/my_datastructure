package T3;

/**
 * 八皇后
 */
public class Test3 {

    static int[][] map = new int[8][8];
    static int count = 0;
    public static void main(String[] args) {
        play(0);
    }

    static void show(int[][] map){
        count++;
        System.out.println("show the count["+count+"]");
        for (int i = 0;i < 8;i++){
            for (int j = 0;j < 8;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    //棋盘校验，从上往下，从左往右
    static boolean check(int row,int col){
        //正上方
        for (int i = row - 1;i >= 0;i--){
            if (map[i][col] == 1)return false;
        }
        //左斜上方
        for (int i = row - 1,j = col - 1;i >= 0 && j >= 0;i--,j--){
            if (map[i][j] == 1)return false;
        }
        //右斜上方
        for (int i = row - 1,j = col + 1;i >= 0 && j < 8;i--,j++){
            if (map[i][j] == 1)return false;
        }
        return true;
    }

    static void play(int row){
        for (int i = 0;i < 8;i++){
            if (check(row,i)){
                map[row][i] = 1;

                if (row == 7){
                    show(map);
                    map[row][i] = 0;
                }else {
                    play(row + 1);
                    map[row][i] = 0;
                }
            }
        }
    }

}
