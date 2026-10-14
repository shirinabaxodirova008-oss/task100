package task100;

public class task140 {
    boolean natural(double x) {
        return x > 0 && Math.floor(x) == x;
    }

    void yechim() {
        double x = 5.0;
        if (natural(x)) {
            System.out.println("Natural son");
        } else {
            System.out.println("Natural son emas");
        }
    }

    public static void main(String[] args) {
        task140 obj = new task140();
        obj.yechim();
    }
}
