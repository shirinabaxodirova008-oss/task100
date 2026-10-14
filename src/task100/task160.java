package task100;

public class task160 {
    void yechim() {
        double a = 3;
        double b = 4;
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Gipotenuza = " + c);
        System.out.println("Yuza = " + a * b / 2);
        System.out.println("Perimetr = " + (a + b + c));
    }

    public static void main(String[] args) {
        task160 obj = new task160();
        obj.yechim();
    }
}
