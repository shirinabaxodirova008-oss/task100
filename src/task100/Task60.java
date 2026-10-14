package task100;

public class Task60 {

        static private int n = 45;
        static private int k = 23;
        static int Butunqoldiq () {
            int natija = 0;
            while (n >= k) {
                n = n - k;
                natija++;
            }
            return natija;
        }
        static int qoldiq () {
            while (n >= k) {
                n = n - k;
            }
            return n;
        }
    }

