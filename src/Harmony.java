import java.util.Scanner;

public class Harmony {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int data, i, j, k, l;
        double total = 0;
        System.out.println("Sayı girin:");
        data = scn.nextInt();
        for (i = 1; i <= data; i++) {
            total += 1.0 / i;

        }
        System.out.println(total);

    }
}
