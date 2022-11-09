package dio.mundim.junit.assertions;

import dio.mundim.junit.Pessoa;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

// Importação estática para não precisar utilizar o prefixo Assertions.
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void validarLancamentos(){

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};
        int[] terceiroLancamento = {-1, 10, 90, 17, 32};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
        assertNotEquals(primeiroLancamento, terceiroLancamento);
        assertNotEquals(segundoLancamento, terceiroLancamento);
    }

    @Test
    void validarSeObjetoEhNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Marco", LocalDate.of(2001, 1, 1));
        assertNotNull(pessoa);
    }

}
