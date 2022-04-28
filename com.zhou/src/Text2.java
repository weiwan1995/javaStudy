public class Text2 {
    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(sushu(8));

//        定义一个计算器；它的功能有 \
//        加,减,乘,除,累加,阶乘
//        求平方,求次方,判断一个数是否为素数；boolean（int）,
//        并写测试类来测试这个方法
    }
    public static  int add(int a,int b){
        return a+b;
    }
    public static  int subtract(int a,int b){
        return a-b;
    }
    public static  int multipiy(int a,int b){
        return a*b;
    }
    public static  double divide(double a,double b){
        if(b==0){
            throw new RuntimeException("b不能为0");
        }
        return a/b;
    }


    public static  int getSum(int num1, int num2){
        if (num1>num2){
            System.out.println("起始位不能大于末位");
        }
        int sum=0;
        for (int i = num1; i <= num2; i++) {
            sum+=i;
        }
        return sum;
    }
    public static  int factorial(int num){
        int sum=0;
        for (int i = num; i>0; i--) {
            sum*=i;
        }
        return sum;
    }
    public static  double   power2(double a){
        return Math.pow(a , 2) ;
    }
    public static  double   power3(double a){
        return Math.pow(a , 3) ;
    }
    public static boolean sushu(int a){
        for (int i = 2; i <= a-1; i++) {
            if (a%i == 0) {
                return false;
            }
        }
        return true;
    }

}