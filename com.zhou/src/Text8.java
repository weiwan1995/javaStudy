import java.util.Arrays;
import java.util.Scanner;

public class Text8 {
    public static void main(String[] args) {
        int renshu = 5;
        int[] arr = new int[renshu];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < renshu; i++) {
            System.out.println("第" + (i + 1) + "位评委的评分");
            arr[i] = scanner.nextInt();
        }
        System.out.println("打印所有评委的分数");
        System.out.println(Arrays.toString(arr));
        System.out.println(getAvg(arr));
    }

    public static int getMin(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int getSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            }
        return sum;
    }

    public static double getAvg(int[] arr){
        double avg= (getSum(arr)-getMax(arr)-getMin(arr))*1.0/ (arr.length-2);
        return avg;


    }
}

