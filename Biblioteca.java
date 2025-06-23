import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    String titulo;
    String autor;
    int ano;

    Livro(String titulo) {
        this.titulo = titulo;
        this.autor = "Autor desconhecido";
        this.ano = -1;
    }

    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = -1;
    }

    Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String toString() {
        if (ano == -1) {
            return "Título: " + titulo + ", Autor: " + autor;
        } else {
            return "Título: " + titulo + ", Autor: " + autor + ", Ano: " + ano;
        }
    }
}

public class Biblioteca {
    ArrayList<Livro> listaLivros = new ArrayList<>();

    void adicionarLivro(String titulo) {
        listaLivros.add(new Livro(titulo));
    }

    void adicionarLivro(String titulo, String autor) {
        listaLivros.add(new Livro(titulo, autor));
    }

    void adicionarLivro(String titulo, String autor, int ano) {
        listaLivros.add(new Livro(titulo, autor, ano));
    }

    void listarLivros() {
        if (listaLivros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado ainda.");
        } else {
            System.out.println("\n Livros cadastrados:");
            for (Livro l : listaLivros) {
                System.out.println("- " + l);
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n------ Menu Biblioteca ------");
            System.out.println("1 - Adicionar livro (apenas título)");
            System.out.println("2 - Adicionar livro (título e autor)");
            System.out.println("3 - Adicionar livro (título, autor e ano)");
            System.out.println("4 - Listar livros");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo1 = scanner.nextLine();
                    biblio.adicionarLivro(titulo1);
                    break;
                case 2:
                    System.out.print("Digite o título do livro: ");
                    String titulo2 = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor2 = scanner.nextLine();
                    biblio.adicionarLivro(titulo2, autor2);
                    break;
                case 3:
                    System.out.print("Digite o título do livro: ");
                    String titulo3 = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor3 = scanner.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int ano3 = scanner.nextInt();
                    scanner.nextLine(); 
                    biblio.adicionarLivro(titulo3, autor3, ano3);
                    break;
                case 4:
                    biblio.listarLivros();
                    break;
                case 0:
                    System.out.println("Saindo da biblioteca... ");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
