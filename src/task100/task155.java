package task100;

public class task155 {
    Void yechim() {
        String str = "Java2026OOP";
        int raqam = 0;
        int kichik = 0;
        int katta = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') raqam++;
            else if (c >= 'a' && c <= 'z') kichik++;
            else if (c >= 'A' && c <= 'Z') katta++;
        }
        System.out.println("Raqamlar = " + raqam);
        System.out.println("Kichik harflar = " + kichik);
        System.out.println("Katta harflar = " + katta);
    }

    public static void main(String[] args) {
        task155 obj = new task155();
        obj.yechim();
    }
}
