import java.util.Scanner;

public class mes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de um mês: ");
        String mes = scanner.nextLine().toLowerCase(); 

        switch (mes) {
            case "janeiro":
            case "fevereiro":
            case "março":
            case "abril":
            case "maio":
            case "junho":
                System.out.println("Primeiro semestre");
                break;
            case "julho":
            case "agosto":
            case "setembro":
            case "outubro":
            case "novembro":
            case "dezembro":
                System.out.println("Segundo semestre");
                break;
            default:
                System.out.println("Mês inválido!");
        }

        scanner.close();
    }
}
