package dio.mundim.junit.afterBefore;

import static org.junit.jupiter.api.Assertions.*;

import dio.mundim.junit.GerenciadorConexaoBancoDados;
import org.junit.jupiter.api.*;

public class ConsultarDadosPessoaTest {

    @BeforeAll
    static void configuraConexao(){
        GerenciadorConexaoBancoDados.iniciarConexao();
    }
    @BeforeEach
    void insereDadoParaTeste(){
        GerenciadorConexaoBancoDados.insereDados();
    }

    @Test
    void validarDadosRetorno(){
        assertTrue(true);
    }

    @Test
    void validarDadosRetorno2(){
        assertFalse(false);
    }

    @AfterEach
    void removeDadoParaTeste(){
        GerenciadorConexaoBancoDados.removeDados();
    }
    @AfterAll
    static void finalizarConexao(){
        GerenciadorConexaoBancoDados.finalizarConexao();
    }

}
