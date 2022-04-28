import java.util.Arrays;
import java.util.Random;

public class Text7 {
    public static void main(String[] args) {

//        1、从1000个数中产生100个不重复的随机数放到一维数组
//            提示:Random r = new Random();
// 	         r.nextInt(1000) ;
        Random r = new Random();
        int arrLength = 100 ;
        int[] arr = new int[arrLength] ;
        for (int i = 0; i < arr.length;  ) {
            int random =  r.nextInt(1000) ;
//          判定一次这个random是否存在，如果存在，再来一次循环。如果不存在，直接放入当前位置
            boolean exist = isExist(arr, random);
            if (exist){
                continue;
            }
            arr[i] = random ;
            i++ ;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean isExist(int[] arr , int random){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == random) {
                return true ;
            }
        }
        return false ;
    }
}

