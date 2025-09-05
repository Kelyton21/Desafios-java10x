package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular, TipoConta tipoConta) {
        super(titular, tipoConta);
    }

    public ContaCorrente(String titular, double saldo, TipoConta tipoConta) {
        super(titular, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        double taxa = (valor * 2)/100;
        saldo += valor - taxa;
        System.out.println("Valor depositado");
        consultarSaldo();
    }

}
