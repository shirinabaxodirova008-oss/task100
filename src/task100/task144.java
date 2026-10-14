package task100;

public class task144 {
    void yechim() {
        String str = "13553";
        int soni = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '5') soni++;
        }
        System.out.println(soni);
    }

    public static void main(String[] args) {
        task144 obj = new task144();
        obj.yechim();
    }
}
