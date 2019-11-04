package T3;

import java.io.File;

/**
 * 遍历文件夹输出文件名
 */
public class Test {
    public static void main(String[] args) {
        play(new File("/Volume"));
    }
    static void play(File file){
        File[] files = file.listFiles();
        for (int i = 0;i < files.length;i++){
            if (files[i].isFile()){
                System.out.println("f name is ["+files[i].getName()+"]");
            }else {
                play(files[i]);
            }
        }
    }
}
