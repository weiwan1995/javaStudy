public class Student {
    String name;
    int age;
    double height;
    double weight;

    public void eat() {
        System.out.println("吃饭");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.age = 18;
        student.height = 1.8;
        student.weight = 150;
        student.eat();
    }

}
