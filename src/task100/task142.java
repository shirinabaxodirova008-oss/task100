package task100;

public class task142 {
    void yechim() {
        String str = "ANOR va OLMA";
        int soni = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'A') soni++;
        }
        System.out.println(soni);
    }

    public static void main(String[] args) {
        task142 obj = new task142();
        obj.yechim();
    }
}
