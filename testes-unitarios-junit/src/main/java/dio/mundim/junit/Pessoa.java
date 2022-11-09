package dio.mundim.junit;

import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
public class Pessoa {

    private String nome;
    private LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(this.dataDeNascimento, LocalDate.now());
    }

    public boolean ehMaiorDeIdade(){
        return this.getIdade() >= 18;
    }

}
