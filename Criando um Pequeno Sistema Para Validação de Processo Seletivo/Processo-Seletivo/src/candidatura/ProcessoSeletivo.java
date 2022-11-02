package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"BRUNO", "JANE", "EDUARDA", "ERALDO", "OLIVIA", "MARCO", "GABRIEL", "LUIS GUSTAVO", "RODRIGO", "RODOLFO", "SARA", "REBECA", "GIOVANNA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(String.format("O candidato %s solicitou esse valor de salário: %2.2f", candidato, salarioPretendido));

            if(salarioBase >= salarioPretendido){
                System.out.println(candidato + " FOI selecionado para a vaga!\n");
                candidatosSelecionados++;
            } else {
                System.out.println(candidato + " NÃO FOI selecionado para a vaga!\n");
            }

            candidatoAtual++;
        }

        if(candidatosSelecionados < 5)
            System.out.println("Candidatos insuficientes. Total selecionados: " + candidatosSelecionados);

    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

}
