package task100;

public class task141 {
    void yechim() {
        String str = "Salom";
        int indeks = 2;
        if (indeks >= 0 && indeks < str.length()) {
            System.out.println(str.charAt(indeks));
        } else {
            System.out.println("Bunday indeks yo'q");
        }
    }

    public static void main(String[] args) {
        task141 obj = new task141();
        obj.yechim();
    }
}
