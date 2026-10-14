package task100;

public class task165 {
    void yechim() {
        String str = "foundation";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task165 obj = new task165();
        obj.yechim();
    }
}
