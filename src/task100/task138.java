package task100;

public class task138 {
    void yechim() {
        String str = "FoundationF65-72";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task138 obj = new task138();
        obj.yechim();
    }
}
