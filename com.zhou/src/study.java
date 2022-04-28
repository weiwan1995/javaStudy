import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


//        // 正序
//        for (int i = 0; i < arr.length    ; i++) {
//            System.out.println(i + "  " + arr[i]);
//        }
//
//
//
//        //逆序
//        for (int i = arr.length - 1 ; i>=0 ; i--) {
//            System.out.println(i + "  " + arr[i]);
//        }
//
//
//        // 拷贝
//        int[] arrB = new int[arrA.length];
//        for (int i = 0; i < arrA.length; i++) {
//            arrB[i] = arrA[i];
//        }
//        System.out.println(Arrays.toString(arrB));
//
//        // 倒叙
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arrB[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//        System.out.println(Arrays.toString(arrB));


//        //取最大值
//        public static int getMax(int[] arr)
//        if (arr==null || arr.length==0){
//            throw new RuntimeException("数组数据有问题");
//        }
//        int max=arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;


//        //取最小值
//        public static int getMin(int[] arr)
//        if (arr==null || arr.length==0){
//        throw new RuntimeException("数组数据有问题");
//        }
//        int min=arr[0];
//        for (int i = 1; i < arr.length; i++) {
//        if (arr[i]<min){
//            min=arr[i];
//        }
//        }
//        return min;


//        //求和
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//        sum+=arr[i];
//         }
//        return sum;


//         去除最大及最小后求平均值
//         if (arr==null || arr.length==0){
//         throw new RuntimeException("数组数据有问题");
//          }
//         double avg=   (getSum(arr)-getMax(arr)-getMin(arr))*1.0/( arr.length-2);
//         return avg;

//          随机生成数字
//           Random random = new Random();
//           int number = random.nextInt();
//          键盘输入数字
//           Scanner scanner=new Scanner(System.in);
//           int number= scanner.nextInt();



//          int[] srcArr ;
//          int[] destArr   ;
//        第一个参数： 原数组
//        第二个参数：原数组开始开始拷贝的位置
//        第3参数： 目标数组
//        第4参数： 目标数组开始拷贝的位置
//        第5参数：原数组拷贝的长度
//        System.arraycopy(srcArr ,0 ,destArr ,0 , 5 );
//
//

//          int[] srcArr = new int[]{1,2,3,4,5}
////        放大数组
//        int[] newArr1 = Arrays.copyOf(srcArr, 8);
//          缩小数组
//        int[] newArr2 = Arrays.copyOf(srcArr, 2);

//        System.out.println(Arrays.toString(newArr1));
//        System.out.println(Arrays.toString(newArr2));
//
////        往srcArr的尾部插入一个元素，引用写回srcArr
//        srcArr = Arrays.copyOf(srcArr, srcArr.length+ 1);
////        尾部放入一个值
//        srcArr[srcArr.length - 1] = 99 ;
//        System.out.println(Arrays.toString(srcArr));
//    }
//}        冒泡排序
//              外层控制的是轮数
//        for (int k = 0; k < arr.length -1 ; k++) {
////            内层控制的是当前这一轮中的两两元素的比较
//            for (int i = 0; i < arr.length -1 -k ; i++) {
////            如果当前元素比后一个元素还要大，则让这个大的（前面）的交换到后面去
//                if (arr[i] > arr[i+1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//    }

//         二维数组的遍历
//        // 第一维
//        for (int i = 0; i < binary.length; i++) {
//            // 第二维
//            for (int j = 0; j < binary[i].length; j++) {
//                System.out.println("binary[" + i + "][" + j + "]=" + binary[i][j]);
//            }
//        }
//        面向对象 封装 继承 多态
//        封装 基础写法 类(属性 方法)   本质是让类写的标准
