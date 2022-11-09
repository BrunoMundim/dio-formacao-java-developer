package dio.mundim.junit.basics;

import dio.mundim.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa pessoa = new Pessoa("Rodrigo", LocalDate.of(2001, 1, 1));
        Assertions.assertEquals(21, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa1 = new Pessoa("Rodrigo", LocalDate.of(2004, 1, 1));
        Assertions.assertTrue(pessoa1.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("João", LocalDate.of(2009, 1, 1));
        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
    }

}
