package task100;

public class task145 {
    void yechim() {
        int[] sonlar = {12, -5, 40, 7, 0, 23};
        int min = sonlar[0];
        int max = sonlar[0];
        for (int i = 1; i < 6; i++) {
            if (sonlar[i] < min) min = sonlar[i];
            if (sonlar[i] > max) max = sonlar[i];
        }
        System.out.println("Eng kichigi = " + min);
        System.out.println("Eng kattasi = " + max);
    }

    public static void main(String[] args) {
        task145 obj = new task145();
        obj.yechim();
    }
}
