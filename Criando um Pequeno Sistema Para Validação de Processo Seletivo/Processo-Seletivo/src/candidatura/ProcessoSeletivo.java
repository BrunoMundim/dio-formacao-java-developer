package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String [] candidatos = {"BRUNO", "JANE", "EDUARDA", "ERALDO", "OLIVIA", "MARCO", "ELIAS", "FLAUSINO", "JAMAL", "GIOVANNA"};

        System.out.println("Processo Seletivo\n");
        String [] selecionados = selecaoCandidatos(candidatos, 5, 2000.0);
        imprimirSelecionados(selecionados);
        ligarParaSelecionados(selecionados);
    }

    static String[] selecaoCandidatos(String [] listaCandidatos, int quantidadeVagas, double salarioBase) {
        String [] listaCandidatosSelecionados = new String[quantidadeVagas];

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatosSelecionados < quantidadeVagas && candidatoAtual < listaCandidatos.length){
            String candidato = listaCandidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(String.format("Candidato(a) %s solicitou esse valor de salário: %2.2f", candidato, salarioPretendido));

            if(salarioBase >= salarioPretendido){
                System.out.println(candidato + " FOI selecionado para a vaga!\n");
                listaCandidatosSelecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            } else {
                System.out.println(candidato + " NÃO FOI selecionado para a vaga!\n");
            }

            candidatoAtual++;
        }

        if(candidatosSelecionados < quantidadeVagas)
            System.out.println("Candidatos insuficientes. Total selecionados: " + candidatosSelecionados);

        return listaCandidatosSelecionados;
    }

    static void ligarParaSelecionados(String [] selecionados){
        for(String selecionado : selecionados){
            if(selecionado == null) continue;
            for(int i = 0; i < 3; i++){
                if(atender()){
                    System.out.println("\nConseguimos contato com " + selecionado + " após " + (i+1) + " tentativa(s)");
                    break;
                }
                if(!atender() && i == 2){
                    System.out.println("\nNão conseguimos contato com " + selecionado);
                }
            }
        }
    }

    static void imprimirSelecionados(String [] listaCandidatos) {
        System.out.println("Os candidatos selecionados foram: ");

        for(String candidato : listaCandidatos){
            if(candidato == null) continue;
            System.out.println(candidato);
        }
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

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

}
