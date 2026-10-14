package task100;

public class task159 {
    void yechim() {
        String str = "Salom Dunyo PDP";
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                natija += '*';
            } else {
                natija += c;
            }
        }
        System.out.println(natija);
    }

    public static void main(String[] args) {
        task159 obj = new task159();
        obj.yechim();
    }
}
