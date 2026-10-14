package task100;

public class task164 {
    void yechim() {
        int n = 17;
        int k = 5;
        int butun = 0;
        while (n >= k) {
            n = n - k;
            butun = butun + 1;
        }
        System.out.println("Butun qism = " + butun);
        System.out.println("Qoldiq = " + n);
    }

    public static void main(String[] args) {
        task164 obj = new task164();
        obj.yechim();
    }
}
