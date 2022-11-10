package dio.mundim;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTest {

    @Spy
    EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoDaClasse(){
        Mockito.verifyNoInteractions(enviarMensagem);

        Mensagem mensagem = new Mensagem("Hello World!");
        enviarMensagem.adicionarMensagem(mensagem);
        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);

        assertFalse(enviarMensagem.getMensagens().isEmpty());
    }

}