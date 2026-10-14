package task100;

public class task127 {
    double yigindi(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        return s;
    }

    void yechim() {
        int n = 5;
        System.out.println("S = " + yigindi(n));
    }

    public static void main(String[] args) {
        task127 obj = new task127();
        obj.yechim();
    }
}
