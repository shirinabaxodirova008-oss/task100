package task100;

import java.util.Scanner;

public class task61 {
    static Scanner ww = new Scanner(System.in);
        static void p101() {
            System.out.print("n = ");
            int n = ww.nextInt();
            if (n < 0) n = -n;
            boolean bor = false;
            do {
                if (n % 10 % 2 == 0) bor = true;
                n = n / 10;
            } while (n > 0);
            if (bor)
                System.out.println("Juft raqam bor");
            else
                System.out.println("Juft raqam yo'q");
        }
}
