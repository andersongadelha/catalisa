import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Digite o primeiro numero: ");
        double primeiroNumero = obterDoubleValido(scanner);
        System.out.println("Digite o segundo numero: ");
        double segundoNumero = obterDoubleValido(scanner);

        System.out.println("Digite um numero referente a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Resto");
        System.out.println("6 - Potencia");
        int operacao = obterOperacaoValida(scanner);

        try {
            double resultado = switch (operacao) {
                case 1 -> calculadora.soma(primeiroNumero, segundoNumero);
                case 2 -> calculadora.subtracao(primeiroNumero, segundoNumero);
                case 3 -> calculadora.multiplicacao(primeiroNumero, segundoNumero);
                case 4 -> calculadora.divisao(primeiroNumero, segundoNumero);
                case 5 -> calculadora.resto(primeiroNumero, segundoNumero);
                case 6 -> calculadora.potencia(primeiroNumero, segundoNumero);
                default -> throw new IllegalArgumentException("Operação inválida");
            };
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static double obterDoubleValido(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.next();
            }
        }
    }

    private static int obterOperacaoValida(Scanner scanner) {
        while (true) {
            try {
                int operacao = scanner.nextInt();
                if (operacao >= 1 && operacao <= 6) {
                    return operacao;
                } else {
                    System.out.println("Operação inválida. Por favor, escolha um número entre 1 e 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro entre 1 e 6.");
                scanner.next();
            }
        }
    }
}