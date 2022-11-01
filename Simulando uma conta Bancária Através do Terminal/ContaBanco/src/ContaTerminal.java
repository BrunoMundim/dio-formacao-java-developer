public class ContaTerminal {
    
    private int agencia;
    private String conta;
    private String nomeCliente;
    private double saldo;

    public void novaConta(){
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %2.2f já está disponível para saque", this.nomeCliente, this.agencia, this.conta, this.saldo));
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
        System.out.println(String.format("Seu novo saldo é: R$ %2.2f", this.saldo));
    }

    public void sacar(double valorSaque) {
        if(valorSaque > saldo) System.out.println("Saldo insuficiente!");
        else{
            this.saldo -= valorSaque;
            System.out.println(String.format("Seu novo saldo é: R$ %2.2f", this.saldo));
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
