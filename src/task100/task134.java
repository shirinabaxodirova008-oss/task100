package task100;

public class task134 {
    void yechim() {
        int[] sonlar = {2, 3, 4, -4, 3, 0};
        int summa = 0;
        int i = 0;
        while (sonlar[i] != 0) {
            if (sonlar[i] > 0) summa += sonlar[i];
            i++;
        }
        System.out.println("Summa = " + summa);
    }

    public static void main(String[] args) {
        task134 obj = new task134();
        obj.yechim();
    }
}
