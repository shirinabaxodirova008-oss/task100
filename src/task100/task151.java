package task100;

public class task151 {
    void yechim() {
        String str = "a78rDfrttsd54";
        int soni = 0;
        for (int i = 0; i < str.length() && soni < 4; i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                System.out.print(c + " ");
                soni++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task151 obj = new task151();
        obj.yechim();
    }
}
