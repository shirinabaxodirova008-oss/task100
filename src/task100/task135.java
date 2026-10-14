package task100;

public class task135 {
    void yechim() {
        String str = "C++ lang**23sdsd*";
        int soni = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '*') soni++;
        }
        System.out.println(soni);
    }

    public static void main(String[] args) {
        task135 obj = new task135();
        obj.yechim();
    }
}
