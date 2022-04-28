import java.util.Scanner;
//定义一个方法,输出三个数,比大小
public class Text5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("三个数");
        int number1 = scanner.nextByte();
        int number2 = scanner.nextByte();
        int number3 = scanner.nextByte();
        System.out.println(bidaxiao((number1),(number2),(number3)));
    }
    public static int bidaxiao(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
