package dio.mundim;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class CadastrarPessoa {

    private ApiDosCorreios apiDosCorreios;

    public Pessoa CadastrarPessoa(String nome, String documento, LocalDate dataNascimento, String cep){
        Pessoa pessoa = new Pessoa(nome, documento, dataNascimento);
        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep(cep);
        pessoa.adicionaDadosDeEndereco(dadosLocalizacao);
        return pessoa;
    }

}
