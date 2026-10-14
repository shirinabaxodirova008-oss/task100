package task100;

public class task129 {
    void yechim() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        task129 obj = new task129();
        obj.yechim();
    }
}
