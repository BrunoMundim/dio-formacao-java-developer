import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int primeiro = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int segundo = terminal.nextInt();

        try {
            contar(primeiro, segundo);
        } catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if(primeiroParametro > segundoParametro)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = segundoParametro - primeiroParametro;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
