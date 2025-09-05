package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta{
    protected String titular;
    protected double saldo;
    protected TipoConta tipoConta;

    public ContaBancaria(String titular,TipoConta tipoConta) {
        this.titular = titular;
        this.tipoConta = tipoConta;
    }

    public ContaBancaria(String titular, double saldo, TipoConta tipoConta) {
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    @Override
    public abstract void depositar(double valor);

    public void depositar(ContaBancaria obj, double valor){
        obj.depositar(valor);
        this.sacar(valor);
        System.out.println("Valor depositado na conta: " + obj.titular);
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo){
            System.out.println("O valor informado é maior que o saldo presente.");
            return;
        }
        saldo -= valor;
        consultarSaldo();
    }

    @Override
    public String toString(){
        return "Nome do Titular:" + titular + "\nSaldo: " + saldo + "\nTipo da conta: " + tipoConta;
    }
}
