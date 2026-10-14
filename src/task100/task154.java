package task100;

public class task154 {
    boolean kabisa(int yil) {
        return (yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0;
    }

    void yechim() {
        int yil = 2024;
        System.out.println(kabisa(yil));
    }

    public static void main(String[] args) {
        task154 obj = new task154();
        obj.yechim();
    }
}
