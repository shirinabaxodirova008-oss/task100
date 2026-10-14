package task100;

public class task124 {
    void yechim() {
        int[] sonlar = {3, 4, 3, 5, -9};
        int soni = 0;
        int i = 0;
        while (sonlar[i] > 0) {
            soni++;
            i++;
        }
        System.out.println(soni);
    }

    public static void main(String[] args) {
        task124 obj = new task124();
        obj.yechim();
    }
}
