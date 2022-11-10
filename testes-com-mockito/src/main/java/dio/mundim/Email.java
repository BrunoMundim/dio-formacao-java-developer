package dio.mundim;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Email {

    private String enderecoEmail;

    private String mensagem;

    private Formato formato;
}
