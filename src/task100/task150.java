package task100;

public class task150 {
    void yechim() {
        String str = "Salom Dunyo";
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);   // ASCII da kichik va katta harf orasidagi farq 32
            }
            natija += c;
        }
        System.out.println(natija);
    }

    public static void main(String[] args) {
        task150 obj = new task150();
        obj.yechim();
    }
}
