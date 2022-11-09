package dio.mundim.junit;

import lombok.Data;

@Data
public class Conta {

    private String titular;
    private double saldo;
    private int numeroConta;

    public Conta(String titular, double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }
}
