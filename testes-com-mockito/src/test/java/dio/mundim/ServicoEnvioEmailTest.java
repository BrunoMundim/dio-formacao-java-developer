package dio.mundim;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTest {

    @Mock
    PlataformaEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servicoEnvioEmail;

    @Captor
    ArgumentCaptor<Email> captorEmail;

    @Test
    void validarDadosEnviadosPara(){

        String enderecoEmail = "usuario@teste.com.br";
        String mensagem = "Hello World Test Message";
        boolean ehFormatoHtml = false;

        servicoEnvioEmail.enviaEmail(enderecoEmail, mensagem, ehFormatoHtml);

        Mockito.verify(plataforma).enviaEmail(captorEmail.capture());

        Email emailCapturado = captorEmail.getValue();

        Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
    }


}
