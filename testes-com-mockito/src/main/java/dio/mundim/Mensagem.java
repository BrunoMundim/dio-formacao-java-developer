package dio.mundim;

import lombok.Data;

import java.util.UUID;

@Data
public class Mensagem {

    private String id;

    private String mensagem;

    public Mensagem(final String mensagem) {
        this.id = UUID.randomUUID().toString();
        this.mensagem = mensagem;
    }

}
