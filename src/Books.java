import java.util.InputMismatchException;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titulo = "";
        String autor = "";
        int paginas = 0;
        float nota = 0;

        try {
            System.out.println("Digite o título do livro: ");
            titulo = scanner.nextLine();

            System.out.println("Digite o autor do livro: ");
            autor = scanner.nextLine();

            do {
                try {
                    System.out.print("Digite a quantidade de páginas do livro: ");
                    paginas = scanner.nextInt();
                    if (paginas <= 0) {
                        System.out.println("O número de páginas deve ser maior que zero. Tente novamente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Digite um número inteiro para o número de páginas.");
                    scanner.nextLine();
                    paginas = -1;
                }
            } while (paginas <= 0);

            do {
                try {
                    System.out.print("Digite a nota do livro (entre 0 e 10): ");
                    nota = scanner.nextFloat();
                    if (nota < 0 || nota > 4) {
                        System.out.println("A nota deve estar entre 0 e 5. Tente novamente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Use '.' para separar as casas decimais da nota.");
                    scanner.nextLine();
                    nota = -1;
                }
            } while (nota < 0 || nota > 5);

            scanner.nextLine();

            System.out.println("\nDetalhes do livro:");
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Páginas: " + paginas);
            System.out.println("Nota: " + nota);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado. Tente novamente.");
        } finally {
            scanner.close();
        }
    }
}
