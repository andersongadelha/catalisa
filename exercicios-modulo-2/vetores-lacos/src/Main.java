import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Laço for:");
        int[] numeros = {10, 21, 32, 43, 54};
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        System.out.println("Laço do/while:");
        int i = 0;
        do {
            System.out.println("Posição " + i + ": " + numeros[i]);
            i++;
        } while (i < 5);

        Scanner scanner = new Scanner(System.in);
        String nome;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascimento;
        System.out.println("Digite o seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite sua data de nascimento no formato dd/MM/yyyy: ");
        dataNascimento = scanner.nextLine();
        System.out.println(nome);
    }
}