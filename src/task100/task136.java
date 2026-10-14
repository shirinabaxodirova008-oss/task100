package task100;

public class task136 {
    void yechim() {
        char c = 'H';
        if (c >= 'A' && c <= 'Z') {
            System.out.println("Katta harf");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("Kichik harf");
        } else {
            System.out.println("Harf emas");
        }
    }

    public static void main(String[] args) {
        task136 obj = new task136();
        obj.yechim();
    }
}
