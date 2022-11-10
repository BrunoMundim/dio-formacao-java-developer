package dio.mundim;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Uberlândia", "Umuarama", "Rua Doutor Luiz", "1420", "Apto. 102 Bloco A");

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(dadosLocalizacao);

        Pessoa pessoa = cadastrarPessoa.CadastrarPessoa("Bruno Mundim", "123.456.789-10", LocalDate.of(2001, 1, 1), "38405-327");

        DadosLocalizacao enderecoPessoa = pessoa.getEndereco();
        assertEquals(dadosLocalizacao, enderecoPessoa);
        assertEquals("Bruno Mundim", pessoa.getNome());
        assertEquals("123.456.789-10", pessoa.getCPF());
        assertEquals(LocalDate.of(2001, 1, 1), pessoa.getDataNascimento());
    }

    @Test
    void lancarExceptionQuandoChamarApiCorreios(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Uberlândia", "Umuarama", "Rua Doutor Luiz", "1420", "Apto. 102 Bloco A");

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalArgumentException.class);

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                cadastrarPessoa.CadastrarPessoa("Bruno Mundim", "123.456.789-10", LocalDate.of(2001, 1, 1), "38405-327"));
    }

}
