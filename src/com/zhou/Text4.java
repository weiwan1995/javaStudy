import com.sun.deploy.security.SelectableSecurityManager;

public class Text4 {
    public static void main(String[] args) {
        System.out.println(count(300));

    }

    public Text4() {
        super();
    }

    public static double count(double a) {
        if (a < 100) {
            return a;
        } else if (a >= 100 && a <= 199) {
            return a * 0.95;
        } else {
            return a * 0.85;
        }
    }
}
