package model;

import interfaces.Internet;
import interfaces.Ipod;
import interfaces.Telefone;

public class Iphone implements Ipod, Telefone, Internet {

    private String paginaAtual;
    private String musicaAtual;

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        paginaAtual = url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
        System.out.println("Exibindo página: " + paginaAtual);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        musicaAtual = musica;
    }

    @Override
    public void ligar(Long telefone) {
        System.out.println("Ligando para: " + telefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo correio de voz");
    }
}
