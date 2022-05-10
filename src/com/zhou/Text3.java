public class Text3 {
    public static void main(String[] args) {
        System.out.println(num(3));
        System.out.println(num(8));
//        有一对兔子，从出生后第3个月起每个月都生一对兔子，
//        小兔子长到第三个月后每个月又生一对兔子，
//        假如兔子都不死，问每个月的兔子总数为多少？
    }
    public static int num(int x){
        if(x==1||x==2){
            return 1;
        }
        return num(x-2)+num(x-1);
    }


}

