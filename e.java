import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos para calcular e: ");
        int termos = scanner.nextInt();

        double e = 0.0;

        for (int n = 0; n < termos; n++) {
            e += 1.0 / fatorial(n);
        }

        System.out.printf("O valor de e usando %d termos é: %.10f\n", termos, e);

        scanner.close();
    }

    public static long fatorial(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
