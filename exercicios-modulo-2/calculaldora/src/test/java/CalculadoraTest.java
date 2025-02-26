import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    void testeSoma_DeveRetornarSomaDeDoisNumeros() {
        // Arrange
        double a = 5.0;
        double b = 3.0;

        // Act
        double resultado = calculadora.soma(a, b);

        // Assert
        assertEquals(8.0, resultado, "A soma de 5.0 e 3.0 deve ser 8.0");
    }

    @Test
    void testeSubtracao_DeveRetornarSubtracaoDeDoisNumeros() {
        // Arrange
        double a = 10.0;
        double b = 4.0;

        // Act
        double resultado = calculadora.subtracao(a, b);

        // Assert
        assertEquals(6.0, resultado, "A subtração de 10.0 e 4.0 deve ser 6.0");
    }

    @Test
    void testeMultiplicacao_DeveRetornarMultiplicacaoDeDoisNumeros() {
        // Arrange
        double a = 7.0;
        double b = 6.0;

        // Act
        double resultado = calculadora.multiplicacao(a, b);

        // Assert
        assertEquals(42.0, resultado, "A multiplicação de 7.0 e 6.0 deve ser 42.0");
    }

    @Test
    void testeDivisao_DeveRetornarDivisaoDeDoisNumeros() {
        // Arrange
        double a = 20.0;
        double b = 4.0;

        // Act
        double resultado = calculadora.divisao(a, b);

        // Assert
        assertEquals(5.0, resultado, "A divisão de 20.0 por 4.0 deve ser 5.0");
    }

    @Test
    void testeResto_DeveRetornarRestoDaDivisaoDeDoisNumeros() {
        // Arrange
        double a = 10.0;
        double b = 3.0;

        // Act
        double resultado = calculadora.resto(a, b);

        // Assert
        assertEquals(1.0, resultado, "O resto da divisão de 10.0 por 3.0 deve ser 1.0");
    }

    @Test
    void testePotencia_DeveRetornarPotenciaDeBaseEExpoente() {
        // Arrange
        double base = 2.0;
        double expoente = 3.0;

        // Act
        double resultado = calculadora.potencia(base, expoente);

        // Assert
        assertEquals(8.0, resultado, "2 elevado a 3 deve ser 8.0");
    }

    @Test
    void testeDivisao_DeveExibirMensagemQuandoDivisorForZero() {
        // Arrange
        double a = 10.0;
        double b = 0.0;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        double resultado = calculadora.divisao(a, b);

        // Assert
        assertEquals(Double.POSITIVE_INFINITY, resultado, "Divisão por zero deve retornar infinito positivo");
        assertTrue(outContent.toString().contains("Não pode dividir por zero"), "Deve exibir a mensagem 'Não pode dividir por zero'");

        // Cleanup
        System.setOut(System.out);
    }

    @Test
    void testeResto_DeveExibirMensagemQuandoDivisorForZero() {
        // Arrange
        double a = 10.0;
        double b = 0.0;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        double resultado = calculadora.resto(a, b);

        // Assert
        assertTrue(Double.isNaN(resultado), "Resto por zero deve retornar NaN");
        assertTrue(outContent.toString().contains("Não pode dividir por zero"), "Deve exibir a mensagem 'Não pode dividir por zero'");

        // Cleanup
        System.setOut(System.out);
    }

    @Test
    void testePotencia_DeveRetornarUmQuandoExpoenteForZero() {
        // Arrange
        double base = 5.0;
        double expoente = 0.0;

        // Act
        double resultado = calculadora.potencia(base, expoente);

        // Assert
        assertEquals(1.0, resultado, "Qualquer número elevado a 0 deve ser 1.0");
    }

    @Test
    void testePotencia_DeveRetornarZeroQuandoBaseForZeroEExpoenteMaiorQueZero() {
        // Arrange
        double base = 0.0;
        double expoente = 5.0;

        // Act
        double resultado = calculadora.potencia(base, expoente);

        // Assert
        assertEquals(0.0, resultado, "0 elevado a qualquer número maior que 0 deve ser 0.0");
    }
}