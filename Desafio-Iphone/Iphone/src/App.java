import model.Iphone;

public class App {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        // Internet
        System.out.println("\nInternet");
        iphone.exibirPagina("youtube.com");
        iphone.atualizarPagina();

        // Ipod
        System.out.println("\nIpod");
        iphone.selecionarMusica("Junho de 64");
        iphone.tocar();
        iphone.pausar();

        // Telefone
        System.out.println("\nTelefone");
        iphone.ligar(3499998888l);
        iphone.atender();
    }

}
