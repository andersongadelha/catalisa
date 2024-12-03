public class main {
    public static void main(String[] args) {
        double primeiroNumero = 12;
        double segundoNumero = 2;
        /*
        *-----Operações-----
        *
        * 1 - Soma
        * 2 - Subtração
        * 3 - Multiplicação
        * 4 - Divisão
        * 5 - Resto
        *
        * */
        int operacao = 6;
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
