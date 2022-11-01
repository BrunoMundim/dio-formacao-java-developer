import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner ler = new Scanner(System.in);


        System.out.print("Por favor, digite o número da agência:  ");
        contaTerminal.setAgencia(ler.nextInt());

        System.out.print("Por favor, digite o número da conta: ");
        contaTerminal.setConta(ler.next());
        ler.nextLine();

        System.out.print("Por favor, digite o seu nome completo:  ");
        contaTerminal.setNomeCliente(ler.nextLine());

        contaTerminal.setSaldo(0d);

        contaTerminal.novaConta();
        acoesCliente(contaTerminal);
    }

    public static void acoesCliente(ContaTerminal contaTerminal){
        Scanner ler = new Scanner(System.in);
        int decisao = 0;
        while(decisao != -1){
            System.out.println("O que deseja fazer?");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("3: Fechar");

            decisao = ler.nextInt();
            switch (decisao){
                case 1:
                    System.out.print("Valor a ser depositado: ");
                    double valorDeposito = ler.nextDouble();
                    contaTerminal.depositar(valorDeposito);
                    System.out.println("Deseja fazer outra ação? (1 - Sim, 2 - Não)");
                    if(ler.nextInt() == 1) decisao = 0;
                    else decisao = -1;
                    break;
                case 2:
                    System.out.print("Valor a ser sacado: ");
                    double valorSaque = ler.nextDouble();
                    contaTerminal.sacar(valorSaque);
                    System.out.println("Deseja fazer outra ação? (1 - Sim, 2 - Não)");
                    if(ler.nextInt() == 1) decisao = 0;
                    else decisao = -1;
                    break;
                default:
                    System.out.println("Obrigado por escolher nosso banco!");
                    decisao = -1;
                    break;
            }
        }
    }

}
