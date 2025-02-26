import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testeSomaComEntradasValidas() {
        // Arrange
        String input = "5\n3\n1\n"; // Primeiro número: 5, Segundo número: 3, Operação: Soma (1)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Act
        Main.main(new String[]{});

        // Assert
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Resultado: 8.0"));
    }

    @Test
    void testeComEntradaInvalidaEDadosValidosEmSequencia() {
        // Arrange
        String input = "abc\n5\n3\n1\n"; // Entrada inválida para o primeiro número, depois entradas válidas
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Act
        Main.main(new String[]{});

        // Assert
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Entrada inválida. Por favor, insira um número válido."));
        assertTrue(consoleOutput.contains("Resultado: 8.0"));
    }

    @Test
    void testeComOperacaoInvalidaDepoisEntradaValida() {
        // Arrange
        String input = "5\n3\nabc\n7\n1\n"; // Entrada inválida para operação, depois entrada válida
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Act
        Main.main(new String[]{});

        // Assert
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Entrada inválida. Por favor, insira um número inteiro entre 1 e 6."));
        assertTrue(consoleOutput.contains("Resultado: 8.0"));
    }

    @Test
    void testeOperacaoForaDoIntervaloMapeadoDepoisEntradaValida() {
        // Arrange
        String input = "5\n3\n9\n1\n"; // Operação fora do intervalo permitido, depois entrada válida
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Act
        Main.main(new String[]{});

        // Assert
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Operação inválida. Por favor, escolha um número entre 1 e 6."));
        assertTrue(consoleOutput.contains("Resultado: 8.0"));
    }

    @Test
    void testeDivisaoPorZero() {
        // Arrange
        String input = "8\n0\n4\n"; // Primeiro número: 8, Segundo número: 0, Operação: Divisão (4)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Act
        Main.main(new String[]{});

        // Assert
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Não pode dividir por zero"));
    }

    @Test
    void testeRestoPorZero() {
        // Arrange
        String input = "10\n0\n5\n"; // Primeiro número: 10, Segundo número: 0, Operação: Resto (5)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Act
        Main.main(new String[]{});

        // Assert
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Não pode dividir por zero"));
    }

    @Test
    void testePotencia() {
        // Arrange
        String input = "2\n3\n6\n"; // Primeiro número: 2, Segundo número: 3, Operação: Potência (6)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Act
        Main.main(new String[]{});

        // Assert
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Resultado: 8.0"));
    }
}