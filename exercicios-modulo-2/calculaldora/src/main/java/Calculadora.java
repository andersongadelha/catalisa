public class Calculadora {

    public double soma(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Não pode dividir por zero");
        }
        return a / b;
    }

    public double resto(double a, double b) {
        if (b == 0) {
            System.out.println("Não pode dividir por zero");
        }
        return a % b;
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}