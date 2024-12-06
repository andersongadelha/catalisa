import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1 - Soma de Números
        Scanner scanner = new Scanner(System.in);
        int numero;
        int resultado = 0;
        System.out.println("Digite um numero para somar de 1 até:");
        numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            resultado = resultado + i;
        }
        System.out.println(resultado);

        // 2 - Fatorial
        System.out.println("Digite um numero para calcular o fatorial:");
        numero = scanner.nextInt();
        resultado = 1;
        do {
            resultado = resultado * numero;
            numero--;
        } while (numero > 1);
        System.out.println(resultado);

        // 3 - Contagem de Dígitos
        System.out.println("Digite um numero para receber a quantidade de dígitos:");
        numero = scanner.nextInt();
        String numeroString = String.valueOf(Math.abs(numero));
        System.out.println(numeroString.length());

        // 4 - Números Primos
        boolean primo = true;
        System.out.println("Digite um numero para saber se ele é primo:");
        numero = scanner.nextInt();
        if (numero < 2) {
            primo = false;
        } else {
            int divisoes = 0;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    divisoes++;
                }

                if (divisoes > 2) {
                    primo = false;
                    break;
                }
            }
        }
        System.out.println(primo);

        // 5 - Inversão de Número
        System.out.println("Digite um numero para ser invertido:");
        numero = scanner.nextInt();
        numeroString = String.valueOf(numero);
        String reverso = new StringBuilder(numeroString).reverse().toString();
        System.out.println(reverso);

        // 6 - Potência
        System.out.println("Digite um numero para calcular a potência:");
        numero = scanner.nextInt();
        int expoente;
        System.out.println("Digite um expoente a potência:");
        expoente = scanner.nextInt();
        resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= numero;
        }
        System.out.println(resultado);

        // 7 - Palíndromo
        System.out.println("Digite um numero para verificar se é palíndromo:");
        numero = scanner.nextInt();
        numeroString = String.valueOf(numero);
        reverso = new StringBuilder(numeroString).reverse().toString();
        System.out.println(numeroString.equals(reverso));

        // 8 - Múltiplos de um Número
        System.out.println("Digite um numero para retornar os multiplos:");
        numero = scanner.nextInt();
        int limite;
        System.out.println("Digite um numero para o limite dos multiplos:");
        limite = scanner.nextInt();
        for (int i = numero; i <= limite; i++) {
            if (i % numero == 0) {
                System.out.println(i);
            }
        }

        // 9 - Conversão de Binário para Decimal
        System.out.println("Digite um numero binario para retornar o valor decimal:");
        numeroString = scanner.nextLine();
        resultado = 0;
        int potencia = 0;
        for (int i = numeroString.length() - 1; i >= 0; i--) {
            char digito = numeroString.charAt(i);
            if (digito == '1') {
                resultado += Math.pow(2, potencia);
            }
            potencia++;
        }
        System.out.println(resultado);

        // 10 - Série de Fibonacci
    }

}