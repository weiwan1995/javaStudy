public class Circle {
    // 定义⚪的半径
    private int r;
    // 定义⚪的面积
    int area;
    
    public void setR(int r) {
        this.r = r;
    }

    double getArea() {
        // 计算面积 公式是ΠR的平方
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        // 1.进行长度的赋值
        circle1.setR(10);
        // 2.得到面积
        System.out.println(circle1.getArea());
    }
}
