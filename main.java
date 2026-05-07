import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        boolean tub = true;

        System.out.print("Son kiriting: ");
        n = sc.nextInt();

        if (n < 2) {
            tub = false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                tub = false;
                break;
            }
        }

        if (tub) {
            System.out.println("Tub son");
        } else {
            System.out.println("Tub emas");
        }

    }
}
