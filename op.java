import java.util.Scanner;

public class op {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (a): ");
        int a = scanner.nextInt();

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = scanner.next().charAt(0);


        System.out.print("Digite o segundo número (b): ");
        int b = scanner.nextInt();

        switch (op) {
            case '+':
                System.out.println("Resultado: " + (a + b));
                break;
            case '-':
                System.out.println("Resultado: " + (a - b));
                break;
            case '*':
                System.out.println("Resultado: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Resultado: " + ((double) a / b));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }

        scanner.close();
    }
}
