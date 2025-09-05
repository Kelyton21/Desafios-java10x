package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular, TipoConta tipoConta) {
        super(titular, tipoConta);
    }

    public ContaPoupanca(String titular, double saldo, TipoConta tipoConta) {
        super(titular, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        double taxa = (valor * 3)/100;
        saldo += valor - taxa;
        System.out.println("Valor depositado");
        consultarSaldo();
    }
}
