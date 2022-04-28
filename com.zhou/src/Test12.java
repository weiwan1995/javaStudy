import java.util.Random;

public class Test12 {
    public static void main(String[] args) {
        // 定义一个数组
        int[][] ints = new int[3][3];

        // 数组赋值
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = new Random().nextInt(10);
            }
        }

        // 定义最大值和最小值
        int min = ints[0][0];
        int max = ints[0][0];

        // 遍历数组
        for (int[] anInt : ints) {
            for (int i : anInt) {
                min = Math.min(i, min);
                max = Math.max(i, min);
            }
        }

        System.out.println("最小值为:" + min);
        System.out.println("最大值为:" + max);
    }
}
