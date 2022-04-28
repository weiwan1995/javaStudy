import java.util.Arrays;
import java.util.Scanner;

public class Text9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 5;

        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("请输入需第" + (i + 1) + "个数字:");
            nums[i] = scanner.nextInt();
        }

        System.out.println("原始");
        System.out.println(Arrays.toString(nums));

        System.out.println("翻转后");
//        reverse(nums) ;
//        System.out.println(Arrays.toString(nums));

        reversePrint(nums) ;

    }
    public static void reversePrint(int[] arr){
        System.out.print("[");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i] );
            }else {
                System.out.print(arr[i] +",");
            }

        }
        System.out.print("]");
    }


//    public static void reverse(int[] arr){
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i] ;
//            arr[i] = arr[arr.length - 1- i] ;
//            arr[arr.length - 1- i] = temp ;
//        }
//    }
}
