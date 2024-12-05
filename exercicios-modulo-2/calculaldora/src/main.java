import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double primeiroNumero;
        double segundoNumero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        primeiroNumero = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        segundoNumero = scanner.nextDouble();

        System.out.println("Digite um numero referente a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Resto");
        int operacao;
        operacao = scanner.nextInt();
        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = primeiroNumero + segundoNumero;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = primeiroNumero - segundoNumero;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = primeiroNumero * segundoNumero;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if(segundoNumero == 0) {
                    System.out.println("Erro: não pode dividir por zero");
                } else {
                    resultado = primeiroNumero / segundoNumero;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            case 5:
                if(segundoNumero == 0) {
                    System.out.println("Erro: não pode dividir por zero");
                } else {
                    resultado = primeiroNumero % segundoNumero;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Erro: Operação inválida");
        }
    }
}
