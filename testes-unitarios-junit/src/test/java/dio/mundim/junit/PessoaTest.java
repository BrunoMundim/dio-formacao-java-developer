package dio.mundim.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("Bruno Mundim", LocalDate.of(2001, 2, 8));
        Assertions.assertEquals(21, pessoa.getIdade());
    }

}
