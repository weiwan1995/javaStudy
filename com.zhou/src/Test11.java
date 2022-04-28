import java.util.Scanner;

/**
 * 全班有x个人（x从控制台接收），定义一个成绩数组，
 * 使用Scanner持续接收每个人的成绩
 * <p>
 * 获取出全班最高和最低的成绩（请使用数组排序的方式完成该功能的实现）
 */
public class Test11 {
    public static void main(String[] args) {

        // 1.得到学生人数
        int num = getStuNum();
        // 2.定义一个成绩数组
        int[] scores = new int[num];

        sort(scores);
    }

    private static int getStuNum() {
        System.out.println("请输入学生人数:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * 使用Scanner持续接收每个人的成绩
     *
     * @param scores
     */
    public static void sort(int[] scores) {
        System.out.println("请依次输入学生成绩:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            int score = scanner.nextInt();
            scores[i] = score;
        }
        // 排序
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[i])
                    swap(scores, i, j);
            }
        }
        // 获取出全班最高和最低的成绩
        System.out.println(scores[0]);
        System.out.println(scores[scores.length-1]);
    }

    private static void swap(int[] scores, int i, int j) {
        int temp = scores[i];
        scores[i] = scores[j];
        scores[j] = temp;
    }

}
